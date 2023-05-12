package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.libDateFormattingDateFormattingDottypesMod.ICalendarStrings
import typings.fluentuiDateTimeUtilities.libDateFormattingDateFormattingDottypesMod.IDateFormatting
import typings.fluentuiDateTimeUtilities.libDateFormattingDateFormattingDottypesMod.IDateGridStrings
import typings.fluentuiDateTimeUtilities.libDateGridDateGridDottypesMod.IAvailableDateOptions
import typings.fluentuiDateTimeUtilities.libDateGridDateGridDottypesMod.IDay
import typings.fluentuiDateTimeUtilities.libDateGridDateGridDottypesMod.IDayGridOptions
import typings.fluentuiDateTimeUtilities.libDateGridDateGridDottypesMod.IRestrictedDatesOptions
import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek
import typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/date-time-utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DAYS_IN_WEEK")
  @js.native
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_CALENDAR_STRINGS")
  @js.native
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_DATE_FORMATTING")
  @js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DEFAULT_DATE_GRID_STRINGS")
  @js.native
  val DEFAULT_DATE_GRID_STRINGS: IDateGridStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType & Double
      ] = js.native
    
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Day & Double = js.native
    
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Month & Double = js.native
    
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Week & Double = js.native
    
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.WorkWeek & Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek & Double] = js.native
    
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Friday & Double = js.native
    
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Monday & Double = js.native
    
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Saturday & Double = js.native
    
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Sunday & Double = js.native
    
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Thursday & Double = js.native
    
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Tuesday & Double = js.native
    
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Wednesday & Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear & Double
      ] = js.native
    
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstDay & Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstFourDayWeek & Double = js.native
    
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstFullWeek & Double = js.native
  }
  
  @JSImport("@fluentui/date-time-utilities", "MonthOfYear")
  @js.native
  object MonthOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear & Double
      ] = js.native
    
    /* 3 */ val April: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.April & Double = js.native
    
    /* 7 */ val August: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.August & Double = js.native
    
    /* 11 */ val December: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.December & Double = js.native
    
    /* 1 */ val February: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.February & Double = js.native
    
    /* 0 */ val January: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.January & Double = js.native
    
    /* 6 */ val July: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.July & Double = js.native
    
    /* 5 */ val June: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.June & Double = js.native
    
    /* 2 */ val March: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.March & Double = js.native
    
    /* 4 */ val May: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.May & Double = js.native
    
    /* 10 */ val November: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.November & Double = js.native
    
    /* 9 */ val October: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.October & Double = js.native
    
    /* 8 */ val September: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.MonthOfYear.September & Double = js.native
  }
  
  object TimeConstants {
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.DaysInOneWeek")
    @js.native
    def DaysInOneWeek: Double = js.native
    inline def DaysInOneWeek_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DaysInOneWeek")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.HoursInOneDay")
    @js.native
    def HoursInOneDay: Double = js.native
    inline def HoursInOneDay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HoursInOneDay")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.MillisecondsIn1Hour")
    @js.native
    def MillisecondsIn1Hour: Double = js.native
    inline def MillisecondsIn1Hour_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsIn1Hour")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.MillisecondsIn1Min")
    @js.native
    def MillisecondsIn1Min: Double = js.native
    inline def MillisecondsIn1Min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsIn1Min")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.MillisecondsIn1Sec")
    @js.native
    def MillisecondsIn1Sec: Double = js.native
    inline def MillisecondsIn1Sec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsIn1Sec")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.MillisecondsIn30Mins")
    @js.native
    def MillisecondsIn30Mins: Double = js.native
    inline def MillisecondsIn30Mins_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsIn30Mins")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.MillisecondsInOneDay")
    @js.native
    def MillisecondsInOneDay: Double = js.native
    inline def MillisecondsInOneDay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MillisecondsInOneDay")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.MinutesInOneDay")
    @js.native
    def MinutesInOneDay: Double = js.native
    inline def MinutesInOneDay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinutesInOneDay")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.MinutesInOneHour")
    @js.native
    def MinutesInOneHour: Double = js.native
    inline def MinutesInOneHour_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinutesInOneHour")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.MonthInOneYear")
    @js.native
    def MonthInOneYear: Double = js.native
    inline def MonthInOneYear_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthInOneYear")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.OffsetTo24HourFormat")
    @js.native
    def OffsetTo24HourFormat: Double = js.native
    inline def OffsetTo24HourFormat_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OffsetTo24HourFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.SecondsInOneMinute")
    @js.native
    def SecondsInOneMinute: Double = js.native
    inline def SecondsInOneMinute_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecondsInOneMinute")(x.asInstanceOf[js.Any])
    
    /**
      * Matches a time string. Groups:
      * 1. hours (with or without leading 0)
      * 2. minutes
      * 3. seconds (optional)
      * 4. meridiem (am/pm, case-insensitive, optional)
      */
    @JSImport("@fluentui/date-time-utilities", "TimeConstants.TimeFormatRegex")
    @js.native
    def TimeFormatRegex: js.RegExp = js.native
    inline def TimeFormatRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimeFormatRegex")(x.asInstanceOf[js.Any])
  }
  
  inline def addDays(date: js.Date, days: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(date.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMinutes(date: js.Date, minutes: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMinutes")(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addMonths(date: js.Date, months: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMonths")(date.asInstanceOf[js.Any], months.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addWeeks(date: js.Date, weeks: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(date.asInstanceOf[js.Any], weeks.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def addYears(date: js.Date, years: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addYears")(date.asInstanceOf[js.Any], years.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def ceilMinuteToIncrement(date: js.Date, increments: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("ceilMinuteToIncrement")(date.asInstanceOf[js.Any], increments.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def compareDatePart(date1: js.Date, date2: js.Date): Number = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDatePart")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Number]
  
  inline def compareDates(date1: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDates")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAvailableDate")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def formatDay(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatMonth(date: js.Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonth")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMonthDayYear(date: js.Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthDayYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMonthYear(date: js.Date, strings: IDateGridStrings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMonthYear")(date.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatTimeString(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeString")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatTimeString(date: js.Date, showSeconds: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeString")(date.asInstanceOf[js.Any], showSeconds.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTimeString(date: js.Date, showSeconds: Boolean, useHour12: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeString")(date.asInstanceOf[js.Any], showSeconds.asInstanceOf[js.Any], useHour12.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTimeString(date: js.Date, showSeconds: Unit, useHour12: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeString")(date.asInstanceOf[js.Any], showSeconds.asInstanceOf[js.Any], useHour12.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatYear(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatYear")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBoundedDateRange(dateRange: js.Array[js.Date]): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  inline def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.Date, maxDate: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: Unit, maxDate: js.Date): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundedDateRange")(dateRange.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def getDateFromTimeSelection(useHour12: Boolean, dateStartAnchor: js.Date, selectedTime: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateFromTimeSelection")(useHour12.asInstanceOf[js.Any], dateStartAnchor.asInstanceOf[js.Any], selectedTime.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getDatePartHashValue(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatePartHashValue")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDateRangeArray(date: js.Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  inline def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: Unit,
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeArray")(date.asInstanceOf[js.Any], dateRangeType.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], daysToSelectInDayView.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  
  inline def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeTypeToUse")(dateRangeType.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[DateRangeType]
  inline def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: Unit, firstDayOfWeek: DayOfWeek): DateRangeType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateRangeTypeToUse")(dateRangeType.asInstanceOf[js.Any], workWeekDays.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[DateRangeType]
  
  inline def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayGrid")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[IDay]]]
  
  inline def getEndDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getMonthEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getMonthStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getStartDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getStartDateOfWeek")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getWeekNumber(date: js.Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumber")(date.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWeekNumbersInMonth")(weeksInMonth.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear.asInstanceOf[js.Any], navigatedDate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getYearEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getYearStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def isAfterMaxDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfterMaxDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBeforeMinDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBeforeMinDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContiguous")(days.asInstanceOf[js.Any], isSingleWeek.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInDateRangeArray(date: js.Date, dateRange: js.Array[js.Date]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDateRangeArray")(date.asInstanceOf[js.Any], dateRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRestrictedDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestrictedDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setMonth(date: js.Date, month: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonth")(date.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
