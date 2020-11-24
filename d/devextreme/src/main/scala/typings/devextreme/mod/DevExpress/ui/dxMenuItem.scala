package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMenuItem extends dxMenuBaseItem {
  
  /**
    * [descr:dxMenuItem.items]
    */
  @JSName("items")
  var items_dxMenuItem: js.UndefOr[js.Array[dxMenuItem]] = js.native
}
object dxMenuItem {
  
  @scala.inline
  def apply(): dxMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMenuItem]
  }
  
  @scala.inline
  implicit class dxMenuItemOps[Self <: dxMenuItem] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: dxMenuItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[dxMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
