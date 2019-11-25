package typings.googleDashGax.buildSrcGaxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundlingConfig extends /* index */ StringDictionary[Double] {
  var delay_threshold_millis: Double
  var element_count_limit: Double
  var element_count_threshold: Double
  var request_byte_limit: Double
  var request_byte_threshold: Double
}

object BundlingConfig {
  @scala.inline
  def apply(
    delay_threshold_millis: Double,
    element_count_limit: Double,
    element_count_threshold: Double,
    request_byte_limit: Double,
    request_byte_threshold: Double,
    StringDictionary: /* index */ StringDictionary[Double] = null
  ): BundlingConfig = {
    val __obj = js.Dynamic.literal(delay_threshold_millis = delay_threshold_millis.asInstanceOf[js.Any], element_count_limit = element_count_limit.asInstanceOf[js.Any], element_count_threshold = element_count_threshold.asInstanceOf[js.Any], request_byte_limit = request_byte_limit.asInstanceOf[js.Any], request_byte_threshold = request_byte_threshold.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BundlingConfig]
  }
}

