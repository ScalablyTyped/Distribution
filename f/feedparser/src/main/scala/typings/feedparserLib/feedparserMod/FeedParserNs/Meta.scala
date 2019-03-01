package typings
package feedparserLib.feedparserMod.FeedParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var `#ns`: js.Array[NS]
  var `#type`: Type
  var `#version`: java.lang.String
  var author: java.lang.String
  var categories: js.Array[java.lang.String]
  var copyright: java.lang.String
  var date: stdLib.Date | scala.Null
  var description: java.lang.String
  var favicon: java.lang.String
  var generator: java.lang.String
  var image: Image
  var language: java.lang.String
  var link: java.lang.String
  var pubdate: stdLib.Date | scala.Null
  var title: java.lang.String
  var xmlurl: java.lang.String
}

object Meta {
  @scala.inline
  def apply(
    `#ns`: js.Array[NS],
    `#type`: Type,
    `#version`: java.lang.String,
    author: java.lang.String,
    categories: js.Array[java.lang.String],
    copyright: java.lang.String,
    description: java.lang.String,
    favicon: java.lang.String,
    generator: java.lang.String,
    image: Image,
    language: java.lang.String,
    link: java.lang.String,
    title: java.lang.String,
    xmlurl: java.lang.String,
    date: stdLib.Date = null,
    pubdate: stdLib.Date = null
  ): Meta = {
    val __obj = js.Dynamic.literal(`#ns` = `#ns`, `#type` = `#type`, `#version` = `#version`)
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("copyright")(copyright)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("favicon")(favicon)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("xmlurl")(xmlurl)
    if (date != null) __obj.updateDynamic("date")(date)
    if (pubdate != null) __obj.updateDynamic("pubdate")(pubdate)
    __obj.asInstanceOf[Meta]
  }
}

