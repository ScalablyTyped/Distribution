package typings
package devexpressDashWebLib

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
  def Contains(interval: ASPxClientTimeInterval): scala.Boolean
  /**
    * Determines whether the specified object is equal to the current ASPxClientTimeInterval instance.
    * @param interval The object to compare with the current object.
    */
  def Equals(interval: ASPxClientTimeInterval): scala.Boolean
  /**
    * Gets a value indicating if the time interval is All-Day.
    */
  def GetAllDay(): scala.Boolean
  /**
    * Client-side function that returns the duration of the specified time interval.
    */
  def GetDuration(): scala.Double
  /**
    * Client-side function that returns the end time of the interval.
    */
  def GetEnd(): stdLib.Date
  /**
    * Client-side function that returns the start time of the interval.
    */
  def GetStart(): stdLib.Date
  /**
    * Checks if the current time interval intersects with the specified time interval.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWith(interval: ASPxClientTimeInterval): scala.Boolean
  /**
    * Checks if the current time interval intersects with the specified time interval. The boundaries of the time intervals are excluded from the check.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWithExcludingBounds(interval: ASPxClientTimeInterval): scala.Boolean
  /**
    * Sets a value specifying if the time interval is All-Day.
    * @param allDayValue true, if this is an all-day time interval; otherwise, false.
    */
  def SetAllDay(allDayValue: scala.Boolean): scala.Unit
  /**
    * Client-side function that returns the duration of the specified time interval.
    * @param value A TimeSpan  object, representing the duration of the time period.
    */
  def SetDuration(value: js.Any): scala.Unit
  /**
    * Client-side function that sets the end time of the interval.
    * @param value A DateTime value, representing the end of the interval.
    */
  def SetEnd(value: stdLib.Date): scala.Unit
  /**
    * Client-side function that sets the start time of the interval.
    * @param value A DateTime value, representing the beginning of the interval.
    */
  def SetStart(value: stdLib.Date): scala.Unit
}

object ASPxClientTimeInterval {
  @scala.inline
  def apply(
    Contains: js.Function1[ASPxClientTimeInterval, scala.Boolean],
    Equals: js.Function1[ASPxClientTimeInterval, scala.Boolean],
    GetAllDay: js.Function0[scala.Boolean],
    GetDuration: js.Function0[scala.Double],
    GetEnd: js.Function0[stdLib.Date],
    GetStart: js.Function0[stdLib.Date],
    IntersectsWith: js.Function1[ASPxClientTimeInterval, scala.Boolean],
    IntersectsWithExcludingBounds: js.Function1[ASPxClientTimeInterval, scala.Boolean],
    SetAllDay: js.Function1[scala.Boolean, scala.Unit],
    SetDuration: js.Function1[js.Any, scala.Unit],
    SetEnd: js.Function1[stdLib.Date, scala.Unit],
    SetStart: js.Function1[stdLib.Date, scala.Unit]
  ): ASPxClientTimeInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Contains")(Contains)
    __obj.updateDynamic("Equals")(Equals)
    __obj.updateDynamic("GetAllDay")(GetAllDay)
    __obj.updateDynamic("GetDuration")(GetDuration)
    __obj.updateDynamic("GetEnd")(GetEnd)
    __obj.updateDynamic("GetStart")(GetStart)
    __obj.updateDynamic("IntersectsWith")(IntersectsWith)
    __obj.updateDynamic("IntersectsWithExcludingBounds")(IntersectsWithExcludingBounds)
    __obj.updateDynamic("SetAllDay")(SetAllDay)
    __obj.updateDynamic("SetDuration")(SetDuration)
    __obj.updateDynamic("SetEnd")(SetEnd)
    __obj.updateDynamic("SetStart")(SetStart)
    __obj.asInstanceOf[ASPxClientTimeInterval]
  }
}

