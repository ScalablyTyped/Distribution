package typings
package feedmeLib.feedmeMod.FeedMeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var author: java.lang.String
  var categories: js.Array[java.lang.String]
  var comments: java.lang.String
  var date: java.lang.String
  var description: java.lang.String
  var enclosures: js.Array[java.lang.String]
  var guid: java.lang.String | Guid
  var image: Image
  var link: java.lang.String
  var origlink: java.lang.String
  var pubdate: java.lang.String
  var summary: java.lang.String
  var title: java.lang.String
}

object Item {
  @scala.inline
  def apply(
    author: java.lang.String,
    categories: js.Array[java.lang.String],
    comments: java.lang.String,
    date: java.lang.String,
    description: java.lang.String,
    enclosures: js.Array[java.lang.String],
    guid: java.lang.String | Guid,
    image: Image,
    link: java.lang.String,
    origlink: java.lang.String,
    pubdate: java.lang.String,
    summary: java.lang.String,
    title: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("enclosures")(enclosures)
    __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("origlink")(origlink)
    __obj.updateDynamic("pubdate")(pubdate)
    __obj.updateDynamic("summary")(summary)
    __obj.updateDynamic("title")(title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Item]
  }
}

