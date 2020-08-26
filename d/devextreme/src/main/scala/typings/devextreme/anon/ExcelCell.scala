package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.excelExporter.ExcelDataGridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelCell extends js.Object {
  var excelCell: js.UndefOr[js.Any] = js.native
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.native
}

object ExcelCell {
  @scala.inline
  def apply(): ExcelCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelCell]
  }
  @scala.inline
  implicit class ExcelCellOps[Self <: ExcelCell] (val x: Self) extends AnyVal {
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
    def setExcelCell(value: js.Any): Self = this.set("excelCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcelCell: Self = this.set("excelCell", js.undefined)
    @scala.inline
    def setGridCell(value: ExcelDataGridCell): Self = this.set("gridCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridCell: Self = this.set("gridCell", js.undefined)
  }
  
}

