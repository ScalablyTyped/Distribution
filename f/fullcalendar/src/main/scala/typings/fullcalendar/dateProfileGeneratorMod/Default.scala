package typings.fullcalendar.dateProfileGeneratorMod

import typings.fullcalendar.Anon_ActiveUnzonedRange
import typings.fullcalendar.Anon_Duration
import typings.moment.momentMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DateProfileGenerator", "Default")
@js.native
class Default protected () extends js.Object {
  def this(_view: js.Any) = this()
  var _view: js.Any = js.native
  def adjustActiveRange(unzonedRange: js.Any, minTime: js.Any, maxTime: js.Any): typings.fullcalendar.unzonedRangeMod.default = js.native
  def build(date: js.Any, direction: js.Any): Anon_ActiveUnzonedRange = js.native
  def build(date: js.Any, direction: js.Any, forceToValid: Boolean): Anon_ActiveUnzonedRange = js.native
  def buildCurrentRangeInfo(date: js.Any, direction: js.Any): Anon_Duration = js.native
  def buildCustomVisibleRange(date: js.Any): js.Any = js.native
  def buildDateIncrement(fallback: js.Any): js.Any = js.native
  def buildNext(currentDateProfile: js.Any): Anon_ActiveUnzonedRange = js.native
  def buildPrev(currentDateProfile: js.Any): Anon_ActiveUnzonedRange = js.native
  def buildRangeFromDayCount(date: js.Any, direction: js.Any, dayCount: js.Any): typings.fullcalendar.unzonedRangeMod.default = js.native
  def buildRangeFromDuration(date: js.Any, direction: js.Any, duration: js.Any, unit: js.Any): js.Any = js.native
  def buildRenderRange(currentUnzonedRange: js.Any, currentRangeUnit: js.Any, isRangeAllDay: js.Any): js.Any = js.native
  def buildValidRange(): js.Any = js.native
  def getFallbackDuration(): Duration = js.native
  def msToUtcMoment(ms: js.Any, forceAllDay: js.Any): js.Any = js.native
  def opt(name: js.Any): js.Any = js.native
  def trimHiddenDays(unzonedRange: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/DateProfileGenerator", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(_view: js.Any) = this()
}

