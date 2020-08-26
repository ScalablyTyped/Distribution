package typings.devextreme.mod.DevExpress.excelExporter

import typings.devextreme.anon.NameValue
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelDataGridCell extends js.Object {
  /** @name ExcelDataGridCell.column */
  var column: js.UndefOr[dxDataGridColumn] = js.native
  /** @name ExcelDataGridCell.data */
  var data: js.UndefOr[js.Any] = js.native
  /** @name ExcelDataGridCell.groupIndex */
  var groupIndex: js.UndefOr[Double] = js.native
  /** @name ExcelDataGridCell.groupSummaryItems */
  var groupSummaryItems: js.UndefOr[js.Array[NameValue]] = js.native
  /** @name ExcelDataGridCell.rowType */
  var rowType: js.UndefOr[String] = js.native
  /** @name ExcelDataGridCell.totalSummaryItemName */
  var totalSummaryItemName: js.UndefOr[String] = js.native
  /** @name ExcelDataGridCell.value */
  var value: js.UndefOr[js.Any] = js.native
}

object ExcelDataGridCell {
  @scala.inline
  def apply(): ExcelDataGridCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelDataGridCell]
  }
  @scala.inline
  implicit class ExcelDataGridCellOps[Self <: ExcelDataGridCell] (val x: Self) extends AnyVal {
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
    def setColumn(value: dxDataGridColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
    @scala.inline
    def setGroupSummaryItemsVarargs(value: NameValue*): Self = this.set("groupSummaryItems", js.Array(value :_*))
    @scala.inline
    def setGroupSummaryItems(value: js.Array[NameValue]): Self = this.set("groupSummaryItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSummaryItems: Self = this.set("groupSummaryItems", js.undefined)
    @scala.inline
    def setRowType(value: String): Self = this.set("rowType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    @scala.inline
    def setTotalSummaryItemName(value: String): Self = this.set("totalSummaryItemName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSummaryItemName: Self = this.set("totalSummaryItemName", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

