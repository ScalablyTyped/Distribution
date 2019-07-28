package typings.feedme.feedmeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta
  extends /* key */ StringDictionary[js.Any] {
  var author: String
  var categories: js.Array[String]
  var copyright: String
  var date: String
  var description: String
  var favicon: String
  var generator: String
  var image: Image
  var language: String
  var lastbuilddate: String
  var link: String
  var pubdate: String
  // "#version": string;
  var title: String
  // "#ns": NS[];
  var `type`: Type
  var xmlurl: String
}

object Meta {
  @scala.inline
  def apply(
    author: String,
    categories: js.Array[String],
    copyright: String,
    date: String,
    description: String,
    favicon: String,
    generator: String,
    image: Image,
    language: String,
    lastbuilddate: String,
    link: String,
    pubdate: String,
    title: String,
    `type`: Type,
    xmlurl: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Meta = {
    val __obj = js.Dynamic.literal(author = author, categories = categories, copyright = copyright, date = date, description = description, favicon = favicon, generator = generator, image = image, language = language, lastbuilddate = lastbuilddate, link = link, pubdate = pubdate, title = title, xmlurl = xmlurl)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Meta]
  }
}

