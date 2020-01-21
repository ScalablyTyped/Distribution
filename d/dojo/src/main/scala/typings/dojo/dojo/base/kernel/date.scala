package typings.dojo.dojo.base.kernel

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.date.html
  *
  *
  */
@js.native
trait date extends js.Object {
  /**
    * TODOC
    *
    */
  var stamp: js.Object = js.native
  /**
    * Add to a Date in intervals of different size, from milliseconds to years
    *
    * @param date Date object to start with
    * @param interval A string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond", "quarter", "week", "weekday"
    * @param amount How much to add to the date.
    */
  def add(date: Date, interval: String, amount: Double): js.Any = js.native
  /**
    * Compare two date objects by date, time, or both.
    * Returns 0 if equal, positive if a > b, else negative.
    *
    * @param date1 Date object
    * @param date2               OptionalDate object.  If not specified, the current Date is used.
    * @param portion               OptionalA string indicating the "date" or "time" portion of a Date object.Compares both "date" and "time" by default.  One of the following:"date", "time", "datetime"
    */
  def compare(date1: Date): Double = js.native
  def compare(date1: Date, date2: Date): Double = js.native
  def compare(date1: Date, date2: Date, portion: String): Double = js.native
  /**
    * Get the difference in a specific unit of time (e.g., number of
    * months, weeks, days, etc.) between two dates, rounded to the
    * nearest integer.
    *
    * @param date1 Date object
    * @param date2               OptionalDate object.  If not specified, the current Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond", "quarter", "week", "weekday"Defaults to "day".
    */
  def difference(date1: Date): js.Any = js.native
  def difference(date1: Date, date2: Date): js.Any = js.native
  def difference(date1: Date, date2: Date, interval: String): js.Any = js.native
  /**
    * Returns the number of days in the month used by dateObject
    *
    * @param dateObject
    */
  def getDaysInMonth(dateObject: Date): Double = js.native
  /**
    * Get the user's time zone as provided by the browser
    * Try to get time zone info from toString or toLocaleString method of
    * the Date object -- UTC offset is not a time zone.  See
    * http://www.twinsun.com/tz/tz-link.htm Note: results may be
    * inconsistent across browsers.
    *
    * @param dateObject Needed because the timezone may vary with time (daylight savings)
    */
  def getTimezoneName(dateObject: Date): js.Any = js.native
  /**
    * Determines if the year of the dateObject is a leap year
    * Leap years are years with an additional day YYYY-02-29, where the
    * year number is a multiple of four with the following exception: If
    * a year is a multiple of 100, then it is only a leap year if it is
    * also a multiple of 400. For example, 1900 was not a leap year, but
    * 2000 is one.
    *
    * @param dateObject
    */
  def isLeapYear(dateObject: Date): Boolean = js.native
}

