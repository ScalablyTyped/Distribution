package typings.dojo.dojox.date.persian

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/persian/Date.html
  *
  * The component defines the Persian (Hijri) Calendar Object
  * This module is similar to the Date() object provided by JavaScript
  *
  */
@JSGlobal("dojox.date.persian.Date")
@js.native
class Date () extends js.Object {
  /**
    *
    */
  var daysInMonth: js.Array[_] = js.native
  /**
    *
    * @param year
    * @param month
    * @param day
    */
  def calcGregorian(year: js.Any, month: js.Any, day: js.Any): js.Any = js.native
  /**
    * This function returns the equivalent Persian Date value for the Gregorian Date
    *
    * @param gdate
    */
  def fromGregorian(gdate: Date): js.Function = js.native
  /**
    * This function returns the date value (1 - 30)
    *
    */
  def getDate(): js.Any = js.native
  /**
    * This function return Week Day value ( 0 - 6 )
    *
    */
  def getDay(): js.Any = js.native
  /**
    * returns the number of days in the given Persian Month
    *
    * @param month
    * @param year
    */
  def getDaysInPersianMonth(month: Double, year: Double): js.Any = js.native
  /**
    *
    * @param month
    */
  def getDaysInPersianMonth(month: Date): Unit = js.native
  /**
    * This function return the Year value
    *
    */
  def getFullYear(): js.Any = js.native
  /**
    * returns the Hour value
    *
    */
  def getHours(): js.Any = js.native
  /**
    * returns the Milliseconds value
    *
    */
  def getMilliseconds(): js.Any = js.native
  /**
    * returns the Minutes value
    *
    */
  def getMinutes(): js.Any = js.native
  /**
    * This function return the month value ( 0 - 11 )
    *
    */
  def getMonth(): js.Any = js.native
  /**
    * returns the seconds value
    *
    */
  def getSeconds(): js.Any = js.native
  /**
    *
    * @param year
    * @param month
    * @param day
    */
  def gregorian_to_jd(year: js.Any, month: js.Any, day: js.Any): Double = js.native
  /**
    * return Boolean value if Persian leap year
    *
    * @param j_y
    * @param j_m
    * @param j_d
    */
  def isLeapYear(j_y: js.Any, j_m: js.Any, j_d: js.Any): Boolean = js.native
  /**
    *
    * @param jd
    * @param jmonth
    */
  def jd_to_gregorian(jd: js.Any, jmonth: js.Any): js.Any = js.native
  /**
    *
    * @param jd
    */
  def jd_to_persian(jd: js.Any): js.Any = js.native
  /**
    *
    * @param j
    */
  def jwday(j: js.Any): js.Any = js.native
  /**
    *
    * @param year
    */
  def leap_gregorian(year: js.Any): Boolean = js.native
  /**
    *
    * @param year
    * @param month
    * @param day
    */
  def persian_to_jd(year: js.Any, month: js.Any, day: js.Any): Double = js.native
  /**
    * This function sets the Date
    *
    * @param date
    */
  def setDate(date: Double): js.Function = js.native
  /**
    * This function set Year
    *
    * @param year
    */
  def setFullYear(year: Double): Unit = js.native
  /**
    * set the Hours
    *
    */
  def setHours(): Unit = js.native
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
    * This function set Month
    *
    * @param month
    */
  def setMonth(month: Double): Unit = js.native
  /**
    * sets the seconds (0-59) only.
    *
    * @param seconds
    */
  def setSeconds(seconds: Double): js.Function = js.native
  /**
    * This returns the equevalent Grogorian date value in Date object
    *
    */
  def toGregorian(): js.Any = js.native
}

