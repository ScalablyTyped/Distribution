package typings.feedparser.feedparserMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var author: String
  var categories: js.Array[String]
  var comments: String
  var date: Date | Null
  var description: String
  var enclosures: js.Array[Enclosure]
  var guid: String
  var image: Image
  var link: String
  var meta: Meta
  var origlink: String
  var pubdate: Date | Null
  var summary: String
  var title: String
}

object Item {
  @scala.inline
  def apply(
    author: String,
    categories: js.Array[String],
    comments: String,
    description: String,
    enclosures: js.Array[Enclosure],
    guid: String,
    image: Image,
    link: String,
    meta: Meta,
    origlink: String,
    summary: String,
    title: String,
    date: Date = null,
    pubdate: Date = null
  ): Item = {
    val __obj = js.Dynamic.literal(author = author, categories = categories, comments = comments, description = description, enclosures = enclosures, guid = guid, image = image, link = link, meta = meta, origlink = origlink, summary = summary, title = title)
    if (date != null) __obj.updateDynamic("date")(date)
    if (pubdate != null) __obj.updateDynamic("pubdate")(pubdate)
    __obj.asInstanceOf[Item]
  }
}

