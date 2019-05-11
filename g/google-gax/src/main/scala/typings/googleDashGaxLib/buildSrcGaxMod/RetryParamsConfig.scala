package typings
package googleDashGaxLib.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryParamsConfig extends js.Object {
  var initial_retry_delay_millis: scala.Double
  var initial_rpc_timeout_millis: scala.Double
  var max_retry_delay_millis: scala.Double
  var max_rpc_timeout_millis: scala.Double
  var retry_delay_multiplier: scala.Double
  var rpc_timeout_multiplier: scala.Double
  var total_timeout_millis: scala.Double
}

object RetryParamsConfig {
  @scala.inline
  def apply(
    initial_retry_delay_millis: scala.Double,
    initial_rpc_timeout_millis: scala.Double,
    max_retry_delay_millis: scala.Double,
    max_rpc_timeout_millis: scala.Double,
    retry_delay_multiplier: scala.Double,
    rpc_timeout_multiplier: scala.Double,
    total_timeout_millis: scala.Double
  ): RetryParamsConfig = {
    val __obj = js.Dynamic.literal(initial_retry_delay_millis = initial_retry_delay_millis, initial_rpc_timeout_millis = initial_rpc_timeout_millis, max_retry_delay_millis = max_retry_delay_millis, max_rpc_timeout_millis = max_rpc_timeout_millis, retry_delay_multiplier = retry_delay_multiplier, rpc_timeout_multiplier = rpc_timeout_multiplier, total_timeout_millis = total_timeout_millis)
  
    __obj.asInstanceOf[RetryParamsConfig]
  }
}

