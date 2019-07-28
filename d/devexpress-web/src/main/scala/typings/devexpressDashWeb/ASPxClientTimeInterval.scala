package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the TimeInterval class.
  */
trait ASPxClientTimeInterval extends js.Object {
  /**
    * Client-side function that determines whether the specified interval is contained within the current one.
    * @param interval An ASPxClientTimeInterval object, representing the time interval to check.
    */
  def Contains(interval: ASPxClientTimeInterval): Boolean
  /**
    * Determines whether the specified object is equal to the current ASPxClientTimeInterval instance.
    * @param interval The object to compare with the current object.
    */
  def Equals(interval: ASPxClientTimeInterval): Boolean
  /**
    * Gets a value indicating if the time interval is All-Day.
    */
  def GetAllDay(): Boolean
  /**
    * Client-side function that returns the duration of the specified time interval.
    */
  def GetDuration(): Double
  /**
    * Client-side function that returns the end time of the interval.
    */
  def GetEnd(): Date
  /**
    * Client-side function that returns the start time of the interval.
    */
  def GetStart(): Date
  /**
    * Checks if the current time interval intersects with the specified time interval.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWith(interval: ASPxClientTimeInterval): Boolean
  /**
    * Checks if the current time interval intersects with the specified time interval. The boundaries of the time intervals are excluded from the check.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWithExcludingBounds(interval: ASPxClientTimeInterval): Boolean
  /**
    * Sets a value specifying if the time interval is All-Day.
    * @param allDayValue true, if this is an all-day time interval; otherwise, false.
    */
  def SetAllDay(allDayValue: Boolean): Unit
  /**
    * Client-side function that returns the duration of the specified time interval.
    * @param value A TimeSpan  object, representing the duration of the time period.
    */
  def SetDuration(value: js.Any): Unit
  /**
    * Client-side function that sets the end time of the interval.
    * @param value A DateTime value, representing the end of the interval.
    */
  def SetEnd(value: Date): Unit
  /**
    * Client-side function that sets the start time of the interval.
    * @param value A DateTime value, representing the beginning of the interval.
    */
  def SetStart(value: Date): Unit
}

object ASPxClientTimeInterval {
  @scala.inline
  def apply(
    Contains: ASPxClientTimeInterval => Boolean,
    Equals: ASPxClientTimeInterval => Boolean,
    GetAllDay: () => Boolean,
    GetDuration: () => Double,
    GetEnd: () => Date,
    GetStart: () => Date,
    IntersectsWith: ASPxClientTimeInterval => Boolean,
    IntersectsWithExcludingBounds: ASPxClientTimeInterval => Boolean,
    SetAllDay: Boolean => Unit,
    SetDuration: js.Any => Unit,
    SetEnd: Date => Unit,
    SetStart: Date => Unit
  ): ASPxClientTimeInterval = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), Equals = js.Any.fromFunction1(Equals), GetAllDay = js.Any.fromFunction0(GetAllDay), GetDuration = js.Any.fromFunction0(GetDuration), GetEnd = js.Any.fromFunction0(GetEnd), GetStart = js.Any.fromFunction0(GetStart), IntersectsWith = js.Any.fromFunction1(IntersectsWith), IntersectsWithExcludingBounds = js.Any.fromFunction1(IntersectsWithExcludingBounds), SetAllDay = js.Any.fromFunction1(SetAllDay), SetDuration = js.Any.fromFunction1(SetDuration), SetEnd = js.Any.fromFunction1(SetEnd), SetStart = js.Any.fromFunction1(SetStart))
  
    __obj.asInstanceOf[ASPxClientTimeInterval]
  }
}

