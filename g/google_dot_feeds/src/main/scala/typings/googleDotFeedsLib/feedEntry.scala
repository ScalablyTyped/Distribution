package typings
package googleDotFeedsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait feedEntry extends js.Object {
  var categories: js.Array[java.lang.String]
  var content: java.lang.String
  var contentSnippet: java.lang.String
  var link: java.lang.String
  var mediaGroup: js.Array[MediaGroup]
  var publishedDate: java.lang.String
  var title: java.lang.String
}

object feedEntry {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    content: java.lang.String,
    contentSnippet: java.lang.String,
    link: java.lang.String,
    mediaGroup: js.Array[MediaGroup],
    publishedDate: java.lang.String,
    title: java.lang.String
  ): feedEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("contentSnippet")(contentSnippet)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("mediaGroup")(mediaGroup)
    __obj.updateDynamic("publishedDate")(publishedDate)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[feedEntry]
  }
}

