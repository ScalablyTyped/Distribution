package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify pivot tables.
  */
@js.native
trait PivotTable extends js.Object {
  
  def addCalculatedPivotValue(name: String, formula: String): PivotValue = js.native
  
  def addColumnGroup(sourceDataColumn: Integer): PivotGroup = js.native
  
  def addFilter(sourceDataColumn: Integer, filterCriteria: FilterCriteria): PivotFilter = js.native
  
  def addPivotValue(sourceDataColumn: Integer, summarizeFunction: PivotTableSummarizeFunction): PivotValue = js.native
  
  def addRowGroup(sourceDataColumn: Integer): PivotGroup = js.native
  
  def getAnchorCell(): Range = js.native
  
  def getColumnGroups(): js.Array[PivotGroup] = js.native
  
  def getFilters(): js.Array[PivotFilter] = js.native
  
  def getPivotValues(): js.Array[PivotValue] = js.native
  
  def getRowGroups(): js.Array[PivotGroup] = js.native
  
  def getValuesDisplayOrientation(): Dimension = js.native
  
  def remove(): Unit = js.native
  
  def setValuesDisplayOrientation(dimension: Dimension): PivotTable = js.native
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
  
  @scala.inline
  implicit class PivotTableOps[Self <: PivotTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCalculatedPivotValue(value: (String, String) => PivotValue): Self = this.set("addCalculatedPivotValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddColumnGroup(value: Integer => PivotGroup): Self = this.set("addColumnGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddFilter(value: (Integer, FilterCriteria) => PivotFilter): Self = this.set("addFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddPivotValue(value: (Integer, PivotTableSummarizeFunction) => PivotValue): Self = this.set("addPivotValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddRowGroup(value: Integer => PivotGroup): Self = this.set("addRowGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAnchorCell(value: () => Range): Self = this.set("getAnchorCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumnGroups(value: () => js.Array[PivotGroup]): Self = this.set("getColumnGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilters(value: () => js.Array[PivotFilter]): Self = this.set("getFilters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPivotValues(value: () => js.Array[PivotValue]): Self = this.set("getPivotValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowGroups(value: () => js.Array[PivotGroup]): Self = this.set("getRowGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValuesDisplayOrientation(value: () => Dimension): Self = this.set("getValuesDisplayOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValuesDisplayOrientation(value: Dimension => PivotTable): Self = this.set("setValuesDisplayOrientation", js.Any.fromFunction1(value))
  }
}
