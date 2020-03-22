package typings.expressRateLimit.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimitInfo extends js.Object {
  val current: Double
  val limit: Double
  val remaining: Double
  val resetTime: js.UndefOr[Date] = js.undefined
}

object RateLimitInfo {
  @scala.inline
  def apply(current: Double, limit: Double, remaining: Double, resetTime: Date = null): RateLimitInfo = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
    if (resetTime != null) __obj.updateDynamic("resetTime")(resetTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitInfo]
  }
}

