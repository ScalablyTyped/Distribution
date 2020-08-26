package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains recurrence types.
  */
@js.native
trait ASPxClientRecurrenceType extends js.Object {
  /**
    * The recurring appointment occurs on a daily basis.
    */
  var Daily: String = js.native
  /**
    * The recurring appointment occurs on an hourly base.
    */
  var Hourly: String = js.native
  /**
    * The recurring appointment reoccurs on a monthly basis.
    */
  var Monthly: String = js.native
  /**
    * The recurring appointment reoccurs on a weekly basis.
    */
  var Weekly: String = js.native
  /**
    * The recurring appointment reoccurs on an yearly basis.
    */
  var Yearly: String = js.native
}

object ASPxClientRecurrenceType {
  @scala.inline
  def apply(Daily: String, Hourly: String, Monthly: String, Weekly: String, Yearly: String): ASPxClientRecurrenceType = {
    val __obj = js.Dynamic.literal(Daily = Daily.asInstanceOf[js.Any], Hourly = Hourly.asInstanceOf[js.Any], Monthly = Monthly.asInstanceOf[js.Any], Weekly = Weekly.asInstanceOf[js.Any], Yearly = Yearly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceType]
  }
  @scala.inline
  implicit class ASPxClientRecurrenceTypeOps[Self <: ASPxClientRecurrenceType] (val x: Self) extends AnyVal {
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
    def setDaily(value: String): Self = this.set("Daily", value.asInstanceOf[js.Any])
    @scala.inline
    def setHourly(value: String): Self = this.set("Hourly", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthly(value: String): Self = this.set("Monthly", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekly(value: String): Self = this.set("Weekly", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearly(value: String): Self = this.set("Yearly", value.asInstanceOf[js.Any])
  }
  
}

