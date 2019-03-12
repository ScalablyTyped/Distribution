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

object Filter {
  @scala.inline
  def apply(
    getColumnFilterCriteria: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => FilterCriteria,
    getRange: () => Range,
    remove: () => scala.Unit,
    removeColumnFilterCriteria: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => Filter,
    setColumnFilterCriteria: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, FilterCriteria) => Filter,
    sort: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean) => Filter
  ): Filter = {
    val __obj = js.Dynamic.literal(getColumnFilterCriteria = js.Any.fromFunction1(getColumnFilterCriteria), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove), removeColumnFilterCriteria = js.Any.fromFunction1(removeColumnFilterCriteria), setColumnFilterCriteria = js.Any.fromFunction2(setColumnFilterCriteria), sort = js.Any.fromFunction2(sort))
  
    __obj.asInstanceOf[Filter]
  }
}

