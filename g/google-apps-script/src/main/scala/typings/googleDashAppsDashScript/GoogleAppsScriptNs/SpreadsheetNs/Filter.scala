package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def getColumnFilterCriteria(columnPosition: Integer): FilterCriteria
  def getRange(): Range
  def remove(): Unit
  def removeColumnFilterCriteria(columnPosition: Integer): Filter
  def setColumnFilterCriteria(columnPosition: Integer, filterCriteria: FilterCriteria): Filter
  def sort(columnPosition: Integer, ascending: Boolean): Filter
}

object Filter {
  @scala.inline
  def apply(
    getColumnFilterCriteria: Integer => FilterCriteria,
    getRange: () => Range,
    remove: () => Unit,
    removeColumnFilterCriteria: Integer => Filter,
    setColumnFilterCriteria: (Integer, FilterCriteria) => Filter,
    sort: (Integer, Boolean) => Filter
  ): Filter = {
    val __obj = js.Dynamic.literal(getColumnFilterCriteria = js.Any.fromFunction1(getColumnFilterCriteria), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove), removeColumnFilterCriteria = js.Any.fromFunction1(removeColumnFilterCriteria), setColumnFilterCriteria = js.Any.fromFunction2(setColumnFilterCriteria), sort = js.Any.fromFunction2(sort))
  
    __obj.asInstanceOf[Filter]
  }
}

