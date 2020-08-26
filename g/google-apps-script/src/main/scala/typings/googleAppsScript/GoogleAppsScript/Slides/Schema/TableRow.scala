package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRow extends js.Object {
  var rowHeight: js.UndefOr[Dimension] = js.native
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.native
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.native
}

object TableRow {
  @scala.inline
  def apply(): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRow]
  }
  @scala.inline
  implicit class TableRowOps[Self <: TableRow] (val x: Self) extends AnyVal {
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
    def setRowHeight(value: Dimension): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setTableCellsVarargs(value: TableCell*): Self = this.set("tableCells", js.Array(value :_*))
    @scala.inline
    def setTableCells(value: js.Array[TableCell]): Self = this.set("tableCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCells: Self = this.set("tableCells", js.undefined)
    @scala.inline
    def setTableRowProperties(value: TableRowProperties): Self = this.set("tableRowProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRowProperties: Self = this.set("tableRowProperties", js.undefined)
  }
  
}

