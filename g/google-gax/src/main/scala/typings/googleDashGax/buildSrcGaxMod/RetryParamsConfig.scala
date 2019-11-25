package typings.googleDashGax.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryParamsConfig extends js.Object {
  var initial_retry_delay_millis: Double
  var initial_rpc_timeout_millis: Double
  var max_retry_delay_millis: Double
  var max_rpc_timeout_millis: Double
  var retry_delay_multiplier: Double
  var rpc_timeout_multiplier: Double
  var total_timeout_millis: Double
}

object RetryParamsConfig {
  @scala.inline
  def apply(
    initial_retry_delay_millis: Double,
    initial_rpc_timeout_millis: Double,
    max_retry_delay_millis: Double,
    max_rpc_timeout_millis: Double,
    retry_delay_multiplier: Double,
    rpc_timeout_multiplier: Double,
    total_timeout_millis: Double
  ): RetryParamsConfig = {
    val __obj = js.Dynamic.literal(initial_retry_delay_millis = initial_retry_delay_millis.asInstanceOf[js.Any], initial_rpc_timeout_millis = initial_rpc_timeout_millis.asInstanceOf[js.Any], max_retry_delay_millis = max_retry_delay_millis.asInstanceOf[js.Any], max_rpc_timeout_millis = max_rpc_timeout_millis.asInstanceOf[js.Any], retry_delay_multiplier = retry_delay_multiplier.asInstanceOf[js.Any], rpc_timeout_multiplier = rpc_timeout_multiplier.asInstanceOf[js.Any], total_timeout_millis = total_timeout_millis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetryParamsConfig]
  }
}

