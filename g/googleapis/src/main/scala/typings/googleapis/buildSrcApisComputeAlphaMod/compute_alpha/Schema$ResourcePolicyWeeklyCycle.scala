package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time window specified for weekly operations.
  */
@js.native
trait Schema$ResourcePolicyWeeklyCycle extends js.Object {
  /**
    * Up to 7 intervals/windows, one for each day of the week.
    */
  var dayOfWeeks: js.UndefOr[js.Array[Schema$ResourcePolicyWeeklyCycleDayOfWeek]] = js.native
}

object Schema$ResourcePolicyWeeklyCycle {
  @scala.inline
  def apply(dayOfWeeks: js.Array[Schema$ResourcePolicyWeeklyCycleDayOfWeek] = null): Schema$ResourcePolicyWeeklyCycle = {
    val __obj = js.Dynamic.literal()
    if (dayOfWeeks != null) __obj.updateDynamic("dayOfWeeks")(dayOfWeeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicyWeeklyCycle]
  }
}

