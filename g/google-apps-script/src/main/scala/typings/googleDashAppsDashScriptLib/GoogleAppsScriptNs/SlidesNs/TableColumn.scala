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

