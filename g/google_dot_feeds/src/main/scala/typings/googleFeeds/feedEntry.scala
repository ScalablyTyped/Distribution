package typings.googleFeeds

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
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentSnippet = contentSnippet.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], mediaGroup = mediaGroup.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[feedEntry]
  }
}

