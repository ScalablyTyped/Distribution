package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.ICalendarStrings
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateFormatting
import typings.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IAvailableDateOptions
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDay
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDayGridOptions
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typings.std.Date
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluentui/date-time-utilities", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  def addDays(date: Date, days: Double): Date = js.native
  def addMonths(date: Date, months: Double): Date = js.native
  def addWeeks(date: Date, weeks: Double): Date = js.native
  def addYears(date: Date, years: Double): Date = js.native
  def compareDatePart(date1: Date, date2: Date): Number = js.native
  def compareDates(date1: Date, date2: Date): Boolean = js.native
  def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[Date] = js.native
  def formatDay(date: Date): String = js.native
  def formatMonthDayYear(date: Date, strings: IDateGridStrings): String = js.native
  def formatMonthYear(date: Date, strings: IDateGridStrings): String = js.native
  def formatYear(date: Date): String = js.native
  def getBoundedDateRange(dateRange: js.Array[Date]): js.Array[Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: js.UndefOr[scala.Nothing], maxDate: Date): js.Array[Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date): js.Array[Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date, maxDate: Date): js.Array[Date] = js.native
  def getDateRangeArray(date: Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[Date] = js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.UndefOr[scala.Nothing],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[Date] = js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.UndefOr[scala.Nothing], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = js.native
  def getMonthEnd(date: Date): Date = js.native
  def getMonthStart(date: Date): Date = js.native
  def getStartDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = js.native
  def getWeekNumber(date: Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: Date
  ): js.Array[Double] = js.native
  def getYearEnd(date: Date): Date = js.native
  def getYearStart(date: Date): Date = js.native
  def isAfterMaxDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
  def isBeforeMinDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
  def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = js.native
  def isInDateRangeArray(date: Date, dateRange: js.Array[Date]): Boolean = js.native
  def isRestrictedDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
  def setMonth(date: Date, month: Double): Date = js.native
  @js.native
  object DateRangeType extends js.Object {
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day with Double = js.native
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month with Double = js.native
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week with Double = js.native
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType with Double] = js.native
  }
  
  @js.native
  object DayOfWeek extends js.Object {
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday with Double = js.native
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday with Double = js.native
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek with Double] = js.native
  }
  
  @js.native
  object FirstWeekOfYear extends js.Object {
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear with Double] = js.native
  }
  
  @js.native
  object MonthOfYear extends js.Object {
    /* 3 */ val April: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.April with Double = js.native
    /* 7 */ val August: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.August with Double = js.native
    /* 11 */ val December: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.December with Double = js.native
    /* 1 */ val February: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.February with Double = js.native
    /* 0 */ val January: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.January with Double = js.native
    /* 6 */ val July: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.July with Double = js.native
    /* 5 */ val June: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.June with Double = js.native
    /* 2 */ val March: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.March with Double = js.native
    /* 4 */ val May: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.May with Double = js.native
    /* 10 */ val November: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.November with Double = js.native
    /* 9 */ val October: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.October with Double = js.native
    /* 8 */ val September: typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.September with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear with Double] = js.native
  }
  
}

