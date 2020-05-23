package typings.feedme.mod

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
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Meta = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastbuilddate = lastbuilddate.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], pubdate = pubdate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xmlurl = xmlurl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Meta]
  }
}

