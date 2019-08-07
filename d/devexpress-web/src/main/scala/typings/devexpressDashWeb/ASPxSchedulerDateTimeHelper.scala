package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exposes static methods that simplify working with JavaScript DateTime values.
  */
@JSGlobal("ASPxSchedulerDateTimeHelper")
@js.native
class ASPxSchedulerDateTimeHelper () extends js.Object

/* static members */
@JSGlobal("ASPxSchedulerDateTimeHelper")
@js.native
object ASPxSchedulerDateTimeHelper extends js.Object {
  /**
    * Adds the specified number of days to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add days.
    * @param dayCount The number of days to add.
    */
  def AddDays(date: Date, dayCount: Double): Date = js.native
  /**
    * Adds the specified timespan to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add a timespan.
    * @param timeSpan A TimeSpan object specifying the timespan to add.
    */
  def AddTimeSpan(date: Date, timeSpan: js.Any): Date = js.native
  /**
    * Rounds a DateTime value up to the nearest interval. A DateTime object containing the rounded value.
    * @param date A DateTime object containing a value to round.
    * @param spanInMs A TimeSpan object specifying an interval to which to round.
    */
  def CeilDateTime(date: Date, spanInMs: js.Any): Date = js.native
  /**
    * Returns the day time part of the specified DateTime value. A TimeSpan object containing the day time.
    * @param date A DateTime object from which to extract the day time.
    */
  def ToDayTime(date: Date): js.Any = js.native
  /**
    * Returns the date part of the specified DateTime value. A DateTime object containing a date.
    * @param date A DateTime object from which to extract the date.
    */
  def TruncToDate(date: Date): Date = js.native
}

