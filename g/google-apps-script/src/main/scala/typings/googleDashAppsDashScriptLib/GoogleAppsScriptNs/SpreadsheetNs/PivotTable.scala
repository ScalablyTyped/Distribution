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

