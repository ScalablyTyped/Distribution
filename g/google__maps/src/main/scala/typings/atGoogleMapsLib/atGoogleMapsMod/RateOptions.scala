package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateOptions extends js.Object {
  /** Controls rate-limiting of requests. Maximum number of requests per period. (Default: 50). */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** Period for rate limit, in milliseconds. (Default: 1000 ms). */
  var period: js.UndefOr[scala.Double] = js.undefined
}

object RateOptions {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null, period: scala.Int | scala.Double = null): RateOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateOptions]
  }
}

