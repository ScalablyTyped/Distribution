package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Date")
@js.native
open class Date ()
  extends StObject
     with typings.extjs.Ext.Date
/* static members */
object Date {
  
  @JSGlobal("Ext.Date")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.DAY")
  @js.native
  def DAY: java.lang.String = js.native
  inline def DAY_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.HOUR")
  @js.native
  def HOUR: java.lang.String = js.native
  inline def HOUR_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.MILLI")
  @js.native
  def MILLI: java.lang.String = js.native
  inline def MILLI_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.MINUTE")
  @js.native
  def MINUTE: java.lang.String = js.native
  inline def MINUTE_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.MONTH")
  @js.native
  def MONTH: java.lang.String = js.native
  inline def MONTH_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.SECOND")
  @js.native
  def SECOND: java.lang.String = js.native
  inline def SECOND_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.YEAR")
  @js.native
  def YEAR: java.lang.String = js.native
  inline def YEAR_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR")(x.asInstanceOf[js.Any])
  
  /** [Method] Provides a convenient method for performing basic date arithmetic
    * @param date Date The date to modify
    * @param interval String A valid date interval enum value.
    * @param value Number The amount to add to the current date.
    * @returns Date The new Date instance.
    */
  inline def add(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Any]
  inline def add(date: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def add(date: Any, interval: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def add(date: Any, interval: java.lang.String, value: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def add(date: Any, interval: Unit, value: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def add(date: Unit, interval: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def add(date: Unit, interval: java.lang.String, value: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def add(date: Unit, interval: Unit, value: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Checks if a date falls on or between the given start and end dates
    * @param date Date The date to check
    * @param start Date Start date
    * @param end Date End date
    * @returns Boolean true if this date falls on or between the given start and end dates.
    */
  inline def between(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("between")().asInstanceOf[Boolean]
  inline def between(date: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def between(date: Any, start: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def between(date: Any, start: Any, end: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def between(date: Any, start: Unit, end: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def between(date: Unit, start: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def between(date: Unit, start: Any, end: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def between(date: Unit, start: Unit, end: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(date.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Attempts to clear all time information from this Date by setting the time to midnight of the same day automatically
    * @param date Date The date
    * @param clone Boolean true to create a clone of this date, clear the time and return it.
    * @returns Date this or the clone.
    */
  inline def clearTime(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTime")().asInstanceOf[Any]
  inline def clearTime(date: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTime")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def clearTime(date: Any, clone: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clearTime")(date.asInstanceOf[js.Any], clone.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def clearTime(date: Unit, clone: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clearTime")(date.asInstanceOf[js.Any], clone.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def clone(date: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Property] (String[]) */
  @JSGlobal("Ext.Date.dayNames")
  @js.native
  def dayNames: typings.extjs.Ext.Array = js.native
  inline def dayNames_=(x: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.defaultFormat")
  @js.native
  def defaultFormat: java.lang.String = js.native
  inline def defaultFormat_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.defaults")
  @js.native
  def defaults: Any = js.native
  inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  /** [Method] Formats a date given the supplied format string
    * @param date Date The date to format
    * @param format String The format string
    * @returns String The formatted date or an empty string if date parameter is not a JavaScript Date object
    */
  inline def format(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[java.lang.String]
  inline def format(date: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def format(date: Any, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def format(date: Unit, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.formatCodes")
  @js.native
  def formatCodes: Any = js.native
  inline def formatCodes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatCodes")(x.asInstanceOf[js.Any])
  
  /** [Method] Checks if the specified format contains information about anything other than the time
    * @param format String The format to check
    * @returns Boolean True if the format contains information about date/day information.
    */
  inline def formatContainsDateInfo(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("formatContainsDateInfo")().asInstanceOf[Boolean]
  inline def formatContainsDateInfo(format: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("formatContainsDateInfo")(format.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Checks if the specified format contains hour information
    * @param format String The format to check
    * @returns Boolean True if the format contains hour information
    */
  inline def formatContainsHourInfo(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("formatContainsHourInfo")().asInstanceOf[Boolean]
  inline def formatContainsHourInfo(format: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("formatContainsHourInfo")(format.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.formatFunctions")
  @js.native
  def formatFunctions: Any = js.native
  inline def formatFunctions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatFunctions")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the numeric day number of the year adjusted for leap year
    * @param date Date The date
    * @returns Number 0 to 364 (365 in leap years).
    */
  inline def getDayOfYear(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfYear")().asInstanceOf[Double]
  inline def getDayOfYear(date: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Get the number of days in the current month adjusted for leap year
    * @param date Date The date
    * @returns Number The number of days in the month.
    */
  inline def getDaysInMonth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")().asInstanceOf[Double]
  inline def getDaysInMonth(date: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Returns the number of milliseconds between two dates
    * @param dateA Date The first date.
    * @param dateB Date The second date.
    * @returns Number The difference in milliseconds
    */
  inline def getElapsed(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getElapsed")().asInstanceOf[Double]
  inline def getElapsed(dateA: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getElapsed")(dateA.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getElapsed(dateA: Any, dateB: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElapsed")(dateA.asInstanceOf[js.Any], dateB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getElapsed(dateA: Unit, dateB: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getElapsed")(dateA.asInstanceOf[js.Any], dateB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Get the date of the first day of the month in which this date resides
    * @param date Date The date
    * @returns Date
    */
  inline def getFirstDateOfMonth(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDateOfMonth")().asInstanceOf[Any]
  inline def getFirstDateOfMonth(date: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDateOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Get the first day of the current month adjusted for leap year
    * @param date Date The date
    * @returns Number The day number (0-6).
    */
  inline def getFirstDayOfMonth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfMonth")().asInstanceOf[Double]
  inline def getFirstDayOfMonth(date: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Get the offset from GMT of the current date equivalent to the format specifier O
    * @param date Date The date
    * @param colon Boolean true to separate the hours and minutes with a colon.
    * @returns String The 4-character offset string prefixed with + or - (e.g. '-0600').
    */
  inline def getGMTOffset(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGMTOffset")().asInstanceOf[java.lang.String]
  inline def getGMTOffset(date: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGMTOffset")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def getGMTOffset(date: Any, colon: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("getGMTOffset")(date.asInstanceOf[js.Any], colon.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def getGMTOffset(date: Unit, colon: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("getGMTOffset")(date.asInstanceOf[js.Any], colon.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Get the date of the last day of the month in which this date resides
    * @param date Date The date
    * @returns Date
    */
  inline def getLastDateOfMonth(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastDateOfMonth")().asInstanceOf[Any]
  inline def getLastDateOfMonth(date: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastDateOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Get the last day of the current month adjusted for leap year
    * @param date Date The date
    * @returns Number The day number (0-6).
    */
  inline def getLastDayOfMonth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastDayOfMonth")().asInstanceOf[Double]
  inline def getLastDayOfMonth(date: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastDayOfMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Get the zero based JavaScript month number for the given short full month name
    * @param name String The short/full month name.
    * @returns Number The zero-based JavaScript month number.
    */
  inline def getMonthNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthNumber")().asInstanceOf[Double]
  inline def getMonthNumber(name: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthNumber")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Get the short day name for the given day number
    * @param day Number A zero-based JavaScript day number.
    * @returns String The short day name.
    */
  inline def getShortDayName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortDayName")().asInstanceOf[java.lang.String]
  inline def getShortDayName(day: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortDayName")(day.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the short month name for the given month number
    * @param month Number A zero-based JavaScript month number.
    * @returns String The short month name.
    */
  inline def getShortMonthName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortMonthName")().asInstanceOf[java.lang.String]
  inline def getShortMonthName(month: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShortMonthName")(month.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the English ordinal suffix of the current day equivalent to the format specifier S
    * @param date Date The date
    * @returns String 'st, 'nd', 'rd' or 'th'.
    */
  inline def getSuffix(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffix")().asInstanceOf[java.lang.String]
  inline def getSuffix(date: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffix")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the timezone abbreviation of the current date equivalent to the format specifier T
    * @param date Date The date
    * @returns String The abbreviated timezone name (e.g. 'CST', 'PDT', 'EDT', 'MPST' ...).
    */
  inline def getTimezone(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")().asInstanceOf[java.lang.String]
  inline def getTimezone(date: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Get the numeric ISO 8601 week number of the year
    * @param date Date The date
    * @returns Number 1 to 53
    */
  inline def getWeekOfYear(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfYear")().asInstanceOf[Double]
  inline def getWeekOfYear(date: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Checks if the current date is affected by Daylight Saving Time DST
    * @param date Date The date
    * @returns Boolean true if the current date is affected by DST.
    */
  inline def isDST(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDST")().asInstanceOf[Boolean]
  inline def isDST(date: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDST")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Compares if two dates are equal by comparing their values
    * @param date1 Date
    * @param date2 Date
    * @returns Boolean true if the date values are equal
    */
  inline def isEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")().asInstanceOf[Boolean]
  inline def isEqual(date1: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(date1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isEqual(date1: Any, date2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isEqual(date1: Unit, date2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Checks if the current date falls within a leap year
    * @param date Date The date
    * @returns Boolean True if the current date falls within a leap year, false otherwise.
    */
  inline def isLeapYear(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")().asInstanceOf[Boolean]
  inline def isLeapYear(date: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Checks if the passed Date parameters will cause a JavaScript Date rollover
    * @param year Number 4-digit year
    * @param month Number 1-based month-of-year
    * @param day Number Day of month
    * @param hour Number Hour
    * @param minute Number Minute
    * @param second Number Second
    * @param millisecond Number Millisecond
    * @returns Boolean true if the passed parameters do not cause a Date "rollover", false otherwise.
    */
  inline def isValid(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Property] (String[]) */
  @JSGlobal("Ext.Date.monthNames")
  @js.native
  def monthNames: typings.extjs.Ext.Array = js.native
  inline def monthNames_=(x: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.monthNumbers")
  @js.native
  def monthNumbers: Any = js.native
  inline def monthNumbers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthNumbers")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the current timestamp
    * @returns Number Milliseconds since UNIX epoch.
    */
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  /** [Method] Parses the passed string using the specified date format
    * @param input String The raw date string.
    * @param format String The expected date string format.
    * @param strict Boolean true to validate date strings while parsing (i.e. prevents JavaScript Date "rollover"). Invalid date strings will return null when parsed.
    * @returns Date The parsed Date.
    */
  inline def parse(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Any]
  inline def parse(input: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(input: java.lang.String, format: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(input: java.lang.String, format: java.lang.String, strict: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(input: java.lang.String, format: Unit, strict: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(input: Unit, format: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(input: Unit, format: java.lang.String, strict: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(input: Unit, format: Unit, strict: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.parseFunctions")
  @js.native
  def parseFunctions: Any = js.native
  inline def parseFunctions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseFunctions")(x.asInstanceOf[js.Any])
  
  /** [Method] Provides a convenient method for performing basic date arithmetic
    * @param date Date The date to modify
    * @param interval String A valid date interval enum value.
    * @param value Number The amount to subtract from the current date.
    * @returns Date The new Date instance.
    */
  inline def subtract(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("subtract")().asInstanceOf[Any]
  inline def subtract(date: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def subtract(date: Any, interval: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def subtract(date: Any, interval: java.lang.String, value: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def subtract(date: Any, interval: Unit, value: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def subtract(date: Unit, interval: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def subtract(date: Unit, interval: java.lang.String, value: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def subtract(date: Unit, interval: Unit, value: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Removes all escaping for a date format string
    * @param format String The format to unescape
    * @returns String The unescaped format
    */
  inline def unescapeFormat(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeFormat")().asInstanceOf[java.lang.String]
  inline def unescapeFormat(format: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeFormat")(format.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Date.useStrict")
  @js.native
  def useStrict: Boolean = js.native
  inline def useStrict_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(x.asInstanceOf[js.Any])
}
