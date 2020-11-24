package typings.googleapis.anon

import typings.googleapis.bloggerV3Mod.bloggerV3.SchemaComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsSelfLink extends js.Object {
  
  var items: js.UndefOr[js.Array[SchemaComment]] = js.native
  
  var selfLink: js.UndefOr[String] = js.native
  
  var totalItems: js.UndefOr[String] = js.native
}
object ItemsSelfLink {
  
  @scala.inline
  def apply(): ItemsSelfLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsSelfLink]
  }
  
  @scala.inline
  implicit class ItemsSelfLinkOps[Self <: ItemsSelfLink] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: SchemaComment*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaComment]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setTotalItems(value: String): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
}
