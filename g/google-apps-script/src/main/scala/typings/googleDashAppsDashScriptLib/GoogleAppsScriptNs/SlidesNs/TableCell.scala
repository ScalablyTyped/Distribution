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

