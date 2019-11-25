package typings.feedparser.feedparserMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var `#ns`: js.Array[NS]
  var `#type`: Type
  var `#version`: String
  var author: String
  var categories: js.Array[String]
  var copyright: String
  var date: Date | Null
  var description: String
  var favicon: String
  var generator: String
  var image: Image
  var language: String
  var link: String
  var pubdate: Date | Null
  var title: String
  var xmlurl: String
}

object Meta {
  @scala.inline
  def apply(
    `#ns`: js.Array[NS],
    `#type`: Type,
    `#version`: String,
    author: String,
    categories: js.Array[String],
    copyright: String,
    description: String,
    favicon: String,
    generator: String,
    image: Image,
    language: String,
    link: String,
    title: String,
    xmlurl: String,
    date: Date = null,
    pubdate: Date = null
  ): Meta = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xmlurl = xmlurl.asInstanceOf[js.Any])
    __obj.updateDynamic("#ns")(`#ns`.asInstanceOf[js.Any])
    __obj.updateDynamic("#type")(`#type`.asInstanceOf[js.Any])
    __obj.updateDynamic("#version")(`#version`.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (pubdate != null) __obj.updateDynamic("pubdate")(pubdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

