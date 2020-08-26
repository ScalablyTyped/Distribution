package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGridRowObject extends js.Object {
  /** @name dxDataGridRowObject.data */
  var data: js.UndefOr[js.Any] = js.native
  /** @name dxDataGridRowObject.groupIndex */
  var groupIndex: js.UndefOr[Double] = js.native
  /** @name dxDataGridRowObject.isEditing */
  var isEditing: js.UndefOr[Boolean] = js.native
  /** @name dxDataGridRowObject.isExpanded */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /** @name dxDataGridRowObject.isNewRow */
  var isNewRow: js.UndefOr[Boolean] = js.native
  /** @name dxDataGridRowObject.isSelected */
  var isSelected: js.UndefOr[Boolean] = js.native
  /** @name dxDataGridRowObject.key */
  var key: js.UndefOr[js.Any] = js.native
  /** @name dxDataGridRowObject.rowIndex */
  var rowIndex: js.UndefOr[Double] = js.native
  /** @name dxDataGridRowObject.rowType */
  var rowType: js.UndefOr[String] = js.native
  /** @name dxDataGridRowObject.values */
  var values: js.UndefOr[js.Array[_]] = js.native
}

object dxDataGridRowObject {
  @scala.inline
  def apply(): dxDataGridRowObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridRowObject]
  }
  @scala.inline
  implicit class dxDataGridRowObjectOps[Self <: dxDataGridRowObject] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
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

