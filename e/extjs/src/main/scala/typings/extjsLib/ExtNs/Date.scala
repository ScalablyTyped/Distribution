package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Date")
@js.native
class Date () extends js.Object

@JSGlobal("Ext.Date")
@js.native
object Date extends js.Object {
  /** [Property] (String) */
  var DAY: java.lang.String = js.native
  /** [Property] (String) */
  var HOUR: java.lang.String = js.native
  /** [Property] (String) */
  var MILLI: java.lang.String = js.native
  /** [Property] (String) */
  var MINUTE: java.lang.String = js.native
  /** [Property] (String) */
  var MONTH: java.lang.String = js.native
  /** [Property] (String) */
  var SECOND: java.lang.String = js.native
  /** [Property] (String) */
  var YEAR: java.lang.String = js.native
  /** [Property] (String[]) */
  var dayNames: extjsLib.ExtNs.Array = js.native
  /** [Property] (String) */
  var defaultFormat: java.lang.String = js.native
  /** [Property] (Object) */
  var defaults: js.Any = js.native
  /** [Property] (Object) */
  var formatCodes: js.Any = js.native
  /** [Property] (Object) */
  var formatFunctions: js.Any = js.native
  /** [Property] (String[]) */
  var monthNames: extjsLib.ExtNs.Array = js.native
  /** [Property] (Object) */
  var monthNumbers: js.Any = js.native
  /** [Property] (Object) */
  var parseFunctions: js.Any = js.native
  /** [Property] (Boolean) */
  var useStrict: scala.Boolean = js.native
  /** [Method] Provides a convenient method for performing basic date arithmetic
  		* @param date Date The date to modify
  		* @param interval String A valid date interval enum value.
  		* @param value Number The amount to add to the current date.
  		* @returns Date The new Date instance.
  		*/
  def add(): js.Any = js.native
  def add(date: js.Any): js.Any = js.native
  def add(date: js.Any, interval: java.lang.String): js.Any = js.native
  def add(date: js.Any, interval: java.lang.String, value: scala.Double): js.Any = js.native
  /** [Method] Checks if a date falls on or between the given start and end dates
  		* @param date Date The date to check
  		* @param start Date Start date
  		* @param end Date End date
  		* @returns Boolean true if this date falls on or between the given start and end dates.
  		*/
  def between(): scala.Boolean = js.native
  def between(date: js.Any): scala.Boolean = js.native
  def between(date: js.Any, start: js.Any): scala.Boolean = js.native
  def between(date: js.Any, start: js.Any, end: js.Any): scala.Boolean = js.native
  /** [Method] Attempts to clear all time information from this Date by setting the time to midnight of the same day automatically
  		* @param date Date The date
  		* @param clone Boolean true to create a clone of this date, clear the time and return it.
  		* @returns Date this or the clone.
  		*/
  def clearTime(): js.Any = js.native
  def clearTime(date: js.Any): js.Any = js.native
  def clearTime(date: js.Any, clone: scala.Boolean): js.Any = js.native
  def clone(date: js.Any): js.Any = js.native
  /** [Method] Formats a date given the supplied format string
  		* @param date Date The date to format
  		* @param format String The format string
  		* @returns String The formatted date or an empty string if date parameter is not a JavaScript Date object
  		*/
  def format(): java.lang.String = js.native
  def format(date: js.Any): java.lang.String = js.native
  def format(date: js.Any, format: java.lang.String): java.lang.String = js.native
  /** [Method] Checks if the specified format contains information about anything other than the time
  		* @param format String The format to check
  		* @returns Boolean True if the format contains information about date/day information.
  		*/
  def formatContainsDateInfo(): scala.Boolean = js.native
  def formatContainsDateInfo(format: java.lang.String): scala.Boolean = js.native
  /** [Method] Checks if the specified format contains hour information
  		* @param format String The format to check
  		* @returns Boolean True if the format contains hour information
  		*/
  def formatContainsHourInfo(): scala.Boolean = js.native
  def formatContainsHourInfo(format: java.lang.String): scala.Boolean = js.native
  /** [Method] Get the numeric day number of the year adjusted for leap year
  		* @param date Date The date
  		* @returns Number 0 to 364 (365 in leap years).
  		*/
  def getDayOfYear(): scala.Double = js.native
  def getDayOfYear(date: js.Any): scala.Double = js.native
  /** [Method] Get the number of days in the current month adjusted for leap year
  		* @param date Date The date
  		* @returns Number The number of days in the month.
  		*/
  def getDaysInMonth(): scala.Double = js.native
  def getDaysInMonth(date: js.Any): scala.Double = js.native
  /** [Method] Returns the number of milliseconds between two dates
  		* @param dateA Date The first date.
  		* @param dateB Date The second date.
  		* @returns Number The difference in milliseconds
  		*/
  def getElapsed(): scala.Double = js.native
  def getElapsed(dateA: js.Any): scala.Double = js.native
  def getElapsed(dateA: js.Any, dateB: js.Any): scala.Double = js.native
  /** [Method] Get the date of the first day of the month in which this date resides
  		* @param date Date The date
  		* @returns Date
  		*/
  def getFirstDateOfMonth(): js.Any = js.native
  def getFirstDateOfMonth(date: js.Any): js.Any = js.native
  /** [Method] Get the first day of the current month adjusted for leap year
  		* @param date Date The date
  		* @returns Number The day number (0-6).
  		*/
  def getFirstDayOfMonth(): scala.Double = js.native
  def getFirstDayOfMonth(date: js.Any): scala.Double = js.native
  /** [Method] Get the offset from GMT of the current date equivalent to the format specifier O
  		* @param date Date The date
  		* @param colon Boolean true to separate the hours and minutes with a colon.
  		* @returns String The 4-character offset string prefixed with + or - (e.g. '-0600').
  		*/
  def getGMTOffset(): java.lang.String = js.native
  def getGMTOffset(date: js.Any): java.lang.String = js.native
  def getGMTOffset(date: js.Any, colon: scala.Boolean): java.lang.String = js.native
  /** [Method] Get the date of the last day of the month in which this date resides
  		* @param date Date The date
  		* @returns Date
  		*/
  def getLastDateOfMonth(): js.Any = js.native
  def getLastDateOfMonth(date: js.Any): js.Any = js.native
  /** [Method] Get the last day of the current month adjusted for leap year
  		* @param date Date The date
  		* @returns Number The day number (0-6).
  		*/
  def getLastDayOfMonth(): scala.Double = js.native
  def getLastDayOfMonth(date: js.Any): scala.Double = js.native
  /** [Method] Get the zero based JavaScript month number for the given short full month name
  		* @param name String The short/full month name.
  		* @returns Number The zero-based JavaScript month number.
  		*/
  def getMonthNumber(): scala.Double = js.native
  def getMonthNumber(name: java.lang.String): scala.Double = js.native
  /** [Method] Get the short day name for the given day number
  		* @param day Number A zero-based JavaScript day number.
  		* @returns String The short day name.
  		*/
  def getShortDayName(): java.lang.String = js.native
  def getShortDayName(day: scala.Double): java.lang.String = js.native
  /** [Method] Get the short month name for the given month number
  		* @param month Number A zero-based JavaScript month number.
  		* @returns String The short month name.
  		*/
  def getShortMonthName(): java.lang.String = js.native
  def getShortMonthName(month: scala.Double): java.lang.String = js.native
  /** [Method] Get the English ordinal suffix of the current day equivalent to the format specifier S
  		* @param date Date The date
  		* @returns String 'st, 'nd', 'rd' or 'th'.
  		*/
  def getSuffix(): java.lang.String = js.native
  def getSuffix(date: js.Any): java.lang.String = js.native
  /** [Method] Get the timezone abbreviation of the current date equivalent to the format specifier T
  		* @param date Date The date
  		* @returns String The abbreviated timezone name (e.g. 'CST', 'PDT', 'EDT', 'MPST' ...).
  		*/
  def getTimezone(): java.lang.String = js.native
  def getTimezone(date: js.Any): java.lang.String = js.native
  /** [Method] Get the numeric ISO 8601 week number of the year
  		* @param date Date The date
  		* @returns Number 1 to 53
  		*/
  def getWeekOfYear(): scala.Double = js.native
  def getWeekOfYear(date: js.Any): scala.Double = js.native
  /** [Method] Checks if the current date is affected by Daylight Saving Time DST
  		* @param date Date The date
  		* @returns Boolean true if the current date is affected by DST.
  		*/
  def isDST(): scala.Boolean = js.native
  def isDST(date: js.Any): scala.Boolean = js.native
  /** [Method] Compares if two dates are equal by comparing their values
  		* @param date1 Date
  		* @param date2 Date
  		* @returns Boolean true if the date values are equal
  		*/
  def isEqual(): scala.Boolean = js.native
  def isEqual(date1: js.Any): scala.Boolean = js.native
  def isEqual(date1: js.Any, date2: js.Any): scala.Boolean = js.native
  /** [Method] Checks if the current date falls within a leap year
  		* @param date Date The date
  		* @returns Boolean True if the current date falls within a leap year, false otherwise.
  		*/
  def isLeapYear(): scala.Boolean = js.native
  def isLeapYear(date: js.Any): scala.Boolean = js.native
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
  def isValid(
    year: js.UndefOr[scala.Double],
    month: js.UndefOr[scala.Double],
    day: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    millisecond: js.UndefOr[scala.Double]
  ): scala.Boolean = js.native
  /** [Method] Returns the current timestamp
  		* @returns Number Milliseconds since UNIX epoch.
  		*/
  def now(): scala.Double = js.native
  /** [Method] Parses the passed string using the specified date format
  		* @param input String The raw date string.
  		* @param format String The expected date string format.
  		* @param strict Boolean true to validate date strings while parsing (i.e. prevents JavaScript Date "rollover"). Invalid date strings will return null when parsed.
  		* @returns Date The parsed Date.
  		*/
  def parse(): js.Any = js.native
  def parse(input: java.lang.String): js.Any = js.native
  def parse(input: java.lang.String, format: java.lang.String): js.Any = js.native
  def parse(input: java.lang.String, format: java.lang.String, strict: scala.Boolean): js.Any = js.native
  /** [Method] Provides a convenient method for performing basic date arithmetic
  		* @param date Date The date to modify
  		* @param interval String A valid date interval enum value.
  		* @param value Number The amount to subtract from the current date.
  		* @returns Date The new Date instance.
  		*/
  def subtract(): js.Any = js.native
  def subtract(date: js.Any): js.Any = js.native
  def subtract(date: js.Any, interval: java.lang.String): js.Any = js.native
  def subtract(date: js.Any, interval: java.lang.String, value: scala.Double): js.Any = js.native
  /** [Method] Removes all escaping for a date format string
  		* @param format String The format to unescape
  		* @returns String The unescaped format
  		*/
  def unescapeFormat(): java.lang.String = js.native
  def unescapeFormat(format: java.lang.String): java.lang.String = js.native
}

