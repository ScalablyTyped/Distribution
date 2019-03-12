package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTable extends js.Object {
  def addCalculatedPivotValue(name: java.lang.String, formula: java.lang.String): PivotValue
  def addColumnGroup(sourceDataColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PivotGroup
  def addFilter(
    sourceDataColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    filterCriteria: FilterCriteria
  ): PivotFilter
  def addPivotValue(
    sourceDataColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    summarizeFunction: PivotTableSummarizeFunction
  ): PivotValue
  def addRowGroup(sourceDataColumn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PivotGroup
  def getAnchorCell(): Range
  def getColumnGroups(): js.Array[PivotGroup]
  def getFilters(): js.Array[PivotFilter]
  def getPivotValues(): js.Array[PivotValue]
  def getRowGroups(): js.Array[PivotGroup]
  def getValuesDisplayOrientation(): Dimension
  def remove(): scala.Unit
  def setValuesDisplayOrientation(dimension: Dimension): PivotTable
}

object PivotTable {
  @scala.inline
  def apply(
    addCalculatedPivotValue: (java.lang.String, java.lang.String) => PivotValue,
    addColumnGroup: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => PivotGroup,
    addFilter: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, FilterCriteria) => PivotFilter,
    addPivotValue: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, PivotTableSummarizeFunction) => PivotValue,
    addRowGroup: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => PivotGroup,
    getAnchorCell: () => Range,
    getColumnGroups: () => js.Array[PivotGroup],
    getFilters: () => js.Array[PivotFilter],
    getPivotValues: () => js.Array[PivotValue],
    getRowGroups: () => js.Array[PivotGroup],
    getValuesDisplayOrientation: () => Dimension,
    remove: () => scala.Unit,
    setValuesDisplayOrientation: Dimension => PivotTable
  ): PivotTable = {
    val __obj = js.Dynamic.literal(addCalculatedPivotValue = js.Any.fromFunction2(addCalculatedPivotValue), addColumnGroup = js.Any.fromFunction1(addColumnGroup), addFilter = js.Any.fromFunction2(addFilter), addPivotValue = js.Any.fromFunction2(addPivotValue), addRowGroup = js.Any.fromFunction1(addRowGroup), getAnchorCell = js.Any.fromFunction0(getAnchorCell), getColumnGroups = js.Any.fromFunction0(getColumnGroups), getFilters = js.Any.fromFunction0(getFilters), getPivotValues = js.Any.fromFunction0(getPivotValues), getRowGroups = js.Any.fromFunction0(getRowGroups), getValuesDisplayOrientation = js.Any.fromFunction0(getValuesDisplayOrientation), remove = js.Any.fromFunction0(remove), setValuesDisplayOrientation = js.Any.fromFunction1(setValuesDisplayOrientation))
  
    __obj.asInstanceOf[PivotTable]
  }
}

