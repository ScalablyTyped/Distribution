package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "DateProfileGenerator")
@js.native
open class DateProfileGenerator protected () extends StObject {
  def this(props: DateProfileGeneratorProps) = this()
  
  def adjustActiveRange(range: DateRange): End = js.native
  
  def build(currentDate: js.Date): DateProfile = js.native
  def build(currentDate: js.Date, direction: Any): DateProfile = js.native
  def build(currentDate: js.Date, direction: Any, forceToValid: Boolean): DateProfile = js.native
  def build(currentDate: js.Date, direction: Unit, forceToValid: Boolean): DateProfile = js.native
  
  def buildCurrentRangeInfo(date: js.Date, direction: Any): typings.fullcalendarCommon.anon.Duration = js.native
  
  def buildCustomVisibleRange(date: js.Date): DateRange = js.native
  
  def buildDateIncrement(fallback: Any): Duration = js.native
  
  def buildNext(currentDateProfile: DateProfile, currentDate: js.Date): DateProfile = js.native
  def buildNext(currentDateProfile: DateProfile, currentDate: js.Date, forceToValid: Boolean): DateProfile = js.native
  
  def buildPrev(currentDateProfile: DateProfile, currentDate: js.Date): DateProfile = js.native
  def buildPrev(currentDateProfile: DateProfile, currentDate: js.Date, forceToValid: Boolean): DateProfile = js.native
  
  def buildRangeFromDayCount(date: js.Date, direction: Any, dayCount: Any): End = js.native
  
  def buildRangeFromDuration(date: js.Date, direction: Any, duration: Duration, unit: Any): Any = js.native
  
  def buildRenderRange(currentRange: DateRange, currentRangeUnit: Any, isRangeAllDay: Any): DateRange = js.native
  
  def buildValidRange(): OpenDateRange = js.native
  
  def getFallbackDuration(): Duration = js.native
  
  def initHiddenDays(): Unit = js.native
  
  def isHiddenDay(day: Any): Boolean = js.native
  
  var isHiddenDayHash: js.Array[Boolean] = js.native
  
  var nowDate: js.Date = js.native
  
  /* protected */ var props: DateProfileGeneratorProps = js.native
  
  def refineRange(): DateRange | Null = js.native
  def refineRange(rangeInput: DateRangeInput): DateRange | Null = js.native
  
  def skipHiddenDays(date: js.Date): js.Date = js.native
  def skipHiddenDays(date: js.Date, inc: Double): js.Date = js.native
  def skipHiddenDays(date: js.Date, inc: Double, isExclusive: Boolean): js.Date = js.native
  def skipHiddenDays(date: js.Date, inc: Unit, isExclusive: Boolean): js.Date = js.native
  
  def trimHiddenDays(range: DateRange): DateRange | Null = js.native
}
