package typings.expressSlowDown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlowDownRequestAugmentation extends js.Object {
  /**
    * The number of requests in the current window
    */
  var current: Double = js.native
  /**
    * Amount of delay imposed on current request in milliseconds
    */
  var delay: Double = js.native
  /**
    * The `options.delayAfter` value
    */
  var limit: Double = js.native
  /**
    * the number of requests remaining before rate-limiting begins
    */
  var remaining: Double = js.native
  /**
    * When the window will reset, `current` will return to `0`, and `remaining` will return
    * to limit. Represents milliseconds since epoch (compare to `Date.now()`). This field
    * depends on store support. It will be `undefined` if the store does not provide the value.
    */
  var resetTime: js.UndefOr[Double] = js.native
}

object SlowDownRequestAugmentation {
  @scala.inline
  def apply(current: Double, delay: Double, limit: Double, remaining: Double): SlowDownRequestAugmentation = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlowDownRequestAugmentation]
  }
  @scala.inline
  implicit class SlowDownRequestAugmentationOps[Self <: SlowDownRequestAugmentation] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetTime(value: Double): Self = this.set("resetTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetTime: Self = this.set("resetTime", js.undefined)
  }
  
}

