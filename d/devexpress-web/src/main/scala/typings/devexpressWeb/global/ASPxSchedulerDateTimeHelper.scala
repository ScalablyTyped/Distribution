package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes static methods that simplify working with JavaScript DateTime values.
  */
@JSGlobal("ASPxSchedulerDateTimeHelper")
@js.native
class ASPxSchedulerDateTimeHelper ()
  extends StObject
     with typings.devexpressWeb.ASPxSchedulerDateTimeHelper
object ASPxSchedulerDateTimeHelper {
  
  @JSGlobal("ASPxSchedulerDateTimeHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the specified number of days to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add days.
    * @param dayCount The number of days to add.
    */
  /* static member */
  inline def AddDays(date: Date, dayCount: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("AddDays")(date.asInstanceOf[js.Any], dayCount.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  /**
    * Adds the specified timespan to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add a timespan.
    * @param timeSpan A TimeSpan object specifying the timespan to add.
    */
  /* static member */
  inline def AddTimeSpan(date: Date, timeSpan: js.Any): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("AddTimeSpan")(date.asInstanceOf[js.Any], timeSpan.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  /**
    * Rounds a DateTime value up to the nearest interval. A DateTime object containing the rounded value.
    * @param date A DateTime object containing a value to round.
    * @param spanInMs A TimeSpan object specifying an interval to which to round.
    */
  /* static member */
  inline def CeilDateTime(date: Date, spanInMs: js.Any): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("CeilDateTime")(date.asInstanceOf[js.Any], spanInMs.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  /**
    * Returns the day time part of the specified DateTime value. A TimeSpan object containing the day time.
    * @param date A DateTime object from which to extract the day time.
    */
  /* static member */
  inline def ToDayTime(date: Date): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ToDayTime")(date.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Returns the date part of the specified DateTime value. A DateTime object containing a date.
    * @param date A DateTime object from which to extract the date.
    */
  /* static member */
  inline def TruncToDate(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("TruncToDate")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
}
