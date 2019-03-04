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

object PivotGroup {
  @scala.inline
  def apply(
    addManualGroupingRule: js.Function2[java.lang.String, js.Array[js.Object], PivotGroup],
    areLabelsRepeated: js.Function0[scala.Boolean],
    clearGroupingRule: js.Function0[PivotGroup],
    clearSort: js.Function0[PivotGroup],
    getDimension: js.Function0[Dimension],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPivotTable: js.Function0[PivotTable],
    getSourceDataColumn: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    hideRepeatedLabels: js.Function0[PivotGroup],
    isSortAscending: js.Function0[scala.Boolean],
    moveToIndex: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, PivotGroup],
    remove: js.Function0[scala.Unit],
    removeManualGroupingRule: js.Function1[java.lang.String, PivotGroup],
    resetDisplayName: js.Function0[PivotGroup],
    setDisplayName: js.Function1[java.lang.String, PivotGroup],
    setHistogramGroupingRule: js.Function3[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      PivotGroup
    ],
    showRepeatedLabels: js.Function0[PivotGroup],
    showTotals: js.Function1[scala.Boolean, PivotGroup],
    sortAscending: js.Function0[PivotGroup],
    sortBy: js.Function2[PivotValue, js.Array[js.Object], PivotGroup],
    sortDescending: js.Function0[PivotGroup],
    totalsAreShown: js.Function0[scala.Boolean]
  ): PivotGroup = {
    val __obj = js.Dynamic.literal(addManualGroupingRule = addManualGroupingRule, areLabelsRepeated = areLabelsRepeated, clearGroupingRule = clearGroupingRule, clearSort = clearSort, getDimension = getDimension, getIndex = getIndex, getPivotTable = getPivotTable, getSourceDataColumn = getSourceDataColumn, hideRepeatedLabels = hideRepeatedLabels, isSortAscending = isSortAscending, moveToIndex = moveToIndex, remove = remove, removeManualGroupingRule = removeManualGroupingRule, resetDisplayName = resetDisplayName, setDisplayName = setDisplayName, setHistogramGroupingRule = setHistogramGroupingRule, showRepeatedLabels = showRepeatedLabels, showTotals = showTotals, sortAscending = sortAscending, sortBy = sortBy, sortDescending = sortDescending, totalsAreShown = totalsAreShown)
  
    __obj.asInstanceOf[PivotGroup]
  }
}

