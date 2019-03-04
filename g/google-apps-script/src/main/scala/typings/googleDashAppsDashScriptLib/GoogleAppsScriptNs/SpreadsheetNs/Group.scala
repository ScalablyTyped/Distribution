package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  def collapse(): Group
  def expand(): Group
  def getControlIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getDepth(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getRange(): Range
  def isCollapsed(): scala.Boolean
  def remove(): scala.Unit
}

object Group {
  @scala.inline
  def apply(
    collapse: js.Function0[Group],
    expand: js.Function0[Group],
    getControlIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getDepth: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getRange: js.Function0[Range],
    isCollapsed: js.Function0[scala.Boolean],
    remove: js.Function0[scala.Unit]
  ): Group = {
    val __obj = js.Dynamic.literal(collapse = collapse, expand = expand, getControlIndex = getControlIndex, getDepth = getDepth, getRange = getRange, isCollapsed = isCollapsed, remove = remove)
  
    __obj.asInstanceOf[Group]
  }
}

