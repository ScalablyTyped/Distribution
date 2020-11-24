package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeViewItem extends CollectionWidgetItem {
  
  /**
    * [descr:dxTreeViewItem.expanded]
    */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeViewItem.hasItems]
    */
  var hasItems: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeViewItem.icon]
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxTreeViewItem.items]
    */
  var items: js.UndefOr[js.Array[dxTreeViewItem]] = js.native
  
  /**
    * [descr:dxTreeViewItem.parentId]
    */
  var parentId: js.UndefOr[Double | String] = js.native
  
  /**
    * [descr:dxTreeViewItem.selected]
    */
  var selected: js.UndefOr[Boolean] = js.native
}
object dxTreeViewItem {
  
  @scala.inline
  def apply(): dxTreeViewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeViewItem]
  }
  
  @scala.inline
  implicit class dxTreeViewItemOps[Self <: dxTreeViewItem] (val x: Self) extends AnyVal {
    
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setHasItems(value: Boolean): Self = this.set("hasItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasItems: Self = this.set("hasItems", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: dxTreeViewItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[dxTreeViewItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setParentId(value: Double | String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
