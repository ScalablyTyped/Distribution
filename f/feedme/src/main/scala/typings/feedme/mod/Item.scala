package typings.feedme.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item
  extends /* key */ StringDictionary[js.Any] {
  
  var author: String = js.native
  
  var categories: js.Array[String] = js.native
  
  var comments: String = js.native
  
  var date: String = js.native
  
  var description: String = js.native
  
  var enclosures: js.Array[String] = js.native
  
  var guid: String | Guid = js.native
  
  var image: Image = js.native
  
  var link: String = js.native
  
  var origlink: String = js.native
  
  var pubdate: String = js.native
  
  var summary: String = js.native
  
  var title: String = js.native
}
object Item {
  
  @scala.inline
  def apply(
    author: String,
    categories: js.Array[String],
    comments: String,
    date: String,
    description: String,
    enclosures: js.Array[String],
    guid: String | Guid,
    image: Image,
    link: String,
    origlink: String,
    pubdate: String,
    summary: String,
    title: String
  ): Item = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enclosures = enclosures.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], origlink = origlink.asInstanceOf[js.Any], pubdate = pubdate.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclosuresVarargs(value: String*): Self = this.set("enclosures", js.Array(value :_*))
    
    @scala.inline
    def setEnclosures(value: js.Array[String]): Self = this.set("enclosures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String | Guid): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriglink(value: String): Self = this.set("origlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubdate(value: String): Self = this.set("pubdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
