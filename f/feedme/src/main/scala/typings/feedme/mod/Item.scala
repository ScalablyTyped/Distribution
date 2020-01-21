package typings.feedme.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item
  extends /* key */ StringDictionary[js.Any] {
  var author: String
  var categories: js.Array[String]
  var comments: String
  var date: String
  var description: String
  var enclosures: js.Array[String]
  var guid: String | Guid
  var image: Image
  var link: String
  var origlink: String
  var pubdate: String
  var summary: String
  var title: String
}

object Item {
  @scala.inline
  def apply(
    author: String,
    categories: js.Array[String],
    comments: String,
    date: String,
    description: String,
    enclosures: js.Array[String],
    guid: String | Guid,
    image: Image,
    link: String,
    origlink: String,
    pubdate: String,
    summary: String,
    title: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Item = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], origlink = origlink.asInstanceOf[js.Any], pubdate = pubdate.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Item]
  }
}

