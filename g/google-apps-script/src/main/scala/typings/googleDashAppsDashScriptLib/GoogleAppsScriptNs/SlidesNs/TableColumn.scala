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
    getCell: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, TableCell],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getNumCells: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getParentTable: js.Function0[Table],
    getWidth: js.Function0[stdLib.Number],
    remove: js.Function0[scala.Unit]
  ): TableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCell")(getCell)
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getNumCells")(getNumCells)
    __obj.updateDynamic("getParentTable")(getParentTable)
    __obj.updateDynamic("getWidth")(getWidth)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[TableColumn]
  }
}

