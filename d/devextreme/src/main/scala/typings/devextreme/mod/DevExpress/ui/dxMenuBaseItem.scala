package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMenuBaseItem extends CollectionWidgetItem {
  
  /**
    * [descr:dxMenuBaseItem.beginGroup]
    */
  var beginGroup: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxMenuBaseItem.closeMenuOnClick]
    */
  var closeMenuOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxMenuBaseItem.icon]
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxMenuBaseItem.items]
    */
  var items: js.UndefOr[js.Array[dxMenuBaseItem]] = js.native
  
  /**
    * [descr:dxMenuBaseItem.selectable]
    */
  var selectable: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxMenuBaseItem.selected]
    */
  var selected: js.UndefOr[Boolean] = js.native
}
object dxMenuBaseItem {
  
  @scala.inline
  def apply(): dxMenuBaseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMenuBaseItem]
  }
  
  @scala.inline
  implicit class dxMenuBaseItemOps[Self <: dxMenuBaseItem] (val x: Self) extends AnyVal {
    
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
    def setBeginGroup(value: Boolean): Self = this.set("beginGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginGroup: Self = this.set("beginGroup", js.undefined)
    
    @scala.inline
    def setCloseMenuOnClick(value: Boolean): Self = this.set("closeMenuOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseMenuOnClick: Self = this.set("closeMenuOnClick", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: dxMenuBaseItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[dxMenuBaseItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
