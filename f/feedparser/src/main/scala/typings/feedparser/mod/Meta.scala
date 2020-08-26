package typings.feedparser.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta extends js.Object {
  @JSName("#ns")
  var Numbersignns: js.Array[NS] = js.native
  @JSName("#type")
  var Numbersigntype: Type = js.native
  @JSName("#version")
  var Numbersignversion: String = js.native
  var author: String = js.native
  var categories: js.Array[String] = js.native
  var copyright: String = js.native
  var date: Date | Null = js.native
  var description: String = js.native
  var favicon: String = js.native
  var generator: String = js.native
  var image: Image = js.native
  var language: String = js.native
  var link: String = js.native
  var pubdate: Date | Null = js.native
  var title: String = js.native
  var xmlurl: String = js.native
}

object Meta {
  @scala.inline
  def apply(
    Numbersignns: js.Array[NS],
    Numbersigntype: Type,
    Numbersignversion: String,
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
    xmlurl: String
  ): Meta = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xmlurl = xmlurl.asInstanceOf[js.Any])
    __obj.updateDynamic("#ns")(Numbersignns.asInstanceOf[js.Any])
    __obj.updateDynamic("#type")(Numbersigntype.asInstanceOf[js.Any])
    __obj.updateDynamic("#version")(Numbersignversion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNumbersignnsVarargs(value: NS*): Self = this.set("#ns", js.Array(value :_*))
    @scala.inline
    def setNumbersignns(value: js.Array[NS]): Self = this.set("#ns", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumbersigntype(value: Type): Self = this.set("#type", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumbersignversion(value: String): Self = this.set("#version", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFavicon(value: String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerator(value: String): Self = this.set("generator", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlurl(value: String): Self = this.set("xmlurl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateNull: Self = this.set("date", null)
    @scala.inline
    def setPubdate(value: Date): Self = this.set("pubdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPubdateNull: Self = this.set("pubdate", null)
  }
  
}

