package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInfo extends js.Object {
  def getAnchorColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getAnchorRow(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getOffsetX(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getOffsetY(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
}

object ContainerInfo {
  @scala.inline
  def apply(
    getAnchorColumn: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getAnchorRow: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getOffsetX: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getOffsetY: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal(getAnchorColumn = js.Any.fromFunction0(getAnchorColumn), getAnchorRow = js.Any.fromFunction0(getAnchorRow), getOffsetX = js.Any.fromFunction0(getOffsetX), getOffsetY = js.Any.fromFunction0(getOffsetY))
  
    __obj.asInstanceOf[ContainerInfo]
  }
}

