package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains recurrence types.
  */
trait ASPxClientRecurrenceType extends js.Object {
  /**
    * The recurring appointment occurs on a daily basis.
    * Value: The "Daily" string.
    */
  var Daily: String
  /**
    * The recurring appointment occurs on an hourly base.
    * Value: The "Hourly" string.
    */
  var Hourly: String
  /**
    * The recurring appointment reoccurs on a monthly basis.
    * Value: The "Monthly" string.
    */
  var Monthly: String
  /**
    * The recurring appointment reoccurs on a weekly basis.
    * Value: The "Weekly" string.
    */
  var Weekly: String
  /**
    * The recurring appointment reoccurs on an yearly basis.
    * Value: The "Yearly" string.
    */
  var Yearly: String
}

object ASPxClientRecurrenceType {
  @scala.inline
  def apply(Daily: String, Hourly: String, Monthly: String, Weekly: String, Yearly: String): ASPxClientRecurrenceType = {
    val __obj = js.Dynamic.literal(Daily = Daily, Hourly = Hourly, Monthly = Monthly, Weekly = Weekly, Yearly = Yearly)
  
    __obj.asInstanceOf[ASPxClientRecurrenceType]
  }
}

