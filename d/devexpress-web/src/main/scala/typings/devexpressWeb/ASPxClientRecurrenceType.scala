package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains recurrence types.
  */
trait ASPxClientRecurrenceType extends js.Object {
  /**
    * The recurring appointment occurs on a daily basis.
    */
  var Daily: String
  /**
    * The recurring appointment occurs on an hourly base.
    */
  var Hourly: String
  /**
    * The recurring appointment reoccurs on a monthly basis.
    */
  var Monthly: String
  /**
    * The recurring appointment reoccurs on a weekly basis.
    */
  var Weekly: String
  /**
    * The recurring appointment reoccurs on an yearly basis.
    */
  var Yearly: String
}

object ASPxClientRecurrenceType {
  @scala.inline
  def apply(Daily: String, Hourly: String, Monthly: String, Weekly: String, Yearly: String): ASPxClientRecurrenceType = {
    val __obj = js.Dynamic.literal(Daily = Daily.asInstanceOf[js.Any], Hourly = Hourly.asInstanceOf[js.Any], Monthly = Monthly.asInstanceOf[js.Any], Weekly = Weekly.asInstanceOf[js.Any], Yearly = Yearly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceType]
  }
}

