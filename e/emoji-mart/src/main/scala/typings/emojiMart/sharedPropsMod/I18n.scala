package typings.emojiMart.sharedPropsMod

import typings.emojiMart.anon.RecordCategoryNamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18n extends js.Object {
  
  var categories: RecordCategoryNamestring = js.native
  
  var notfound: String = js.native
  
  var search: String = js.native
  
  var skintext: String = js.native
}
object I18n {
  
  @scala.inline
  def apply(categories: RecordCategoryNamestring, notfound: String, search: String, skintext: String): I18n = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], notfound = notfound.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skintext = skintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
  
  @scala.inline
  implicit class I18nOps[Self <: I18n] (val x: Self) extends AnyVal {
    
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
    def setCategories(value: RecordCategoryNamestring): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotfound(value: String): Self = this.set("notfound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkintext(value: String): Self = this.set("skintext", value.asInstanceOf[js.Any])
  }
}
