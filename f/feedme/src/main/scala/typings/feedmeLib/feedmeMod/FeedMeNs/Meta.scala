package typings
package feedmeLib.feedmeMod.FeedMeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var author: java.lang.String
  var categories: js.Array[java.lang.String]
  var copyright: java.lang.String
  var date: java.lang.String
  var description: java.lang.String
  var favicon: java.lang.String
  var generator: java.lang.String
  var image: Image
  var language: java.lang.String
  var lastbuilddate: java.lang.String
  var link: java.lang.String
  var pubdate: java.lang.String
  // "#version": string;
  var title: java.lang.String
  // "#ns": NS[];
  var `type`: Type
  var xmlurl: java.lang.String
}

object Meta {
  @scala.inline
  def apply(
    author: java.lang.String,
    categories: js.Array[java.lang.String],
    copyright: java.lang.String,
    date: java.lang.String,
    description: java.lang.String,
    favicon: java.lang.String,
    generator: java.lang.String,
    image: Image,
    language: java.lang.String,
    lastbuilddate: java.lang.String,
    link: java.lang.String,
    pubdate: java.lang.String,
    title: java.lang.String,
    `type`: Type,
    xmlurl: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Meta = {
    val __obj = js.Dynamic.literal(author = author, categories = categories, copyright = copyright, date = date, description = description, favicon = favicon, generator = generator, image = image, language = language, lastbuilddate = lastbuilddate, link = link, pubdate = pubdate, title = title, xmlurl = xmlurl)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Meta]
  }
}

