package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSaveEventArgs extends js.Object {
  /** Returns the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.native
  /** Returns the column name.
    */
  var columnName: js.UndefOr[String] = js.native
  /** Returns the column object.
    */
  var columnObject: js.UndefOr[js.Any] = js.native
  /** Returns isForeignKey option value.
    */
  var isForeignKey: js.UndefOr[Boolean] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the previous value of the cell.
    */
  var previousValue: js.UndefOr[String] = js.native
  /** Returns the row data object.
    */
  var rowData: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Returns the cell value.
    */
  var value: js.UndefOr[String] = js.native
}

object CellSaveEventArgs {
  @scala.inline
  def apply(): CellSaveEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSaveEventArgs]
  }
  @scala.inline
  implicit class CellSaveEventArgsOps[Self <: CellSaveEventArgs] (val x: Self) extends AnyVal {
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
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    @scala.inline
    def setColumnObject(value: js.Any): Self = this.set("columnObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnObject: Self = this.set("columnObject", js.undefined)
    @scala.inline
    def setIsForeignKey(value: Boolean): Self = this.set("isForeignKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsForeignKey: Self = this.set("isForeignKey", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPreviousValue(value: String): Self = this.set("previousValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousValue: Self = this.set("previousValue", js.undefined)
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

