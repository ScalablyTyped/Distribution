package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains number of weeks in a month in which the event occurs.
  */
@js.native
trait ASPxClientWeekOfMonth extends js.Object {
  /**
    * The recurring event will occur once a month, on the specified day or days of the first week in the month.
    */
  var First: Double = js.native
  /**
    * The recurring event will occur once a month, on the specified day or days of the fourth week in the month.
    */
  var Fourth: Double = js.native
  /**
    * The recurring event will occur once a month, on the specified day or days of the last week in the month.
    */
  var Last: Double = js.native
  /**
    * There isn't any recurrence rule based on the weeks in a month.
    */
  var None: Double = js.native
  /**
    * The recurring event will occur once a month, on the specified day or days of the second week in the month.
    */
  var Second: Double = js.native
  /**
    * The recurring event will occur once a month, on the specified day or days of the third week in the month.
    */
  var Third: Double = js.native
}

object ASPxClientWeekOfMonth {
  @scala.inline
  def apply(First: Double, Fourth: Double, Last: Double, None: Double, Second: Double, Third: Double): ASPxClientWeekOfMonth = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Fourth = Fourth.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any], Third = Third.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWeekOfMonth]
  }
  @scala.inline
  implicit class ASPxClientWeekOfMonthOps[Self <: ASPxClientWeekOfMonth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirst(value: Double): Self = this.set("First", value.asInstanceOf[js.Any])
    @scala.inline
    def setFourth(value: Double): Self = this.set("Fourth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast(value: Double): Self = this.set("Last", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: Double): Self = this.set("None", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: Double): Self = this.set("Second", value.asInstanceOf[js.Any])
    @scala.inline
    def setThird(value: Double): Self = this.set("Third", value.asInstanceOf[js.Any])
  }
  
}

