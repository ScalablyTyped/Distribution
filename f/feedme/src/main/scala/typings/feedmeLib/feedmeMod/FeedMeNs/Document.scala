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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("copyright")(copyright)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("favicon")(favicon)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("lastbuilddate")(lastbuilddate)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("pubdate")(pubdate)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("xmlurl")(xmlurl)
    __obj.asInstanceOf[Document]
  }
}

