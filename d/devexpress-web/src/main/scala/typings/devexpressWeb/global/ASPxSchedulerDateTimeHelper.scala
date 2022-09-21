package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exposes static methods that simplify working with JavaScript DateTime values.
  */
@JSGlobal("ASPxSchedulerDateTimeHelper")
@js.native
open class ASPxSchedulerDateTimeHelper ()
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
  inline def AddDays(date: js.Date, dayCount: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("AddDays")(date.asInstanceOf[js.Any], dayCount.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  /**
    * Adds the specified timespan to a DateTime object and returns the result. A DateTime object.
    * @param date A DateTime object to which to add a timespan.
    * @param timeSpan A TimeSpan object specifying the timespan to add.
    */
  /* static member */
  inline def AddTimeSpan(date: js.Date, timeSpan: Any): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("AddTimeSpan")(date.asInstanceOf[js.Any], timeSpan.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  /**
    * Rounds a DateTime value up to the nearest interval. A DateTime object containing the rounded value.
    * @param date A DateTime object containing a value to round.
    * @param spanInMs A TimeSpan object specifying an interval to which to round.
    */
  /* static member */
  inline def CeilDateTime(date: js.Date, spanInMs: Any): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("CeilDateTime")(date.asInstanceOf[js.Any], spanInMs.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  /**
    * Returns the day time part of the specified DateTime value. A TimeSpan object containing the day time.
    * @param date A DateTime object from which to extract the day time.
    */
  /* static member */
  inline def ToDayTime(date: js.Date): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ToDayTime")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns the date part of the specified DateTime value. A DateTime object containing a date.
    * @param date A DateTime object from which to extract the date.
    */
  /* static member */
  inline def TruncToDate(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("TruncToDate")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
