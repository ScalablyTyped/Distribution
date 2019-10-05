package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTable extends js.Object {
  def addCalculatedPivotValue(name: String, formula: String): PivotValue
  def addColumnGroup(sourceDataColumn: Integer): PivotGroup
  def addFilter(sourceDataColumn: Integer, filterCriteria: FilterCriteria): PivotFilter
  def addPivotValue(sourceDataColumn: Integer, summarizeFunction: PivotTableSummarizeFunction): PivotValue
  def addRowGroup(sourceDataColumn: Integer): PivotGroup
  def getAnchorCell(): Range
  def getColumnGroups(): js.Array[PivotGroup]
  def getFilters(): js.Array[PivotFilter]
  def getPivotValues(): js.Array[PivotValue]
  def getRowGroups(): js.Array[PivotGroup]
  def getValuesDisplayOrientation(): Dimension
  def remove(): Unit
  def setValuesDisplayOrientation(dimension: Dimension): PivotTable
}

object PivotTable {
  @scala.inline
  def apply(
    addCalculatedPivotValue: (String, String) => PivotValue,
    addColumnGroup: Integer => PivotGroup,
    addFilter: (Integer, FilterCriteria) => PivotFilter,
    addPivotValue: (Integer, PivotTableSummarizeFunction) => PivotValue,
    addRowGroup: Integer => PivotGroup,
    getAnchorCell: () => Range,
    getColumnGroups: () => js.Array[PivotGroup],
    getFilters: () => js.Array[PivotFilter],
    getPivotValues: () => js.Array[PivotValue],
    getRowGroups: () => js.Array[PivotGroup],
    getValuesDisplayOrientation: () => Dimension,
    remove: () => Unit,
    setValuesDisplayOrientation: Dimension => PivotTable
  ): PivotTable = {
    val __obj = js.Dynamic.literal(addCalculatedPivotValue = js.Any.fromFunction2(addCalculatedPivotValue), addColumnGroup = js.Any.fromFunction1(addColumnGroup), addFilter = js.Any.fromFunction2(addFilter), addPivotValue = js.Any.fromFunction2(addPivotValue), addRowGroup = js.Any.fromFunction1(addRowGroup), getAnchorCell = js.Any.fromFunction0(getAnchorCell), getColumnGroups = js.Any.fromFunction0(getColumnGroups), getFilters = js.Any.fromFunction0(getFilters), getPivotValues = js.Any.fromFunction0(getPivotValues), getRowGroups = js.Any.fromFunction0(getRowGroups), getValuesDisplayOrientation = js.Any.fromFunction0(getValuesDisplayOrientation), remove = js.Any.fromFunction0(remove), setValuesDisplayOrientation = js.Any.fromFunction1(setValuesDisplayOrientation))
  
    __obj.asInstanceOf[PivotTable]
  }
}

