package typings.feedme.feedmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends Meta {
  var items: js.Array[Item]
}

object Document {
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
    items: js.Array[Item],
    language: String,
    lastbuilddate: String,
    link: String,
    pubdate: String,
    title: String,
    `type`: Type,
    xmlurl: String
  ): Document = {
    val __obj = js.Dynamic.literal(author = author, categories = categories, copyright = copyright, date = date, description = description, favicon = favicon, generator = generator, image = image, items = items, language = language, lastbuilddate = lastbuilddate, link = link, pubdate = pubdate, title = title, xmlurl = xmlurl)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Document]
  }
}

