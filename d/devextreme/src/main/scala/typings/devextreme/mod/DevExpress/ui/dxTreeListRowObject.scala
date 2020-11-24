package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeListRowObject extends js.Object {
  
  /**
    * [descr:dxTreeListRowObject.isEditing]
    */
  var isEditing: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeListRowObject.isExpanded]
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeListRowObject.isNewRow]
    */
  var isNewRow: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeListRowObject.isSelected]
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeListRowObject.key]
    */
  var key: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxTreeListRowObject.level]
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxTreeListRowObject.node]
    */
  var node: js.UndefOr[dxTreeListNode] = js.native
  
  /**
    * [descr:dxTreeListRowObject.rowIndex]
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxTreeListRowObject.rowType]
    */
  var rowType: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxTreeListRowObject.values]
    */
  var values: js.UndefOr[js.Array[_]] = js.native
}
object dxTreeListRowObject {
  
  @scala.inline
  def apply(): dxTreeListRowObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListRowObject]
  }
  
  @scala.inline
  implicit class dxTreeListRowObjectOps[Self <: dxTreeListRowObject] (val x: Self) extends AnyVal {
    
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
    def setIsEditing(value: Boolean): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEditing: Self = this.set("isEditing", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    
    @scala.inline
    def setIsNewRow(value: Boolean): Self = this.set("isNewRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNewRow: Self = this.set("isNewRow", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setNode(value: dxTreeListNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setRowType(value: String): Self = this.set("rowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
