package com.akirachix.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class AuthorAdapter(val author: List<String>):RecyclerView.Adapter<>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Authors {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_reader_app,parent, false)
        return
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: Authors, position: Int) {
      val Author =
    }


}

class AppViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
     var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvPublicationdate = itemView.findViewById<TextView>(R.id.tvPublicationdate)
    var tvArticle = itemView.findViewById<TextView>(R.id.tvArticlePreview)

}