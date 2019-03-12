package typings
package fullcalendarLib.dayGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DayGrid", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.interactiveDateComponentMod.default {
  def this(view: js.Any) = this()
  var bottomCoordPadding: scala.Double = js.native
  var cellEls: js.Any = js.native
  var cellWeekNumbersVisible: scala.Boolean = js.native
  var colCnt: js.Any = js.native
  var colCoordCache: js.Any = js.native
  var daysPerRow: js.Any = js.native
  @JSName("getCellDate")
  var getCellDate_Original: js.Function2[/* row */ js.Any, /* col */ js.Any, _] = js.native
  @JSName("getCellRange")
  var getCellRange_Original: js.Function2[/* row */ js.Any, /* col */ js.Any, _] = js.native
  var headContainerEl: js.Any = js.native
  var isRigid: scala.Boolean = js.native
  var popoverSegs: js.Any = js.native
  @JSName("renderBgTrHtml")
  var renderBgTrHtml_Original: js.Function1[/* row */ js.Any, _] = js.native
  @JSName("renderHeadHtml")
  var renderHeadHtml_Original: js.Function0[_] = js.native
  @JSName("renderIntroHtml")
  var renderIntroHtml_Original: js.Function0[_] = js.native
  var rowCnt: js.Any = js.native
  var rowCoordCache: js.Any = js.native
  var rowEls: js.Any = js.native
  var segPopover: js.Any = js.native
  @JSName("sliceRangeByDay")
  var sliceRangeByDay_Original: js.Function1[/* unzonedRange */ js.Any, _] = js.native
  @JSName("sliceRangeByRow")
  var sliceRangeByRow_Original: js.Function1[/* unzonedRange */ js.Any, _] = js.native
  @JSName("updateDayTable")
  var updateDayTable_Original: js.Function0[_] = js.native
  var view: js.Any = js.native
  def computeRowLevelLimit(row: js.Any): scala.Double | fullcalendarLib.fullcalendarLibNumbers.`false` = js.native
  def getCellDate(row: js.Any, col: js.Any): js.Any = js.native
  def getCellEl(row: js.Any, col: js.Any): js.Any = js.native
  def getCellHit(row: js.Any, col: js.Any): js.Any = js.native
  def getCellRange(row: js.Any, col: js.Any): js.Any = js.native
  def getCellSegs(row: js.Any, col: js.Any): js.Array[_] = js.native
  def getCellSegs(row: js.Any, col: js.Any, startLevel: js.Any): js.Array[_] = js.native
  def getIsDayNumbersVisible(): scala.Boolean = js.native
  def getIsNumbersVisible(): scala.Boolean = js.native
  def getMoreLinkText(num: js.Any): js.Any = js.native
  def limitRow(row: js.Any, levelLimit: js.Any): scala.Unit = js.native
  def limitRows(levelLimit: js.Any): scala.Unit = js.native
  def removeSegPopover(): scala.Unit = js.native
  def renderBgTrHtml(row: js.Any): js.Any = js.native
  def renderDayRowHtml(row: js.Any, isRigid: js.Any): java.lang.String = js.native
  def renderGrid(): scala.Unit = js.native
  def renderHeadHtml(): js.Any = js.native
  def renderIntroHtml(): js.Any = js.native
  def renderMoreLink(row: js.Any, col: js.Any, hiddenSegs: js.Any): fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery = js.native
  def renderNumberCellHtml(date: js.Any): java.lang.String = js.native
  def renderNumberCellsHtml(row: js.Any): java.lang.String = js.native
  def renderNumberIntroHtml(row: js.Any): js.Any = js.native
  def renderNumberTrHtml(row: js.Any): java.lang.String = js.native
  def renderSegPopoverContent(row: js.Any, col: js.Any, segs: js.Any): fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery = js.native
  def resliceDaySegs(segs: js.Any, dayDate: js.Any): js.Array[_] = js.native
  def showSegPopover(row: js.Any, col: js.Any, moreLink: js.Any, segs: js.Any): scala.Unit = js.native
  def sliceRangeByDay(unzonedRange: js.Any): js.Any = js.native
  def sliceRangeByRow(unzonedRange: js.Any): js.Any = js.native
  def unlimitRow(row: js.Any): scala.Unit = js.native
  def updateDayTable(): js.Any = js.native
}

@JSImport("fullcalendar/DayGrid", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(view: js.Any) = this()
}

