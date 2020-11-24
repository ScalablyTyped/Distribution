package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterItem extends js.Object {
  
  var caption: js.UndefOr[String] = js.native
  
  var hierarchyName: js.UndefOr[String] = js.native
  
  var uniqueName: js.UndefOr[String] = js.native
}
object FilterItem {
  
  @scala.inline
  def apply(): FilterItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterItem]
  }
  
  @scala.inline
  implicit class FilterItemOps[Self <: FilterItem] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setHierarchyName(value: String): Self = this.set("hierarchyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchyName: Self = this.set("hierarchyName", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueName: Self = this.set("uniqueName", js.undefined)
  }
}
