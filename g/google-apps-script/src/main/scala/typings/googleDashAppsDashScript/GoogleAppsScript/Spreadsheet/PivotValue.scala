package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotValue extends js.Object {
  def getDisplayType(): PivotValueDisplayType
  def getFormula(): String | Null
  def getPivotTable(): PivotTable
  def getSummarizedBy(): PivotTableSummarizeFunction
  def setDisplayName(name: String): PivotValue
  def setFormula(formula: String): PivotValue
  def showAs(displayType: PivotValueDisplayType): PivotValue
  def summarizeBy(summarizeFunction: PivotTableSummarizeFunction): PivotValue
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
}

