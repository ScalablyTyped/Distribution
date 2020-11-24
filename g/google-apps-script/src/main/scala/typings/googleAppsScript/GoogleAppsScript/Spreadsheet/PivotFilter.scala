package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify pivot table filters.
  */
@js.native
trait PivotFilter extends js.Object {
  
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
  implicit class PivotFilterOps[Self <: PivotFilter] (val x: Self) extends AnyVal {
    
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
    def setGetFilterCriteria(value: () => FilterCriteria): Self = this.set("getFilterCriteria", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPivotTable(value: () => PivotTable): Self = this.set("getPivotTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSourceDataColumn(value: () => Integer): Self = this.set("getSourceDataColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilterCriteria(value: FilterCriteria => PivotFilter): Self = this.set("setFilterCriteria", js.Any.fromFunction1(value))
  }
}
