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

