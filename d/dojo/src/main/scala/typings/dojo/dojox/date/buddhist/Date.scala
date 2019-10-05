package typings.dojo.dojox.date.buddhist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/buddhist/Date.html
  *
  *
  */
@JSGlobal("dojox.date.buddhist.Date")
@js.native
class Date () extends js.Object {
  /**
    * This function sets this Date to the Hebrew Date corresponding to the Gregorian Date
    *
    * @param gdate
    */
  def fromGregorian(gdate: Date): js.Function = js.native
  /**
    * This function returns the date value (0 - 30)
    *
    * @param isNumber               Optional
    */
  def getDate(isNumber: Boolean): js.Any = js.native
  /**
    * This function return Week Day value ( 0 - 6 )
    *
    */
  def getDay(): js.Any = js.native
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
    * returns the Seconds value
    *
    */
  def getSeconds(): js.Any = js.native
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
    * @param month               Optional
    * @param date               Optional
    */
  def setFullYear(year: Double, month: Double, date: Double): Unit = js.native
  /**
    * set the Hours  0-23
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
    * This returns the equivalent Gregorian date value as a Date object
    *
    */
  def toGregorian(): js.Any = js.native
}

