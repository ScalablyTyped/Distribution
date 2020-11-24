package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeListNode extends js.Object {
  
  /**
    * [descr:dxTreeListNode.children]
    */
  var children: js.UndefOr[js.Array[dxTreeListNode]] = js.native
  
  /**
    * [descr:dxTreeListNode.data]
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxTreeListNode.hasChildren]
    */
  var hasChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeListNode.key]
    */
  var key: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxTreeListNode.level]
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxTreeListNode.parent]
    */
  var parent: js.UndefOr[dxTreeListNode] = js.native
  
  /**
    * [descr:dxTreeListNode.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object dxTreeListNode {
  
  @scala.inline
  def apply(): dxTreeListNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListNode]
  }
  
  @scala.inline
  implicit class dxTreeListNodeOps[Self <: dxTreeListNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: dxTreeListNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[dxTreeListNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHasChildren(value: Boolean): Self = this.set("hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasChildren: Self = this.set("hasChildren", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setParent(value: dxTreeListNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
