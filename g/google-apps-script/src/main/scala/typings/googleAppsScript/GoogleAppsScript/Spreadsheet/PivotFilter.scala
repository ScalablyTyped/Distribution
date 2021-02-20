package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify pivot table filters.
  */
@js.native
trait PivotFilter extends StObject {
  
  def getFilterCriteria(): FilterCriteria = js.native
  
  def getPivotTable(): PivotTable = js.native
  
  def getSourceDataColumn(): Integer = js.native
  
  def remove(): Unit = js.native
  
  def setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter = js.native
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
  
  @scala.inline
  implicit class PivotFilterMutableBuilder[Self <: PivotFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFilterCriteria(value: () => FilterCriteria): Self = StObject.set(x, "getFilterCriteria", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPivotTable(value: () => PivotTable): Self = StObject.set(x, "getPivotTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSourceDataColumn(value: () => Integer): Self = StObject.set(x, "getSourceDataColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilterCriteria(value: FilterCriteria => PivotFilter): Self = StObject.set(x, "setFilterCriteria", js.Any.fromFunction1(value))
  }
}
