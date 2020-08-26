package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A cell in a table.
  */
@js.native
trait TableCell extends js.Object {
  def getColumnIndex(): Integer = js.native
  def getColumnSpan(): Integer = js.native
  def getContentAlignment(): ContentAlignment = js.native
  def getFill(): Fill = js.native
  def getHeadCell(): TableCell = js.native
  def getMergeState(): CellMergeState = js.native
  def getParentColumn(): TableColumn = js.native
  def getParentRow(): TableRow = js.native
  def getParentTable(): Table = js.native
  def getRowIndex(): Integer = js.native
  def getRowSpan(): Integer = js.native
  def getText(): TextRange = js.native
  def setContentAlignment(contentAlignment: ContentAlignment): TableCell = js.native
}

object TableCell {
  @scala.inline
  def apply(
    getColumnIndex: () => Integer,
    getColumnSpan: () => Integer,
    getContentAlignment: () => ContentAlignment,
    getFill: () => Fill,
    getHeadCell: () => TableCell,
    getMergeState: () => CellMergeState,
    getParentColumn: () => TableColumn,
    getParentRow: () => TableRow,
    getParentTable: () => Table,
    getRowIndex: () => Integer,
    getRowSpan: () => Integer,
    getText: () => TextRange,
    setContentAlignment: ContentAlignment => TableCell
  ): TableCell = {
    val __obj = js.Dynamic.literal(getColumnIndex = js.Any.fromFunction0(getColumnIndex), getColumnSpan = js.Any.fromFunction0(getColumnSpan), getContentAlignment = js.Any.fromFunction0(getContentAlignment), getFill = js.Any.fromFunction0(getFill), getHeadCell = js.Any.fromFunction0(getHeadCell), getMergeState = js.Any.fromFunction0(getMergeState), getParentColumn = js.Any.fromFunction0(getParentColumn), getParentRow = js.Any.fromFunction0(getParentRow), getParentTable = js.Any.fromFunction0(getParentTable), getRowIndex = js.Any.fromFunction0(getRowIndex), getRowSpan = js.Any.fromFunction0(getRowSpan), getText = js.Any.fromFunction0(getText), setContentAlignment = js.Any.fromFunction1(setContentAlignment))
    __obj.asInstanceOf[TableCell]
  }
  @scala.inline
  implicit class TableCellOps[Self <: TableCell] (val x: Self) extends AnyVal {
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
    def setGetColumnIndex(value: () => Integer): Self = this.set("getColumnIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColumnSpan(value: () => Integer): Self = this.set("getColumnSpan", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContentAlignment(value: () => ContentAlignment): Self = this.set("getContentAlignment", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFill(value: () => Fill): Self = this.set("getFill", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeadCell(value: () => TableCell): Self = this.set("getHeadCell", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMergeState(value: () => CellMergeState): Self = this.set("getMergeState", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentColumn(value: () => TableColumn): Self = this.set("getParentColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentRow(value: () => TableRow): Self = this.set("getParentRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentTable(value: () => Table): Self = this.set("getParentTable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRowIndex(value: () => Integer): Self = this.set("getRowIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRowSpan(value: () => Integer): Self = this.set("getRowSpan", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => TextRange): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContentAlignment(value: ContentAlignment => TableCell): Self = this.set("setContentAlignment", js.Any.fromFunction1(value))
  }
  
}

