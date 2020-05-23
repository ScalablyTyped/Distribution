package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateOptions extends js.Object {
  /** Controls rate-limiting of requests. Maximum number of requests per period. (Default: 50). */
  var limit: js.UndefOr[Double] = js.undefined
  /** Period for rate limit, in milliseconds. (Default: 1000 ms). */
  var period: js.UndefOr[Double] = js.undefined
}

object RateOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): RateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateOptions]
  }
}

