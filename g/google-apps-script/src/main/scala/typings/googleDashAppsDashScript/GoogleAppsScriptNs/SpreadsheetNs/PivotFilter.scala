package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotFilter extends js.Object {
  def getFilterCriteria(): FilterCriteria
  def getPivotTable(): PivotTable
  def getSourceDataColumn(): Integer
  def remove(): Unit
  def setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter
}

object PivotFilter {
  @scala.inline
  def apply(
    getFilterCriteria: () => FilterCriteria,
    getPivotTable: () => PivotTable,
    getSourceDataColumn: () => Integer,
    remove: () => Unit,
    setFilterCriteria: FilterCriteria => PivotFilter
  ): PivotFilter = {
    val __obj = js.Dynamic.literal(getFilterCriteria = js.Any.fromFunction0(getFilterCriteria), getPivotTable = js.Any.fromFunction0(getPivotTable), getSourceDataColumn = js.Any.fromFunction0(getSourceDataColumn), remove = js.Any.fromFunction0(remove), setFilterCriteria = js.Any.fromFunction1(setFilterCriteria))
  
    __obj.asInstanceOf[PivotFilter]
  }
}

