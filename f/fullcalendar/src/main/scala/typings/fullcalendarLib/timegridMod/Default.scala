package typings
package fullcalendarLib.timegridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/TimeGrid", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.interactivedatecomponentMod.default {
  def this(view: js.Any) = this()
  var bgContainerEls: js.Any = js.native
  var bookendCells: js.Function1[/* trEl */ js.Any, _] = js.native
  var bottomRuleEl: js.Any = js.native
  var businessContainerEls: js.Any = js.native
  var businessSegs: js.Any = js.native
  var colCnt: js.Any = js.native
  var colContainerEls: js.Any = js.native
  var colCoordCache: js.Any = js.native
  var colEls: js.Any = js.native
  var contentSkeletonEl: js.Any = js.native
  var dayDates: js.Any = js.native
  var dayRanges: js.Any = js.native
  var daysPerRow: js.Any = js.native
  var fgContainerEls: js.Any = js.native
  var getCellDate: js.Function2[/* row */ js.Any, /* col */ js.Any, _] = js.native
  var headContainerEl: js.Any = js.native
  var helperContainerEls: js.Any = js.native
  var helperSegs: js.Any = js.native
  var highlightContainerEls: js.Any = js.native
  var highlightSegs: js.Any = js.native
  var labelFormat: js.Any = js.native
  var labelInterval: js.Any = js.native
  var nowIndicatorEls: js.Any = js.native
  var renderBgTrHtml: js.Function1[/* row */ js.Any, _] = js.native
  var renderHeadHtml: js.Function0[_] = js.native
  var slatContainerEl: js.Any = js.native
  var slatCoordCache: js.Any = js.native
  var slatEls: js.Any = js.native
  var slotDuration: js.Any = js.native
  var snapDuration: js.Any = js.native
  var snapsPerSlot: js.Any = js.native
  var updateDayTable: js.Function0[_] = js.native
  var view: js.Any = js.native
  def assignSegVerticals(segs: js.Any): scala.Unit = js.native
  def attachSegsByCol(segsByCol: js.Any, containerEls: js.Any): scala.Unit = js.native
  def computeDateTop(ms: js.Any, startOfDayDate: js.Any): js.Any = js.native
  def computeLabelInterval(slotDuration: js.Any): js.Any = js.native
  def computeSegVerticals(segs: js.Any): scala.Unit = js.native
  def computeSnapTime(snapIndex: js.Any): momentLib.momentMod.momentNs.Duration = js.native
  def computeTimeTop(time: js.Any): js.Any = js.native
  def generateSegVerticalCss(seg: js.Any): fullcalendarLib.Anon_BottomTop = js.native
  def getTotalSlatHeight(): js.Any = js.native
  def groupSegsByCol(segs: js.Any): js.Array[_] = js.native
  def processOptions(): scala.Unit = js.native
  def renderColumns(): scala.Unit = js.native
  def renderContentSkeleton(): scala.Unit = js.native
  def renderSlatRowHtml(): java.lang.String = js.native
  def renderSlats(): scala.Unit = js.native
  def sliceRangeByTimes(unzonedRange: js.Any): js.Array[_] = js.native
  def unrenderColumns(): scala.Unit = js.native
  def unrenderContentSkeleton(): scala.Unit = js.native
  def updateSegVerticals(segs: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/TimeGrid", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(view: js.Any) = this()
}

