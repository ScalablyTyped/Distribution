package typings
package feedparserLib.feedparserMod.FeedParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var author: java.lang.String
  var categories: js.Array[java.lang.String]
  var comments: java.lang.String
  var date: stdLib.Date | scala.Null
  var description: java.lang.String
  var enclosures: js.Array[java.lang.String]
  var guid: java.lang.String
  var image: Image
  var link: java.lang.String
  var meta: Meta
  var origlink: java.lang.String
  var pubdate: stdLib.Date | scala.Null
  var summary: java.lang.String
  var title: java.lang.String
}

object Item {
  @scala.inline
  def apply(
    author: java.lang.String,
    categories: js.Array[java.lang.String],
    comments: java.lang.String,
    description: java.lang.String,
    enclosures: js.Array[java.lang.String],
    guid: java.lang.String,
    image: Image,
    link: java.lang.String,
    meta: Meta,
    origlink: java.lang.String,
    summary: java.lang.String,
    title: java.lang.String,
    date: stdLib.Date = null,
    pubdate: stdLib.Date = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("enclosures")(enclosures)
    __obj.updateDynamic("guid")(guid)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("origlink")(origlink)
    __obj.updateDynamic("summary")(summary)
    __obj.updateDynamic("title")(title)
    if (date != null) __obj.updateDynamic("date")(date)
    if (pubdate != null) __obj.updateDynamic("pubdate")(pubdate)
    __obj.asInstanceOf[Item]
  }
}

