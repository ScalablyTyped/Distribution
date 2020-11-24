package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeViewNode extends js.Object {
  
  /**
    * [descr:dxTreeViewNode.children]
    */
  var children: js.UndefOr[js.Array[dxTreeViewNode]] = js.native
  
  /**
    * [descr:dxTreeViewNode.disabled]
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeViewNode.expanded]
    */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeViewNode.itemData]
    */
  var itemData: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxTreeViewNode.key]
    */
  var key: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxTreeViewNode.parent]
    */
  var parent: js.UndefOr[dxTreeViewNode] = js.native
  
  /**
    * [descr:dxTreeViewNode.selected]
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeViewNode.text]
    */
  var text: js.UndefOr[String] = js.native
}
object dxTreeViewNode {
  
  @scala.inline
  def apply(): dxTreeViewNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeViewNode]
  }
  
  @scala.inline
  implicit class dxTreeViewNodeOps[Self <: dxTreeViewNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: dxTreeViewNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[dxTreeViewNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setItemData(value: js.Any): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemData: Self = this.set("itemData", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setParent(value: dxTreeViewNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
