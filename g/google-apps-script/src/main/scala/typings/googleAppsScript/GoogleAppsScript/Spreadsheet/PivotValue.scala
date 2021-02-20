package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access and modify value groups in pivot tables.
  */
@js.native
trait PivotValue extends StObject {
  
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
  implicit class PivotValueMutableBuilder[Self <: PivotValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDisplayType(value: () => PivotValueDisplayType): Self = StObject.set(x, "getDisplayType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormula(value: () => String | Null): Self = StObject.set(x, "getFormula", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPivotTable(value: () => PivotTable): Self = StObject.set(x, "getPivotTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSummarizedBy(value: () => PivotTableSummarizeFunction): Self = StObject.set(x, "getSummarizedBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDisplayName(value: String => PivotValue): Self = StObject.set(x, "setDisplayName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFormula(value: String => PivotValue): Self = StObject.set(x, "setFormula", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowAs(value: PivotValueDisplayType => PivotValue): Self = StObject.set(x, "showAs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSummarizeBy(value: PivotTableSummarizeFunction => PivotValue): Self = StObject.set(x, "summarizeBy", js.Any.fromFunction1(value))
  }
}
