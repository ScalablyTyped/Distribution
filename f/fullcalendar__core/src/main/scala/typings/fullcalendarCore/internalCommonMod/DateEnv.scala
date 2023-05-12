package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.anon.DefaultSeparator
import typings.fullcalendarCore.anon.ForcedTzo
import typings.fullcalendarCore.anon.Unit
import typings.fullcalendarCore.anon.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateEnv extends StObject {
  
  def add(marker: js.Date, dur: Duration): js.Date = js.native
  
  def addMonths(marker: js.Date, n: Double): js.Date = js.native
  
  def addYears(marker: js.Date, n: Double): js.Date = js.native
  
  var calendarSystem: CalendarSystem = js.native
  
  var canComputeOffset: Boolean = js.native
  
  var cmdFormatter: js.UndefOr[CmdFormatterFunc] = js.native
  
  def computeWeekNumber(marker: js.Date): Double = js.native
  
  def countDurationsBetween(m0: js.Date, m1: js.Date, d: Duration): Double = js.native
  
  def createMarker(input: DateInput): js.Date = js.native
  
  def createMarkerMeta(input: DateInput): DateMarkerMeta = js.native
  
  def createNowMarker(): js.Date = js.native
  
  var defaultSeparator: String = js.native
  
  def diffWholeMonths(m0: js.Date, m1: js.Date): Double = js.native
  
  def diffWholeYears(m0: js.Date, m1: js.Date): Double = js.native
  
  def format(marker: js.Date, formatter: DateFormatter): String = js.native
  def format(marker: js.Date, formatter: DateFormatter, dateOptions: `8`): String = js.native
  
  def formatIso(marker: js.Date): String = js.native
  def formatIso(marker: js.Date, extraOptions: Any): String = js.native
  
  def formatRange(start: js.Date, end: js.Date, formatter: DateFormatter): String = js.native
  def formatRange(start: js.Date, end: js.Date, formatter: DateFormatter, dateOptions: DefaultSeparator): String = js.native
  
  def getDay(marker: js.Date): Double = js.native
  
  def getMonth(marker: js.Date): Double = js.native
  
  def getYear(marker: js.Date): Double = js.native
  
  def greatestWholeUnit(m0: js.Date, m1: js.Date): Unit = js.native
  
  var locale: Locale = js.native
  
  var namedTimeZoneImpl: NamedTimeZoneImpl = js.native
  
  def offsetForMarker(m: js.Date): Double = js.native
  
  def parse(s: String): ForcedTzo = js.native
  
  def startOf(m: js.Date, unit: String): js.Date = js.native
  
  def startOfMonth(m: js.Date): js.Date = js.native
  
  def startOfWeek(m: js.Date): js.Date = js.native
  
  def startOfYear(m: js.Date): js.Date = js.native
  
  def subtract(marker: js.Date, dur: Duration): js.Date = js.native
  
  var timeZone: String = js.native
  
  def timestampToMarker(ms: Double): js.Date = js.native
  
  def toDate(m: js.Date): js.Date = js.native
  def toDate(m: js.Date, forcedTzo: Double): js.Date = js.native
  
  var weekDow: Double = js.native
  
  var weekDoy: Double = js.native
  
  var weekNumberFunc: Any = js.native
  
  var weekText: String = js.native
  
  var weekTextLong: String = js.native
}
