package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotValue extends js.Object {
  def getDisplayType(): PivotValueDisplayType
  def getFormula(): java.lang.String
  def getPivotTable(): PivotTable
  def getSummarizedBy(): PivotTableSummarizeFunction
  def setDisplayName(name: java.lang.String): PivotValue
  def setFormula(formula: java.lang.String): PivotValue
  def showAs(displayType: PivotValueDisplayType): PivotValue
  def summarizeBy(summarizeFunction: PivotTableSummarizeFunction): PivotValue
}

object PivotValue {
  @scala.inline
  def apply(
    getDisplayType: js.Function0[PivotValueDisplayType],
    getFormula: js.Function0[java.lang.String],
    getPivotTable: js.Function0[PivotTable],
    getSummarizedBy: js.Function0[PivotTableSummarizeFunction],
    setDisplayName: js.Function1[java.lang.String, PivotValue],
    setFormula: js.Function1[java.lang.String, PivotValue],
    showAs: js.Function1[PivotValueDisplayType, PivotValue],
    summarizeBy: js.Function1[PivotTableSummarizeFunction, PivotValue]
  ): PivotValue = {
    val __obj = js.Dynamic.literal(getDisplayType = getDisplayType, getFormula = getFormula, getPivotTable = getPivotTable, getSummarizedBy = getSummarizedBy, setDisplayName = setDisplayName, setFormula = setFormula, showAs = showAs, summarizeBy = summarizeBy)
  
    __obj.asInstanceOf[PivotValue]
  }
}

