package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Filter extends js.Object {
  def getColumnFilterCriteria(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FilterCriteria
  def getRange(): Range
  def remove(): scala.Unit
  def removeColumnFilterCriteria(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Filter
  def setColumnFilterCriteria(
    columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    filterCriteria: FilterCriteria
  ): Filter
  def sort(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ascending: scala.Boolean): Filter
}

