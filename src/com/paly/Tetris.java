package com.paly;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
Java com.paly.Tetris game clone

Author: Jan Bodnar
Website: http://zetcode.com
 */
public class Tetris extends JFrame {

    private JLabel statusbar;

    public Tetris() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        Board board = new Board(this);
        add(board);
        board.start();

        setTitle("com.paly.Tetris");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public JLabel getStatusBar() {

        return statusbar;
    }

    public static void main(String[] args) {
//
//        EventQueue.invokeLater(() -> {
//
//            Tetris game = new Tetris();
//            game.setVisible(true);
//        });
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Tetris game = new Tetris();
                game.setVisible(true);
            }
        });
    }
}