package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify value groups in pivot tables.
  */
@js.native
trait PivotValue extends js.Object {
  
  def getDisplayType(): PivotValueDisplayType = js.native
  
  def getFormula(): String | Null = js.native
  
  def getPivotTable(): PivotTable = js.native
  
  def getSummarizedBy(): PivotTableSummarizeFunction = js.native
  
  def setDisplayName(name: String): PivotValue = js.native
  
  def setFormula(formula: String): PivotValue = js.native
  
  def showAs(displayType: PivotValueDisplayType): PivotValue = js.native
  
  def summarizeBy(summarizeFunction: PivotTableSummarizeFunction): PivotValue = js.native
}
object PivotValue {
  
  @scala.inline
  def apply(
    getDisplayType: () => PivotValueDisplayType,
    getFormula: () => String | Null,
    getPivotTable: () => PivotTable,
    getSummarizedBy: () => PivotTableSummarizeFunction,
    setDisplayName: String => PivotValue,
    setFormula: String => PivotValue,
    showAs: PivotValueDisplayType => PivotValue,
    summarizeBy: PivotTableSummarizeFunction => PivotValue
  ): PivotValue = {
    val __obj = js.Dynamic.literal(getDisplayType = js.Any.fromFunction0(getDisplayType), getFormula = js.Any.fromFunction0(getFormula), getPivotTable = js.Any.fromFunction0(getPivotTable), getSummarizedBy = js.Any.fromFunction0(getSummarizedBy), setDisplayName = js.Any.fromFunction1(setDisplayName), setFormula = js.Any.fromFunction1(setFormula), showAs = js.Any.fromFunction1(showAs), summarizeBy = js.Any.fromFunction1(summarizeBy))
    __obj.asInstanceOf[PivotValue]
  }
  
  @scala.inline
  implicit class PivotValueOps[Self <: PivotValue] (val x: Self) extends AnyVal {
    
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
    def setGetDisplayType(value: () => PivotValueDisplayType): Self = this.set("getDisplayType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormula(value: () => String | Null): Self = this.set("getFormula", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPivotTable(value: () => PivotTable): Self = this.set("getPivotTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSummarizedBy(value: () => PivotTableSummarizeFunction): Self = this.set("getSummarizedBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDisplayName(value: String => PivotValue): Self = this.set("setDisplayName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFormula(value: String => PivotValue): Self = this.set("setFormula", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowAs(value: PivotValueDisplayType => PivotValue): Self = this.set("showAs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSummarizeBy(value: PivotTableSummarizeFunction => PivotValue): Self = this.set("summarizeBy", js.Any.fromFunction1(value))
  }
}
