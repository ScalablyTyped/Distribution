package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify pivot tables.
  */
trait PivotTable extends StObject {
  
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
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTable] (val x: Self) extends AnyVal {
    
    inline def setAddCalculatedPivotValue(value: (String, String) => PivotValue): Self = StObject.set(x, "addCalculatedPivotValue", js.Any.fromFunction2(value))
    
    inline def setAddColumnGroup(value: Integer => PivotGroup): Self = StObject.set(x, "addColumnGroup", js.Any.fromFunction1(value))
    
    inline def setAddFilter(value: (Integer, FilterCriteria) => PivotFilter): Self = StObject.set(x, "addFilter", js.Any.fromFunction2(value))
    
    inline def setAddPivotValue(value: (Integer, PivotTableSummarizeFunction) => PivotValue): Self = StObject.set(x, "addPivotValue", js.Any.fromFunction2(value))
    
    inline def setAddRowGroup(value: Integer => PivotGroup): Self = StObject.set(x, "addRowGroup", js.Any.fromFunction1(value))
    
    inline def setGetAnchorCell(value: () => Range): Self = StObject.set(x, "getAnchorCell", js.Any.fromFunction0(value))
    
    inline def setGetColumnGroups(value: () => js.Array[PivotGroup]): Self = StObject.set(x, "getColumnGroups", js.Any.fromFunction0(value))
    
    inline def setGetFilters(value: () => js.Array[PivotFilter]): Self = StObject.set(x, "getFilters", js.Any.fromFunction0(value))
    
    inline def setGetPivotValues(value: () => js.Array[PivotValue]): Self = StObject.set(x, "getPivotValues", js.Any.fromFunction0(value))
    
    inline def setGetRowGroups(value: () => js.Array[PivotGroup]): Self = StObject.set(x, "getRowGroups", js.Any.fromFunction0(value))
    
    inline def setGetValuesDisplayOrientation(value: () => Dimension): Self = StObject.set(x, "getValuesDisplayOrientation", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetValuesDisplayOrientation(value: Dimension => PivotTable): Self = StObject.set(x, "setValuesDisplayOrientation", js.Any.fromFunction1(value))
  }
}
