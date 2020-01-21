package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time window specified for weekly operations.
  */
@js.native
trait SchemaResourcePolicyWeeklyCycle extends js.Object {
  /**
    * Up to 7 intervals/windows, one for each day of the week.
    */
  var dayOfWeeks: js.UndefOr[js.Array[SchemaResourcePolicyWeeklyCycleDayOfWeek]] = js.native
}

object SchemaResourcePolicyWeeklyCycle {
  @scala.inline
  def apply(dayOfWeeks: js.Array[SchemaResourcePolicyWeeklyCycleDayOfWeek] = null): SchemaResourcePolicyWeeklyCycle = {
    val __obj = js.Dynamic.literal()
    if (dayOfWeeks != null) __obj.updateDynamic("dayOfWeeks")(dayOfWeeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicyWeeklyCycle]
  }
}

