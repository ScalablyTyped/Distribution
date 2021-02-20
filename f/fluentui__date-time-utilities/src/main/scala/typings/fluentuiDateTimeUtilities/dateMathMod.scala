package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Date
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMathMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "addDays")
  @js.native
  def addDays(date: Date, days: Double): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "addMonths")
  @js.native
  def addMonths(date: Date, months: Double): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "addWeeks")
  @js.native
  def addWeeks(date: Date, weeks: Double): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "addYears")
  @js.native
  def addYears(date: Date, years: Double): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "compareDatePart")
  @js.native
  def compareDatePart(date1: Date, date2: Date): Number = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "compareDates")
  @js.native
  def compareDates(date1: Date, date2: Date): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDatePartHashValue")
  @js.native
  def getDatePartHashValue(date: Date): Double = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(date: Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.UndefOr[scala.Nothing],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getEndDateOfWeek")
  @js.native
  def getEndDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getMonthEnd")
  @js.native
  def getMonthEnd(date: Date): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getMonthStart")
  @js.native
  def getMonthStart(date: Date): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getStartDateOfWeek")
  @js.native
  def getStartDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getWeekNumber")
  @js.native
  def getWeekNumber(date: Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getWeekNumbersInMonth")
  @js.native
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: Date
  ): js.Array[Double] = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getYearEnd")
  @js.native
  def getYearEnd(date: Date): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getYearStart")
  @js.native
  def getYearStart(date: Date): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "isInDateRangeArray")
  @js.native
  def isInDateRangeArray(date: Date, dateRange: js.Array[Date]): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "setMonth")
  @js.native
  def setMonth(date: Date, month: Double): Date = js.native
}
