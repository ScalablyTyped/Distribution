package typings
package devexpressDashWebLib

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
  var Daily: java.lang.String
  /**
    * The recurring appointment occurs on an hourly base.
    * Value: The "Hourly" string.
    */
  var Hourly: java.lang.String
  /**
    * The recurring appointment reoccurs on a monthly basis.
    * Value: The "Monthly" string.
    */
  var Monthly: java.lang.String
  /**
    * The recurring appointment reoccurs on a weekly basis.
    * Value: The "Weekly" string.
    */
  var Weekly: java.lang.String
  /**
    * The recurring appointment reoccurs on an yearly basis.
    * Value: The "Yearly" string.
    */
  var Yearly: java.lang.String
}

object ASPxClientRecurrenceType {
  @scala.inline
  def apply(
    Daily: java.lang.String,
    Hourly: java.lang.String,
    Monthly: java.lang.String,
    Weekly: java.lang.String,
    Yearly: java.lang.String
  ): ASPxClientRecurrenceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Daily")(Daily)
    __obj.updateDynamic("Hourly")(Hourly)
    __obj.updateDynamic("Monthly")(Monthly)
    __obj.updateDynamic("Weekly")(Weekly)
    __obj.updateDynamic("Yearly")(Yearly)
    __obj.asInstanceOf[ASPxClientRecurrenceType]
  }
}

