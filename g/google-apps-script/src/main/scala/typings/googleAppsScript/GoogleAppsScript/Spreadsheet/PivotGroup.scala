package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot table breakout groups.
  */
@js.native
trait PivotGroup extends js.Object {
  def addManualGroupingRule(groupName: String, groupMembers: js.Array[_]): PivotGroup = js.native
  def areLabelsRepeated(): Boolean = js.native
  def clearGroupingRule(): PivotGroup = js.native
  def clearSort(): PivotGroup = js.native
  def getDimension(): Dimension = js.native
  def getIndex(): Integer = js.native
  def getPivotTable(): PivotTable = js.native
  def getSourceDataColumn(): Integer = js.native
  def hideRepeatedLabels(): PivotGroup = js.native
  def isSortAscending(): Boolean = js.native
  def moveToIndex(index: Integer): PivotGroup = js.native
  def remove(): Unit = js.native
  def removeManualGroupingRule(groupName: String): PivotGroup = js.native
  def resetDisplayName(): PivotGroup = js.native
  def setDisplayName(name: String): PivotGroup = js.native
  def setHistogramGroupingRule(minValue: Integer, maxValue: Integer, intervalSize: Integer): PivotGroup = js.native
  def showRepeatedLabels(): PivotGroup = js.native
  def showTotals(showTotals: Boolean): PivotGroup = js.native
  def sortAscending(): PivotGroup = js.native
  def sortBy(value: PivotValue, oppositeGroupValues: js.Array[_]): PivotGroup = js.native
  def sortDescending(): PivotGroup = js.native
  def totalsAreShown(): Boolean = js.native
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
  @scala.inline
  implicit class PivotGroupOps[Self <: PivotGroup] (val x: Self) extends AnyVal {
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
    def setAddManualGroupingRule(value: (String, js.Array[_]) => PivotGroup): Self = this.set("addManualGroupingRule", js.Any.fromFunction2(value))
    @scala.inline
    def setAreLabelsRepeated(value: () => Boolean): Self = this.set("areLabelsRepeated", js.Any.fromFunction0(value))
    @scala.inline
    def setClearGroupingRule(value: () => PivotGroup): Self = this.set("clearGroupingRule", js.Any.fromFunction0(value))
    @scala.inline
    def setClearSort(value: () => PivotGroup): Self = this.set("clearSort", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDimension(value: () => Dimension): Self = this.set("getDimension", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPivotTable(value: () => PivotTable): Self = this.set("getPivotTable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSourceDataColumn(value: () => Integer): Self = this.set("getSourceDataColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setHideRepeatedLabels(value: () => PivotGroup): Self = this.set("hideRepeatedLabels", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSortAscending(value: () => Boolean): Self = this.set("isSortAscending", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveToIndex(value: Integer => PivotGroup): Self = this.set("moveToIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveManualGroupingRule(value: String => PivotGroup): Self = this.set("removeManualGroupingRule", js.Any.fromFunction1(value))
    @scala.inline
    def setResetDisplayName(value: () => PivotGroup): Self = this.set("resetDisplayName", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDisplayName(value: String => PivotGroup): Self = this.set("setDisplayName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHistogramGroupingRule(value: (Integer, Integer, Integer) => PivotGroup): Self = this.set("setHistogramGroupingRule", js.Any.fromFunction3(value))
    @scala.inline
    def setShowRepeatedLabels(value: () => PivotGroup): Self = this.set("showRepeatedLabels", js.Any.fromFunction0(value))
    @scala.inline
    def setShowTotals(value: Boolean => PivotGroup): Self = this.set("showTotals", js.Any.fromFunction1(value))
    @scala.inline
    def setSortAscending(value: () => PivotGroup): Self = this.set("sortAscending", js.Any.fromFunction0(value))
    @scala.inline
    def setSortBy(value: (PivotValue, js.Array[_]) => PivotGroup): Self = this.set("sortBy", js.Any.fromFunction2(value))
    @scala.inline
    def setSortDescending(value: () => PivotGroup): Self = this.set("sortDescending", js.Any.fromFunction0(value))
    @scala.inline
    def setTotalsAreShown(value: () => Boolean): Self = this.set("totalsAreShown", js.Any.fromFunction0(value))
  }
  
}

