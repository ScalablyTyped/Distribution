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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/date-time-utilities", "DAYS_IN_WEEK")
  @js.native
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_CALENDAR_STRINGS")
  @js.native
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_DATE_FORMATTING")
  @js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_LOCALIZED_STRINGS")
  @js.native
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType with Double] = js.native
    
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day with Double = js.native
    
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month with Double = js.native
    
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week with Double = js.native
    
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek with Double] = js.native
    
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday with Double = js.native
    
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday with Double = js.native
    
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear with Double] = js.native
    
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "MonthOfYear")
  @js.native
  object MonthOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear with Double] = js.native
    
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
  }
  
  @JSImport("@fluentui/date-time-utilities", "addDays")
  @js.native
  def addDays(date: Date, days: Double): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "addMonths")
  @js.native
  def addMonths(date: Date, months: Double): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "addWeeks")
  @js.native
  def addWeeks(date: Date, weeks: Double): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "addYears")
  @js.native
  def addYears(date: Date, years: Double): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "compareDatePart")
  @js.native
  def compareDatePart(date1: Date, date2: Date): Number = js.native
  
  @JSImport("@fluentui/date-time-utilities", "compareDates")
  @js.native
  def compareDates(date1: Date, date2: Date): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities", "findAvailableDate")
  @js.native
  def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[Date] = js.native
  
  @JSImport("@fluentui/date-time-utilities", "formatDay")
  @js.native
  def formatDay(date: Date): String = js.native
  
  @JSImport("@fluentui/date-time-utilities", "formatMonthDayYear")
  @js.native
  def formatMonthDayYear(date: Date, strings: IDateGridStrings): String = js.native
  
  @JSImport("@fluentui/date-time-utilities", "formatMonthYear")
  @js.native
  def formatMonthYear(date: Date, strings: IDateGridStrings): String = js.native
  
  @JSImport("@fluentui/date-time-utilities", "formatYear")
  @js.native
  def formatYear(date: Date): String = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getBoundedDateRange")
  @js.native
  def getBoundedDateRange(dateRange: js.Array[Date]): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities", "getBoundedDateRange")
  @js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: js.UndefOr[scala.Nothing], maxDate: Date): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities", "getBoundedDateRange")
  @js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities", "getBoundedDateRange")
  @js.native
  def getBoundedDateRange(dateRange: js.Array[Date], minDate: Date, maxDate: Date): js.Array[Date] = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getDatePartHashValue")
  @js.native
  def getDatePartHashValue(date: Date): Double = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getDateRangeArray")
  @js.native
  def getDateRangeArray(date: Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.UndefOr[scala.Nothing],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[Date] = js.native
  @JSImport("@fluentui/date-time-utilities", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[Date] = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getDateRangeTypeToUse")
  @js.native
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.UndefOr[scala.Nothing], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  @JSImport("@fluentui/date-time-utilities", "getDateRangeTypeToUse")
  @js.native
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getDayGrid")
  @js.native
  def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getEndDateOfWeek")
  @js.native
  def getEndDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getMonthEnd")
  @js.native
  def getMonthEnd(date: Date): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getMonthStart")
  @js.native
  def getMonthStart(date: Date): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getStartDateOfWeek")
  @js.native
  def getStartDateOfWeek(date: Date, firstDayOfWeek: DayOfWeek): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getWeekNumber")
  @js.native
  def getWeekNumber(date: Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getWeekNumbersInMonth")
  @js.native
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: Date
  ): js.Array[Double] = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getYearEnd")
  @js.native
  def getYearEnd(date: Date): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "getYearStart")
  @js.native
  def getYearStart(date: Date): Date = js.native
  
  @JSImport("@fluentui/date-time-utilities", "isAfterMaxDate")
  @js.native
  def isAfterMaxDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities", "isBeforeMinDate")
  @js.native
  def isBeforeMinDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities", "isContiguous")
  @js.native
  def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities", "isInDateRangeArray")
  @js.native
  def isInDateRangeArray(date: Date, dateRange: js.Array[Date]): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities", "isRestrictedDate")
  @js.native
  def isRestrictedDate(date: Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities", "setMonth")
  @js.native
  def setMonth(date: Date, month: Double): Date = js.native
}
