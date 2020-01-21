package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the TimeInterval class.
  */
@JSGlobal("ASPxClientTimeInterval")
@js.native
class ASPxClientTimeInterval protected () extends js.Object {
  /**
    * Initializes a new instance of the ASPxClientTimeInterval class with the specified start time and duration.
    * @param start A DateTime object, representing the beginning of the period.
    * @param duration A TimeSpan structure, representing a time interval.
    */
  def this(start: Date, duration: js.Any) = this()
  /**
    * Client-side function that determines whether the specified interval is contained within the current one. true if the specified interval is located within the current one; otherwise, false.
    * @param interval An ASPxClientTimeInterval object, representing the time interval to check.
    */
  def Contains(interval: ASPxClientTimeInterval): Boolean = js.native
  /**
    * Determines whether the specified object is equal to the current ASPxClientTimeInterval instance. true if the specified object is equal to the current ASPxClientTimeInterval instance; otherwise false.
    * @param interval The object to compare with the current object.
    */
  def Equals(interval: ASPxClientTimeInterval): Boolean = js.native
  /**
    * Gets a value indicating if the time interval is All-Day.
    */
  def GetAllDay(): Boolean = js.native
  /**
    * Client-side function that returns the duration of the specified time interval.
    */
  def GetDuration(): Double = js.native
  /**
    * Client-side function that returns the end time of the interval.
    */
  def GetEnd(): Date = js.native
  /**
    * Client-side function that returns the start time of the interval.
    */
  def GetStart(): Date = js.native
  /**
    * Checks if the current time interval intersects with the specified time interval. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWith(interval: ASPxClientTimeInterval): Boolean = js.native
  /**
    * Checks if the current time interval intersects with the specified time interval. The boundaries of the time intervals are excluded from the check. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWithExcludingBounds(interval: ASPxClientTimeInterval): Boolean = js.native
  /**
    * Sets a value specifying if the time interval is All-Day.
    * @param allDayValue true, if this is an all-day time interval; otherwise, false.
    */
  def SetAllDay(allDayValue: Boolean): Unit = js.native
  /**
    * Client-side function that returns the duration of the specified time interval.
    * @param value A TimeSpan  object, representing the duration of the time period.
    */
  def SetDuration(value: js.Any): Unit = js.native
  /**
    * Client-side function that sets the end time of the interval.
    * @param value A DateTime value, representing the end of the interval.
    */
  def SetEnd(value: Date): Unit = js.native
  /**
    * Client-side function that sets the start time of the interval.
    * @param value A DateTime value, representing the beginning of the interval.
    */
  def SetStart(value: Date): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientTimeInterval")
@js.native
object ASPxClientTimeInterval extends js.Object {
  /**
    * Calculates the time interval duration. An integer value specifying the interval duration in milliseconds.
    * @param start A DateTime value that specifies the start date time value.
    * @param end A DateTime value that specifies the end date time value.
    */
  def CalculateDuration(start: Date, end: Date): Double = js.native
}

