package typings.feedparser.mod

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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], origlink = origlink.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], pubdate = pubdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

