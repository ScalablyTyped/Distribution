package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridIcons extends js.Object {
  
  var collapseGroup: js.UndefOr[String] = js.native
  
  var collapseRow: js.UndefOr[String] = js.native
  
  var expandGroup: js.UndefOr[String] = js.native
  
  var expandRow: js.UndefOr[String] = js.native
}
object GridIcons {
  
  @scala.inline
  def apply(): GridIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridIcons]
  }
  
  @scala.inline
  implicit class GridIconsOps[Self <: GridIcons] (val x: Self) extends AnyVal {
    
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
    def setCollapseGroup(value: String): Self = this.set("collapseGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseGroup: Self = this.set("collapseGroup", js.undefined)
    
    @scala.inline
    def setCollapseRow(value: String): Self = this.set("collapseRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseRow: Self = this.set("collapseRow", js.undefined)
    
    @scala.inline
    def setExpandGroup(value: String): Self = this.set("expandGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandGroup: Self = this.set("expandGroup", js.undefined)
    
    @scala.inline
    def setExpandRow(value: String): Self = this.set("expandRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandRow: Self = this.set("expandRow", js.undefined)
  }
}
