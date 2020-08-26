package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRow extends js.Object {
  var endIndex: js.UndefOr[Double] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedTableRowStyleChanges: js.UndefOr[js.Object] = js.native
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.native
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.native
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
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = this.set("suggestedInsertionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = this.set("suggestedInsertionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedInsertionIds: Self = this.set("suggestedInsertionIds", js.undefined)
    @scala.inline
    def setSuggestedTableRowStyleChanges(value: js.Object): Self = this.set("suggestedTableRowStyleChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedTableRowStyleChanges: Self = this.set("suggestedTableRowStyleChanges", js.undefined)
    @scala.inline
    def setTableCellsVarargs(value: TableCell*): Self = this.set("tableCells", js.Array(value :_*))
    @scala.inline
    def setTableCells(value: js.Array[TableCell]): Self = this.set("tableCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCells: Self = this.set("tableCells", js.undefined)
    @scala.inline
    def setTableRowStyle(value: TableRowStyle): Self = this.set("tableRowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRowStyle: Self = this.set("tableRowStyle", js.undefined)
  }
  
}

