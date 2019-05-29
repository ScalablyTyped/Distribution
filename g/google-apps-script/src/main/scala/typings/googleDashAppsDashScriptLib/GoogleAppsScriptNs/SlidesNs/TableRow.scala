package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  def getCell(cellIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableCell
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getMinimumHeight(): scala.Double
  def getNumCells(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParentTable(): Table
  def remove(): scala.Unit
}

object TableRow {
  @scala.inline
  def apply(
    getCell: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => TableCell,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getMinimumHeight: () => scala.Double,
    getNumCells: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getParentTable: () => Table,
    remove: () => scala.Unit
  ): TableRow = {
    val __obj = js.Dynamic.literal(getCell = js.Any.fromFunction1(getCell), getIndex = js.Any.fromFunction0(getIndex), getMinimumHeight = js.Any.fromFunction0(getMinimumHeight), getNumCells = js.Any.fromFunction0(getNumCells), getParentTable = js.Any.fromFunction0(getParentTable), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[TableRow]
  }
}

