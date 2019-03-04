package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains number of weeks in a month in which the event occurs.
  */
trait ASPxClientWeekOfMonth extends js.Object {
  /**
    * The recurring event will occur once a month, on the specified day or days of the first week in the month.
    * Value: The integer 1 value.
    */
  var First: scala.Double
  /**
    * The recurring event will occur once a month, on the specified day or days of the fourth week in the month.
    * Value: The integer 4 value;
    */
  var Fourth: scala.Double
  /**
    * The recurring event will occur once a month, on the specified day or days of the last week in the month.
    * Value: The integer 5 value;
    */
  var Last: scala.Double
  /**
    * There isn't any recurrence rule based on the weeks in a month.
    * Value: The integer 0 value.
    */
  var None: scala.Double
  /**
    * The recurring event will occur once a month, on the specified day or days of the second week in the month.
    * Value: The integer 2 value.
    */
  var Second: scala.Double
  /**
    * The recurring event will occur once a month, on the specified day or days of the third week in the month.
    * Value: The integer 3 value.
    */
  var Third: scala.Double
}

object ASPxClientWeekOfMonth {
  @scala.inline
  def apply(
    First: scala.Double,
    Fourth: scala.Double,
    Last: scala.Double,
    None: scala.Double,
    Second: scala.Double,
    Third: scala.Double
  ): ASPxClientWeekOfMonth = {
    val __obj = js.Dynamic.literal(First = First, Fourth = Fourth, Last = Last, None = None, Second = Second, Third = Third)
  
    __obj.asInstanceOf[ASPxClientWeekOfMonth]
  }
}

