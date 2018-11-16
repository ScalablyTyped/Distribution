package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PivotGroup extends js.Object {
  def addManualGroupingRule(groupName: java.lang.String, groupMembers: js.Array[js.Object]): PivotGroup
  def areLabelsRepeated(): scala.Boolean
  def clearGroupingRule(): PivotGroup
  def clearSort(): PivotGroup
  def getDimension(): Dimension
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPivotTable(): PivotTable
  def getSourceDataColumn(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def hideRepeatedLabels(): PivotGroup
  def isSortAscending(): scala.Boolean
  def moveToIndex(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PivotGroup
  def remove(): scala.Unit
  def removeManualGroupingRule(groupName: java.lang.String): PivotGroup
  def resetDisplayName(): PivotGroup
  def setDisplayName(name: java.lang.String): PivotGroup
  def setHistogramGroupingRule(
    minValue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    maxValue: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    intervalSize: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PivotGroup
  def showRepeatedLabels(): PivotGroup
  def showTotals(showTotals: scala.Boolean): PivotGroup
  def sortAscending(): PivotGroup
  def sortBy(value: PivotValue, oppositeGroupValues: js.Array[js.Object]): PivotGroup
  def sortDescending(): PivotGroup
  def totalsAreShown(): scala.Boolean
}

