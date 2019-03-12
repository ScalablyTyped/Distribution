package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumn extends js.Object {
  def getCell(cellIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableCell
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getNumCells(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParentTable(): Table
  def getWidth(): stdLib.Number
  def remove(): scala.Unit
}

object TableColumn {
  @scala.inline
  def apply(
    getCell: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => TableCell,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getNumCells: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getParentTable: () => Table,
    getWidth: () => stdLib.Number,
    remove: () => scala.Unit
  ): TableColumn = {
    val __obj = js.Dynamic.literal(getCell = js.Any.fromFunction1(getCell), getIndex = js.Any.fromFunction0(getIndex), getNumCells = js.Any.fromFunction0(getNumCells), getParentTable = js.Any.fromFunction0(getParentTable), getWidth = js.Any.fromFunction0(getWidth), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[TableColumn]
  }
}

