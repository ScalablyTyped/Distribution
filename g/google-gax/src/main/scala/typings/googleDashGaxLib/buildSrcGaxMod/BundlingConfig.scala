package typings
package googleDashGaxLib.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundlingConfig
  extends /* index */ org.scalablytyped.runtime.StringDictionary[scala.Double] {
  var delay_threshold_millis: scala.Double
  var element_count_limit: scala.Double
  var element_count_threshold: scala.Double
  var request_byte_limit: scala.Double
  var request_byte_threshold: scala.Double
}

object BundlingConfig {
  @scala.inline
  def apply(
    delay_threshold_millis: scala.Double,
    element_count_limit: scala.Double,
    element_count_threshold: scala.Double,
    request_byte_limit: scala.Double,
    request_byte_threshold: scala.Double,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): BundlingConfig = {
    val __obj = js.Dynamic.literal(delay_threshold_millis = delay_threshold_millis, element_count_limit = element_count_limit, element_count_threshold = element_count_threshold, request_byte_limit = request_byte_limit, request_byte_threshold = request_byte_threshold)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BundlingConfig]
  }
}

