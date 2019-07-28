package typings.googleDotFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait findEntry extends js.Object {
  var contentSnippet: String
  var link: String
  var title: String
  var url: String
}

object findEntry {
  @scala.inline
  def apply(contentSnippet: String, link: String, title: String, url: String): findEntry = {
    val __obj = js.Dynamic.literal(contentSnippet = contentSnippet, link = link, title = title, url = url)
  
    __obj.asInstanceOf[findEntry]
  }
}

