package typings.googleGax.gaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundlingConfig extends js.Object {
  var delay_threshold_millis: js.UndefOr[Double] = js.undefined
  var element_count_limit: Double
  var element_count_threshold: Double
  var request_byte_limit: js.UndefOr[Double] = js.undefined
  var request_byte_threshold: js.UndefOr[Double] = js.undefined
}

object BundlingConfig {
  @scala.inline
  def apply(
    element_count_limit: Double,
    element_count_threshold: Double,
    delay_threshold_millis: js.UndefOr[Double] = js.undefined,
    request_byte_limit: js.UndefOr[Double] = js.undefined,
    request_byte_threshold: js.UndefOr[Double] = js.undefined
  ): BundlingConfig = {
    val __obj = js.Dynamic.literal(element_count_limit = element_count_limit.asInstanceOf[js.Any], element_count_threshold = element_count_threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(delay_threshold_millis)) __obj.updateDynamic("delay_threshold_millis")(delay_threshold_millis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(request_byte_limit)) __obj.updateDynamic("request_byte_limit")(request_byte_limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(request_byte_threshold)) __obj.updateDynamic("request_byte_threshold")(request_byte_threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundlingConfig]
  }
}

