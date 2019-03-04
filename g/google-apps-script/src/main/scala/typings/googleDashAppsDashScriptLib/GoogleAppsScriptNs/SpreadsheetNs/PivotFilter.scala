package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotFilter extends js.Object {
  def getFilterCriteria(): FilterCriteria
  def getPivotTable(): PivotTable
  def getSourceDataColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def remove(): scala.Unit
  def setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter
}

object PivotFilter {
  @scala.inline
  def apply(
    getFilterCriteria: js.Function0[FilterCriteria],
    getPivotTable: js.Function0[PivotTable],
    getSourceDataColumn: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    remove: js.Function0[scala.Unit],
    setFilterCriteria: js.Function1[FilterCriteria, PivotFilter]
  ): PivotFilter = {
    val __obj = js.Dynamic.literal(getFilterCriteria = getFilterCriteria, getPivotTable = getPivotTable, getSourceDataColumn = getSourceDataColumn, remove = remove, setFilterCriteria = setFilterCriteria)
  
    __obj.asInstanceOf[PivotFilter]
  }
}

