package typings.fullcalendar.timeGridMod

import typings.fullcalendar.AnonBottomTop
import typings.moment.mod.Duration_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/TimeGrid", "Default")
@js.native
class Default_ protected ()
  extends typings.fullcalendar.interactiveDateComponentMod.default {
  def this(view: js.Any) = this()
  var bgContainerEls: js.Any = js.native
  @JSName("bookendCells")
  var bookendCells_Original: js.Function1[/* trEl */ js.Any, _] = js.native
  var bottomRuleEl: js.Any = js.native
  var businessContainerEls: js.Any = js.native
  var businessSegs: js.Any = js.native
  var colCnt: /* import warning: importer.ImportType#apply Failed type conversion: fullcalendar.fullcalendar/DayTableMixin.DayTableInterface['colCnt'] */ js.Any = js.native
  var colContainerEls: js.Any = js.native
  var colCoordCache: js.Any = js.native
  var colEls: js.Any = js.native
  var contentSkeletonEl: js.Any = js.native
  var dayDates: /* import warning: importer.ImportType#apply Failed type conversion: fullcalendar.fullcalendar/DayTableMixin.DayTableInterface['dayDates'] */ js.Any = js.native
  var dayRanges: js.Any = js.native
  var daysPerRow: /* import warning: importer.ImportType#apply Failed type conversion: fullcalendar.fullcalendar/DayTableMixin.DayTableInterface['daysPerRow'] */ js.Any = js.native
  var fgContainerEls: js.Any = js.native
  @JSName("getCellDate")
  var getCellDate_Original: js.Function2[/* row */ js.Any, /* col */ js.Any, _] = js.native
  var headContainerEl: js.Any = js.native
  var helperContainerEls: js.Any = js.native
  var helperSegs: js.Any = js.native
  var highlightContainerEls: js.Any = js.native
  var highlightSegs: js.Any = js.native
  var labelFormat: js.Any = js.native
  var labelInterval: js.Any = js.native
  var nowIndicatorEls: js.Any = js.native
  @JSName("renderBgTrHtml")
  var renderBgTrHtml_Original: js.Function1[/* row */ js.Any, _] = js.native
  @JSName("renderHeadHtml")
  var renderHeadHtml_Original: js.Function0[_] = js.native
  var slatContainerEl: js.Any = js.native
  var slatCoordCache: js.Any = js.native
  var slatEls: js.Any = js.native
  var slotDuration: js.Any = js.native
  var snapDuration: js.Any = js.native
  var snapsPerSlot: js.Any = js.native
  @JSName("updateDayTable")
  var updateDayTable_Original: js.Function0[_] = js.native
  var view: js.Any = js.native
  def assignSegVerticals(segs: js.Any): Unit = js.native
  def attachSegsByCol(segsByCol: js.Any, containerEls: js.Any): Unit = js.native
  def bookendCells(trEl: js.Any): js.Any = js.native
  def computeDateTop(ms: js.Any, startOfDayDate: js.Any): js.Any = js.native
  def computeLabelInterval(slotDuration: js.Any): js.Any = js.native
  def computeSegVerticals(segs: js.Any): Unit = js.native
  def computeSnapTime(snapIndex: js.Any): Duration_ = js.native
  def computeTimeTop(time: js.Any): js.Any = js.native
  def generateSegVerticalCss(seg: js.Any): AnonBottomTop = js.native
  def getCellDate(row: js.Any, col: js.Any): js.Any = js.native
  def getTotalSlatHeight(): js.Any = js.native
  def groupSegsByCol(segs: js.Any): js.Array[_] = js.native
  def processOptions(): Unit = js.native
  def renderBgTrHtml(row: js.Any): js.Any = js.native
  def renderColumns(): Unit = js.native
  def renderContentSkeleton(): Unit = js.native
  def renderHeadHtml(): js.Any = js.native
  def renderSlatRowHtml(): String = js.native
  def renderSlats(): Unit = js.native
  def sliceRangeByTimes(unzonedRange: js.Any): js.Array[_] = js.native
  def unrenderColumns(): Unit = js.native
  def unrenderContentSkeleton(): Unit = js.native
  def updateDayTable(): js.Any = js.native
  def updateSegVerticals(segs: js.Any): Unit = js.native
}

