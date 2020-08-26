package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldValue extends js.Object {
  var column: js.UndefOr[this.type] = js.native
  var columnIndex: js.UndefOr[Double] = js.native
  var component: js.UndefOr[dxDataGrid] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var displayValue: js.UndefOr[js.Any] = js.native
  var oldValue: js.UndefOr[js.Any] = js.native
  var row: js.UndefOr[dxDataGridRowObject] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
  var rowType: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
  var watch: js.UndefOr[js.Function] = js.native
}

object OldValue {
  @scala.inline
  def apply(): OldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldValue]
  }
  @scala.inline
  implicit class OldValueOps[Self <: OldValue] (val x: Self) extends AnyVal {
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
    def setColumn(value: OldValue): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setComponent(value: dxDataGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDisplayValue(value: js.Any): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayValue: Self = this.set("displayValue", js.undefined)
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    @scala.inline
    def setRow(value: dxDataGridRowObject): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setRowType(value: String): Self = this.set("rowType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWatch(value: js.Function): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

