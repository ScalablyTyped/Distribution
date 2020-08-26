package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.native
  /** Returns the cell index of the selected cell.
    */
  var cellIndex: js.UndefOr[Double] = js.native
  /** Returns the cell value.
    */
  var cellValue: js.UndefOr[String] = js.native
  /** Returns current record object (JSON).
    */
  var currentData: js.UndefOr[js.Any] = js.native
  /** Returns the selected row data object.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the current selected row.
    */
  var row: js.UndefOr[js.Any] = js.native
  /** Returns the selected row data object.
    */
  var rowData: js.UndefOr[js.Any] = js.native
  /** Returns the row index of the selected row.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object RightClickEventArgs {
  @scala.inline
  def apply(): RightClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightClickEventArgs]
  }
  @scala.inline
  implicit class RightClickEventArgsOps[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setCellIndex(value: Double): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    @scala.inline
    def setCellValue(value: String): Self = this.set("cellValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellValue: Self = this.set("cellValue", js.undefined)
    @scala.inline
    def setCurrentData(value: js.Any): Self = this.set("currentData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentData: Self = this.set("currentData", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

