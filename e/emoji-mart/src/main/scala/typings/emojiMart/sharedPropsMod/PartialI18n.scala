package typings.emojiMart.sharedPropsMod

import typings.emojiMart.anon.PartialRecordCategoryName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n, 'search' | 'notfound'> & {  categories :std.Partial<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n['categories']>}> */
@js.native
trait PartialI18n extends js.Object {
  
  var categories: js.UndefOr[PartialRecordCategoryName] = js.native
  
  var notfound: js.UndefOr[String] = js.native
  
  var search: js.UndefOr[String] = js.native
}
object PartialI18n {
  
  @scala.inline
  def apply(): PartialI18n = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialI18n]
  }
  
  @scala.inline
  implicit class PartialI18nOps[Self <: PartialI18n] (val x: Self) extends AnyVal {
    
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
    def setCategories(value: PartialRecordCategoryName): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setNotfound(value: String): Self = this.set("notfound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotfound: Self = this.set("notfound", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}
