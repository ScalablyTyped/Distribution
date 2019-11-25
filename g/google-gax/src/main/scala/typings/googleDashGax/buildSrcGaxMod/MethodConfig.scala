package typings.googleDashGax.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodConfig extends js.Object {
  var bundling: js.UndefOr[BundlingConfig] = js.undefined
  var retry_codes_name: String
  var retry_params_name: String
  var timeout_millis: js.UndefOr[Double] = js.undefined
}

object MethodConfig {
  @scala.inline
  def apply(
    retry_codes_name: String,
    retry_params_name: String,
    bundling: BundlingConfig = null,
    timeout_millis: Int | Double = null
  ): MethodConfig = {
    val __obj = js.Dynamic.literal(retry_codes_name = retry_codes_name.asInstanceOf[js.Any], retry_params_name = retry_params_name.asInstanceOf[js.Any])
    if (bundling != null) __obj.updateDynamic("bundling")(bundling.asInstanceOf[js.Any])
    if (timeout_millis != null) __obj.updateDynamic("timeout_millis")(timeout_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodConfig]
  }
}

