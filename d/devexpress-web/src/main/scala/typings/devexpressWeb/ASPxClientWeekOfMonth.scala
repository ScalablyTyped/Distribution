package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains number of weeks in a month in which the event occurs.
  */
trait ASPxClientWeekOfMonth extends js.Object {
  /**
    * The recurring event will occur once a month, on the specified day or days of the first week in the month.
    */
  var First: Double
  /**
    * The recurring event will occur once a month, on the specified day or days of the fourth week in the month.
    */
  var Fourth: Double
  /**
    * The recurring event will occur once a month, on the specified day or days of the last week in the month.
    */
  var Last: Double
  /**
    * There isn't any recurrence rule based on the weeks in a month.
    */
  var None: Double
  /**
    * The recurring event will occur once a month, on the specified day or days of the second week in the month.
    */
  var Second: Double
  /**
    * The recurring event will occur once a month, on the specified day or days of the third week in the month.
    */
  var Third: Double
}

object ASPxClientWeekOfMonth {
  @scala.inline
  def apply(First: Double, Fourth: Double, Last: Double, None: Double, Second: Double, Third: Double): ASPxClientWeekOfMonth = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Fourth = Fourth.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any], Third = Third.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWeekOfMonth]
  }
}

