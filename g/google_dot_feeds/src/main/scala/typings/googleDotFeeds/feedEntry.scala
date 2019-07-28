package typings.googleDotFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait feedEntry extends js.Object {
  var categories: js.Array[String]
  var content: String
  var contentSnippet: String
  var link: String
  var mediaGroup: js.Array[MediaGroup]
  var publishedDate: String
  var title: String
}

object feedEntry {
  @scala.inline
  def apply(
    categories: js.Array[String],
    content: String,
    contentSnippet: String,
    link: String,
    mediaGroup: js.Array[MediaGroup],
    publishedDate: String,
    title: String
  ): feedEntry = {
    val __obj = js.Dynamic.literal(categories = categories, content = content, contentSnippet = contentSnippet, link = link, mediaGroup = mediaGroup, publishedDate = publishedDate, title = title)
  
    __obj.asInstanceOf[feedEntry]
  }
}

