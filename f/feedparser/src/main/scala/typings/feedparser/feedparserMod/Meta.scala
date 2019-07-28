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
    val __obj = js.Dynamic.literal(author = author, categories = categories, copyright = copyright, description = description, favicon = favicon, generator = generator, image = image, language = language, link = link, title = title, xmlurl = xmlurl)
    __obj.updateDynamic("#ns")(`#ns`)
    __obj.updateDynamic("#type")(`#type`)
    __obj.updateDynamic("#version")(`#version`)
    if (date != null) __obj.updateDynamic("date")(date)
    if (pubdate != null) __obj.updateDynamic("pubdate")(pubdate)
    __obj.asInstanceOf[Meta]
  }
}

