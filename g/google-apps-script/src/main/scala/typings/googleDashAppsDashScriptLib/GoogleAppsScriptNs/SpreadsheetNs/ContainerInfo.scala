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
    getAnchorColumn: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getAnchorRow: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getOffsetX: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getOffsetY: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAnchorColumn")(getAnchorColumn)
    __obj.updateDynamic("getAnchorRow")(getAnchorRow)
    __obj.updateDynamic("getOffsetX")(getOffsetX)
    __obj.updateDynamic("getOffsetY")(getOffsetY)
    __obj.asInstanceOf[ContainerInfo]
  }
}

