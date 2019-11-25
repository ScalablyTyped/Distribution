package typings.expressDashSlowDashDown.expressDashSlowDashDownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlowDownRequestAugmentation extends js.Object {
  /**
    * The number of requests in the current window
    */
  var current: Double
  /**
    * Amount of delay imposed on current request in milliseconds
    */
  var delay: Double
  /**
    * The `options.delayAfter` value
    */
  var limit: Double
  /**
    * the number of requests remaining before rate-limiting begins
    */
  var remaining: Double
  /**
    * When the window will reset, `current` will return to `0`, and `remaining` will return
    * to limit. Represents milliseconds since epoch (compare to `Date.now()`). This field
    * depends on store support. It will be `undefined` if the store does not provide the value.
    */
  var resetTime: js.UndefOr[Double] = js.undefined
}

object SlowDownRequestAugmentation {
  @scala.inline
  def apply(current: Double, delay: Double, limit: Double, remaining: Double, resetTime: Int | Double = null): SlowDownRequestAugmentation = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
    if (resetTime != null) __obj.updateDynamic("resetTime")(resetTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlowDownRequestAugmentation]
  }
}

