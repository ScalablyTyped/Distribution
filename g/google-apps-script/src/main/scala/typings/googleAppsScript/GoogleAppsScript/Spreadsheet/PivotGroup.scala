package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot table breakout groups.
  */
trait PivotGroup extends js.Object {
  def addManualGroupingRule(groupName: String, groupMembers: js.Array[_]): PivotGroup
  def areLabelsRepeated(): Boolean
  def clearGroupingRule(): PivotGroup
  def clearSort(): PivotGroup
  def getDimension(): Dimension
  def getIndex(): Integer
  def getPivotTable(): PivotTable
  def getSourceDataColumn(): Integer
  def hideRepeatedLabels(): PivotGroup
  def isSortAscending(): Boolean
  def moveToIndex(index: Integer): PivotGroup
  def remove(): Unit
  def removeManualGroupingRule(groupName: String): PivotGroup
  def resetDisplayName(): PivotGroup
  def setDisplayName(name: String): PivotGroup
  def setHistogramGroupingRule(minValue: Integer, maxValue: Integer, intervalSize: Integer): PivotGroup
  def showRepeatedLabels(): PivotGroup
  def showTotals(showTotals: Boolean): PivotGroup
  def sortAscending(): PivotGroup
  def sortBy(value: PivotValue, oppositeGroupValues: js.Array[_]): PivotGroup
  def sortDescending(): PivotGroup
  def totalsAreShown(): Boolean
}

object PivotGroup {
  @scala.inline
  def apply(
    addManualGroupingRule: (String, js.Array[_]) => PivotGroup,
    areLabelsRepeated: () => Boolean,
    clearGroupingRule: () => PivotGroup,
    clearSort: () => PivotGroup,
    getDimension: () => Dimension,
    getIndex: () => Integer,
    getPivotTable: () => PivotTable,
    getSourceDataColumn: () => Integer,
    hideRepeatedLabels: () => PivotGroup,
    isSortAscending: () => Boolean,
    moveToIndex: Integer => PivotGroup,
    remove: () => Unit,
    removeManualGroupingRule: String => PivotGroup,
    resetDisplayName: () => PivotGroup,
    setDisplayName: String => PivotGroup,
    setHistogramGroupingRule: (Integer, Integer, Integer) => PivotGroup,
    showRepeatedLabels: () => PivotGroup,
    showTotals: Boolean => PivotGroup,
    sortAscending: () => PivotGroup,
    sortBy: (PivotValue, js.Array[_]) => PivotGroup,
    sortDescending: () => PivotGroup,
    totalsAreShown: () => Boolean
  ): PivotGroup = {
    val __obj = js.Dynamic.literal(addManualGroupingRule = js.Any.fromFunction2(addManualGroupingRule), areLabelsRepeated = js.Any.fromFunction0(areLabelsRepeated), clearGroupingRule = js.Any.fromFunction0(clearGroupingRule), clearSort = js.Any.fromFunction0(clearSort), getDimension = js.Any.fromFunction0(getDimension), getIndex = js.Any.fromFunction0(getIndex), getPivotTable = js.Any.fromFunction0(getPivotTable), getSourceDataColumn = js.Any.fromFunction0(getSourceDataColumn), hideRepeatedLabels = js.Any.fromFunction0(hideRepeatedLabels), isSortAscending = js.Any.fromFunction0(isSortAscending), moveToIndex = js.Any.fromFunction1(moveToIndex), remove = js.Any.fromFunction0(remove), removeManualGroupingRule = js.Any.fromFunction1(removeManualGroupingRule), resetDisplayName = js.Any.fromFunction0(resetDisplayName), setDisplayName = js.Any.fromFunction1(setDisplayName), setHistogramGroupingRule = js.Any.fromFunction3(setHistogramGroupingRule), showRepeatedLabels = js.Any.fromFunction0(showRepeatedLabels), showTotals = js.Any.fromFunction1(showTotals), sortAscending = js.Any.fromFunction0(sortAscending), sortBy = js.Any.fromFunction2(sortBy), sortDescending = js.Any.fromFunction0(sortDescending), totalsAreShown = js.Any.fromFunction0(totalsAreShown))
    __obj.asInstanceOf[PivotGroup]
  }
}

