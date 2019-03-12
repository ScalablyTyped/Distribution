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
    getColumnIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getColumnSpan: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getContentAlignment: () => ContentAlignment,
    getFill: () => Fill,
    getHeadCell: () => TableCell,
    getMergeState: () => CellMergeState,
    getParentColumn: () => TableColumn,
    getParentRow: () => TableRow,
    getParentTable: () => Table,
    getRowIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getRowSpan: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getText: () => TextRange,
    setContentAlignment: ContentAlignment => TableCell
  ): TableCell = {
    val __obj = js.Dynamic.literal(getColumnIndex = js.Any.fromFunction0(getColumnIndex), getColumnSpan = js.Any.fromFunction0(getColumnSpan), getContentAlignment = js.Any.fromFunction0(getContentAlignment), getFill = js.Any.fromFunction0(getFill), getHeadCell = js.Any.fromFunction0(getHeadCell), getMergeState = js.Any.fromFunction0(getMergeState), getParentColumn = js.Any.fromFunction0(getParentColumn), getParentRow = js.Any.fromFunction0(getParentRow), getParentTable = js.Any.fromFunction0(getParentTable), getRowIndex = js.Any.fromFunction0(getRowIndex), getRowSpan = js.Any.fromFunction0(getRowSpan), getText = js.Any.fromFunction0(getText), setContentAlignment = js.Any.fromFunction1(setContentAlignment))
  
    __obj.asInstanceOf[TableCell]
  }
}

