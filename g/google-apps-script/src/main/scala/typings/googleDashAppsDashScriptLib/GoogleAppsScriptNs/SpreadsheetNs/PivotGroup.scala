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
    addManualGroupingRule: (java.lang.String, js.Array[js.Object]) => PivotGroup,
    areLabelsRepeated: () => scala.Boolean,
    clearGroupingRule: () => PivotGroup,
    clearSort: () => PivotGroup,
    getDimension: () => Dimension,
    getIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getPivotTable: () => PivotTable,
    getSourceDataColumn: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    hideRepeatedLabels: () => PivotGroup,
    isSortAscending: () => scala.Boolean,
    moveToIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => PivotGroup,
    remove: () => scala.Unit,
    removeManualGroupingRule: java.lang.String => PivotGroup,
    resetDisplayName: () => PivotGroup,
    setDisplayName: java.lang.String => PivotGroup,
    setHistogramGroupingRule: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => PivotGroup,
    showRepeatedLabels: () => PivotGroup,
    showTotals: scala.Boolean => PivotGroup,
    sortAscending: () => PivotGroup,
    sortBy: (PivotValue, js.Array[js.Object]) => PivotGroup,
    sortDescending: () => PivotGroup,
    totalsAreShown: () => scala.Boolean
  ): PivotGroup = {
    val __obj = js.Dynamic.literal(addManualGroupingRule = js.Any.fromFunction2(addManualGroupingRule), areLabelsRepeated = js.Any.fromFunction0(areLabelsRepeated), clearGroupingRule = js.Any.fromFunction0(clearGroupingRule), clearSort = js.Any.fromFunction0(clearSort), getDimension = js.Any.fromFunction0(getDimension), getIndex = js.Any.fromFunction0(getIndex), getPivotTable = js.Any.fromFunction0(getPivotTable), getSourceDataColumn = js.Any.fromFunction0(getSourceDataColumn), hideRepeatedLabels = js.Any.fromFunction0(hideRepeatedLabels), isSortAscending = js.Any.fromFunction0(isSortAscending), moveToIndex = js.Any.fromFunction1(moveToIndex), remove = js.Any.fromFunction0(remove), removeManualGroupingRule = js.Any.fromFunction1(removeManualGroupingRule), resetDisplayName = js.Any.fromFunction0(resetDisplayName), setDisplayName = js.Any.fromFunction1(setDisplayName), setHistogramGroupingRule = js.Any.fromFunction3(setHistogramGroupingRule), showRepeatedLabels = js.Any.fromFunction0(showRepeatedLabels), showTotals = js.Any.fromFunction1(showTotals), sortAscending = js.Any.fromFunction0(sortAscending), sortBy = js.Any.fromFunction2(sortBy), sortDescending = js.Any.fromFunction0(sortDescending), totalsAreShown = js.Any.fromFunction0(totalsAreShown))
  
    __obj.asInstanceOf[PivotGroup]
  }
}

