package typings.dojo.dojox.date.hebrew

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/hebrew/Date.html
  *
  * A Date-like object which implements the Hebrew calendar
  * A Date-like object which implements the Hebrew Calendar.  Because this object
  * implements many of the same methods as the native JavaScript Date object, which
  * implements the Gregorian calendar, it can often be used its place.  Note that
  * this object does not extend Date or use its prototype.
  *
  */
@JSGlobal("dojox.date.hebrew.Date")
@js.native
class Date () extends js.Object {
  /**
    * This function sets this Date to the Hebrew Date corresponding to the Gregorian Date
    *
    * @param gdate
    */
  def fromGregorian(gdate: Date): js.Function = js.native
  /**
    * returns the date value (1 - 30)
    *
    */
  def getDate(): js.Any = js.native
  /**
    * returns the date value as hebrew numerals for the Hebrew locale,
    * a number for all others.
    *
    * @param locale               Optional
    */
  def getDateLocalized(locale: String): js.Any = js.native
  /**
    * returns weekday value (0 - 6)
    *
    */
  def getDay(): Double = js.native
  /**
    * returns the number of days in the given month and year
    *
    * @param month
    * @param year
    */
  def getDaysInHebrewMonth(month: Double, year: Double): js.Any = js.native
  /**
    * returns the Year value
    *
    */
  def getFullYear(): js.Any = js.native
  /**
    * returns the hour value
    *
    */
  def getHours(): js.Any = js.native
  /**
    * returns the milliseconds value
    *
    */
  def getMilliseconds(): js.Any = js.native
  /**
    * returns the minutes value
    *
    */
  def getMinutes(): js.Any = js.native
  /**
    * returns the month value (0 - 12)
    * the result is the index in the month array:
    *
    * Tishri
    * Heshvan
    * Kislev
    * Tevet
    * Shevat
    * Adar I (leap years only)
    * Adar
    * Nisan
    * Iyar
    * Sivan
    * Tammuz
    * Av
    * Elul - 12
    * For non leap years, for months after Shevat, the actual position of
    * the month in the year (used for short format) is less than
    * the "absolute" index by 1.
    *
    */
  def getMonth(): js.Any = js.native
  /**
    * returns the seconds value
    *
    */
  def getSeconds(): js.Any = js.native
  /**
    * Determines if the year (argument) is a leap year
    * The Leap year contains additional month adar sheni
    *
    * @param year
    */
  def isLeapYear(year: Double): Boolean = js.native
  /**
    * sets the date number for a given month
    *
    * @param date
    */
  def setDate(date: Double): js.Function = js.native
  /**
    * set the year
    *
    * @param year
    * @param month               Optional
    * @param date               Optional
    */
  def setFullYear(year: Double, month: Double, date: Double): js.Function = js.native
  /**
    * sets the hour
    * Sets the hour and optionally minutes, seconds, milliseconds also.
    *
    */
  def setHours(): js.Function = js.native
  /**
    *
    * @param milliseconds
    */
  def setMilliseconds(milliseconds: Double): js.Function = js.native
  /**
    * sets the minutes (0-59) only.
    *
    * @param minutes
    */
  def setMinutes(minutes: Double): js.Function = js.native
  /**
    * sets the month.  You should use "absolute" index in the month array:
    *
    * Tishri
    * Heshvan
    * Kislev
    * Tevet
    * Shevat
    * Adar I (leap years only)
    * Adar
    * Nisan
    * Iyar
    * Sivan
    * Tammuz
    * Av
    * Elul - 12
    * For non leap years, for months after Shevat, the actual position of
    * the month in the year (used for short format) is less than
    * the "absolute" index by 1.
    *
    * @param month
    */
  def setMonth(month: Double): js.Function = js.native
  /**
    * sets the seconds (0-59) only.
    *
    * @param seconds
    */
  def setSeconds(seconds: Double): js.Function = js.native
  /**
    * returns the equivalent Gregorian date value as a native Date object
    *
    */
  def toGregorian(): js.Any = js.native
}

