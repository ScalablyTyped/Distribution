package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  def getColumnIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getColumnSpan(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getContentAlignment(): ContentAlignment
  def getFill(): Fill
  def getHeadCell(): TableCell
  def getMergeState(): CellMergeState
  def getParentColumn(): TableColumn
  def getParentRow(): TableRow
  def getParentTable(): Table
  def getRowIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRowSpan(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getText(): TextRange
  def setContentAlignment(contentAlignment: ContentAlignment): TableCell
}

object TableCell {
  @scala.inline
  def apply(
    getColumnIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getColumnSpan: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getContentAlignment: js.Function0[ContentAlignment],
    getFill: js.Function0[Fill],
    getHeadCell: js.Function0[TableCell],
    getMergeState: js.Function0[CellMergeState],
    getParentColumn: js.Function0[TableColumn],
    getParentRow: js.Function0[TableRow],
    getParentTable: js.Function0[Table],
    getRowIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getRowSpan: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getText: js.Function0[TextRange],
    setContentAlignment: js.Function1[ContentAlignment, TableCell]
  ): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumnIndex")(getColumnIndex)
    __obj.updateDynamic("getColumnSpan")(getColumnSpan)
    __obj.updateDynamic("getContentAlignment")(getContentAlignment)
    __obj.updateDynamic("getFill")(getFill)
    __obj.updateDynamic("getHeadCell")(getHeadCell)
    __obj.updateDynamic("getMergeState")(getMergeState)
    __obj.updateDynamic("getParentColumn")(getParentColumn)
    __obj.updateDynamic("getParentRow")(getParentRow)
    __obj.updateDynamic("getParentTable")(getParentTable)
    __obj.updateDynamic("getRowIndex")(getRowIndex)
    __obj.updateDynamic("getRowSpan")(getRowSpan)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("setContentAlignment")(setContentAlignment)
    __obj.asInstanceOf[TableCell]
  }
}

