package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes static methods that simplify working with JavaScript DateTime values.
  */
@JSGlobal("ASPxSchedulerDateTimeHelper")
@js.native
class ASPxSchedulerDateTimeHelper ()
  extends typings.devexpressWeb.ASPxSchedulerDateTimeHelper
object ASPxSchedulerDateTimeHelper {
  
  /**
    * Adds the specified number of days to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add days.
    * @param dayCount The number of days to add.
    */
  /* static member */
  @JSGlobal("ASPxSchedulerDateTimeHelper.AddDays")
  @js.native
  def AddDays(date: Date, dayCount: Double): Date = js.native
  
  /**
    * Adds the specified timespan to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add a timespan.
    * @param timeSpan A TimeSpan object specifying the timespan to add.
    */
  /* static member */
  @JSGlobal("ASPxSchedulerDateTimeHelper.AddTimeSpan")
  @js.native
  def AddTimeSpan(date: Date, timeSpan: js.Any): Date = js.native
  
  /**
    * Rounds a DateTime value up to the nearest interval. A DateTime object containing the rounded value.
    * @param date A DateTime object containing a value to round.
    * @param spanInMs A TimeSpan object specifying an interval to which to round.
    */
  /* static member */
  @JSGlobal("ASPxSchedulerDateTimeHelper.CeilDateTime")
  @js.native
  def CeilDateTime(date: Date, spanInMs: js.Any): Date = js.native
  
  /**
    * Returns the day time part of the specified DateTime value. A TimeSpan object containing the day time.
    * @param date A DateTime object from which to extract the day time.
    */
  /* static member */
  @JSGlobal("ASPxSchedulerDateTimeHelper.ToDayTime")
  @js.native
  def ToDayTime(date: Date): js.Any = js.native
  
  /**
    * Returns the date part of the specified DateTime value. A DateTime object containing a date.
    * @param date A DateTime object from which to extract the date.
    */
  /* static member */
  @JSGlobal("ASPxSchedulerDateTimeHelper.TruncToDate")
  @js.native
  def TruncToDate(date: Date): Date = js.native
}
