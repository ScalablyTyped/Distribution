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
    addCalculatedPivotValue: js.Function2[java.lang.String, java.lang.String, PivotValue],
    addColumnGroup: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, PivotGroup],
    addFilter: js.Function2[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, FilterCriteria, PivotFilter],
    addPivotValue: js.Function2[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      PivotTableSummarizeFunction, 
      PivotValue
    ],
    addRowGroup: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, PivotGroup],
    getAnchorCell: js.Function0[Range],
    getColumnGroups: js.Function0[js.Array[PivotGroup]],
    getFilters: js.Function0[js.Array[PivotFilter]],
    getPivotValues: js.Function0[js.Array[PivotValue]],
    getRowGroups: js.Function0[js.Array[PivotGroup]],
    getValuesDisplayOrientation: js.Function0[Dimension],
    remove: js.Function0[scala.Unit],
    setValuesDisplayOrientation: js.Function1[Dimension, PivotTable]
  ): PivotTable = {
    val __obj = js.Dynamic.literal(addCalculatedPivotValue = addCalculatedPivotValue, addColumnGroup = addColumnGroup, addFilter = addFilter, addPivotValue = addPivotValue, addRowGroup = addRowGroup, getAnchorCell = getAnchorCell, getColumnGroups = getColumnGroups, getFilters = getFilters, getPivotValues = getPivotValues, getRowGroups = getRowGroups, getValuesDisplayOrientation = getValuesDisplayOrientation, remove = remove, setValuesDisplayOrientation = setValuesDisplayOrientation)
  
    __obj.asInstanceOf[PivotTable]
  }
}

