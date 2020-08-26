package typings.expressRateLimit.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimitInfo extends js.Object {
  val current: Double = js.native
  val limit: Double = js.native
  val remaining: Double = js.native
  val resetTime: js.UndefOr[Date] = js.native
}

object RateLimitInfo {
  @scala.inline
  def apply(current: Double, limit: Double, remaining: Double): RateLimitInfo = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitInfo]
  }
  @scala.inline
  implicit class RateLimitInfoOps[Self <: RateLimitInfo] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetTime(value: Date): Self = this.set("resetTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetTime: Self = this.set("resetTime", js.undefined)
  }
  
}

