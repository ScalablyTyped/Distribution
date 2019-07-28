package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxSchedulerDateTimeHelperStatic extends js.Object {
  /**
    * Adds the specified number of days to a DateTime object and returns the result.
    * @param date A DateTime object to which to add days.
    * @param dayCount The number of days to add.
    */
  def AddDays(date: Date, dayCount: Double): Date
  /**
    * Adds the specified timespan to a DateTime object and returns the result.
    * @param date A DateTime object to which to add a timespan.
    * @param timeSpan A TimeSpan object specifying the timespan to add.
    */
  def AddTimeSpan(date: Date, timeSpan: js.Any): Date
  /**
    * Rounds a DateTime value up to the nearest interval.
    * @param date A DateTime object containing a value to round.
    * @param spanInMs A TimeSpan object specifying an interval to which to round.
    */
  def CeilDateTime(date: Date, spanInMs: js.Any): Date
  /**
    * Returns the day time part of the specified DateTime value.
    * @param date A DateTime object from which to extract the day time.
    */
  def ToDayTime(date: Date): js.Any
  /**
    * Returns the date part of the specified DateTime value.
    * @param date A DateTime object from which to extract the date.
    */
  def TruncToDate(date: Date): Date
}

object ASPxSchedulerDateTimeHelperStatic {
  @scala.inline
  def apply(
    AddDays: (Date, Double) => Date,
    AddTimeSpan: (Date, js.Any) => Date,
    CeilDateTime: (Date, js.Any) => Date,
    ToDayTime: Date => js.Any,
    TruncToDate: Date => Date
  ): ASPxSchedulerDateTimeHelperStatic = {
    val __obj = js.Dynamic.literal(AddDays = js.Any.fromFunction2(AddDays), AddTimeSpan = js.Any.fromFunction2(AddTimeSpan), CeilDateTime = js.Any.fromFunction2(CeilDateTime), ToDayTime = js.Any.fromFunction1(ToDayTime), TruncToDate = js.Any.fromFunction1(TruncToDate))
  
    __obj.asInstanceOf[ASPxSchedulerDateTimeHelperStatic]
  }
}

