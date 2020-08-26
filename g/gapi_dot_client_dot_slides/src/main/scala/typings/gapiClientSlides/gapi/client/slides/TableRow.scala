package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRow extends js.Object {
  /** Height of a row. */
  var rowHeight: js.UndefOr[Dimension] = js.native
  /**
    * Properties and contents of each cell.
    *
    * Cells that span multiple columns are represented only once with a
    * column_span greater
    * than 1. As a result, the length of this collection does not always match
    * the number of columns of the entire table.
    */
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.native
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
  }
  
}

