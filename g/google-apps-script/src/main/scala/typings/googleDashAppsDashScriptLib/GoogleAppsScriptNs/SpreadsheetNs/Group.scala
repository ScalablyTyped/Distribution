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
    collapse: () => Group,
    expand: () => Group,
    getControlIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getDepth: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getRange: () => Range,
    isCollapsed: () => scala.Boolean,
    remove: () => scala.Unit
  ): Group = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), expand = js.Any.fromFunction0(expand), getControlIndex = js.Any.fromFunction0(getControlIndex), getDepth = js.Any.fromFunction0(getDepth), getRange = js.Any.fromFunction0(getRange), isCollapsed = js.Any.fromFunction0(isCollapsed), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[Group]
  }
}

