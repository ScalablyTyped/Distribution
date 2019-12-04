package typings.dojo.dojox.date.umalqura

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/umalqura/Date.html
  *
  * The component defines the UmAlqura (Hijri) Calendar Object according to Umalqura calculations
  * This module is similar to the Date() object provided by JavaScript
  *
  */
@JSGlobal("dojox.date.umalqura.Date")
@js.native
class Date () extends js.Object {
  /**
    * This function returns the equivalent UmAlqura Date value for the Gregorian Date
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
    * This function returns the week day value ( 0 - 6 )
    * sunday is 0, monday is 1,...etc
    *
    */
  def getDay(): js.Any = js.native
  /**
    * returns the number of days in the given Islamic month
    *
    * @param month
    * @param year
    */
  def getDaysInIslamicMonth(month: Double, year: Double): js.Any = js.native
  /**
    *
    * @param month
    */
  def getDaysInIslamicMonth(month: Date): Unit = js.native
  /**
    * This function return the year value
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
    * This function sets the date
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
    * set the hours
    *
    */
  def setHours(): Unit = js.native
  /**
    * set the milliseconds
    *
    * @param milliseconds
    */
  def setMilliseconds(milliseconds: Double): Unit = js.native
  /**
    * set the minutes
    *
    * @param minutes
    */
  def setMinutes(minutes: Double): Unit = js.native
  /**
    * This function sets the month
    *
    * @param month
    */
  def setMonth(month: Double): Unit = js.native
  /**
    * set seconds
    *
    * @param seconds
    */
  def setSeconds(seconds: Double): Unit = js.native
  /**
    * This returns the equivalent gregorian date value in Date object
    *
    */
  def toGregorian(): js.Any = js.native
}

