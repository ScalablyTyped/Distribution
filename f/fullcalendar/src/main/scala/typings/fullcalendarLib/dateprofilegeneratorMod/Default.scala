package typings
package fullcalendarLib.dateprofilegeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DateProfileGenerator", "Default")
@js.native
class Default protected () extends js.Object {
  def this(_view: js.Any) = this()
  var _view: js.Any = js.native
  def adjustActiveRange(unzonedRange: js.Any, minTime: js.Any, maxTime: js.Any): fullcalendarLib.unzonedrangeMod.default = js.native
  def build(date: js.Any, direction: js.Any): fullcalendarLib.Anon_MaxTime = js.native
  def build(date: js.Any, direction: js.Any, forceToValid: scala.Boolean): fullcalendarLib.Anon_MaxTime = js.native
  def buildCurrentRangeInfo(date: js.Any, direction: js.Any): fullcalendarLib.Anon_Duration = js.native
  def buildCustomVisibleRange(date: js.Any): js.Any = js.native
  def buildDateIncrement(fallback: js.Any): js.Any = js.native
  def buildNext(currentDateProfile: js.Any): fullcalendarLib.Anon_MaxTime = js.native
  def buildPrev(currentDateProfile: js.Any): fullcalendarLib.Anon_MaxTime = js.native
  def buildRangeFromDayCount(date: js.Any, direction: js.Any, dayCount: js.Any): fullcalendarLib.unzonedrangeMod.default = js.native
  def buildRangeFromDuration(date: js.Any, direction: js.Any, duration: js.Any, unit: js.Any): js.Any = js.native
  def buildRenderRange(currentUnzonedRange: js.Any, currentRangeUnit: js.Any, isRangeAllDay: js.Any): js.Any = js.native
  def buildValidRange(): js.Any = js.native
  def getFallbackDuration(): momentLib.momentMod.momentNs.Duration = js.native
  def msToUtcMoment(ms: js.Any, forceAllDay: js.Any): js.Any = js.native
  def opt(name: js.Any): js.Any = js.native
  def trimHiddenDays(unzonedRange: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/DateProfileGenerator", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(_view: js.Any) = this()
}

