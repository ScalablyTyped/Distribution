package typings
package feedmeLib.feedmeMod.FeedMeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends Meta {
  var items: js.Array[Item]
}

object Document {
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
    items: js.Array[Item],
    language: java.lang.String,
    lastbuilddate: java.lang.String,
    link: java.lang.String,
    pubdate: java.lang.String,
    title: java.lang.String,
    `type`: Type,
    xmlurl: java.lang.String
  ): Document = {
    val __obj = js.Dynamic.literal(author = author, categories = categories, copyright = copyright, date = date, description = description, favicon = favicon, generator = generator, image = image, items = items, language = language, lastbuilddate = lastbuilddate, link = link, pubdate = pubdate, title = title, xmlurl = xmlurl)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Document]
  }
}

