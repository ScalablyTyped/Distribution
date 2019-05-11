package typings
package googleDashGaxLib.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodConfig extends js.Object {
  var bundling: js.UndefOr[BundlingConfig] = js.undefined
  var retry_codes_name: java.lang.String
  var retry_params_name: java.lang.String
  var timeout_millis: js.UndefOr[scala.Double] = js.undefined
}

object MethodConfig {
  @scala.inline
  def apply(
    retry_codes_name: java.lang.String,
    retry_params_name: java.lang.String,
    bundling: BundlingConfig = null,
    timeout_millis: scala.Int | scala.Double = null
  ): MethodConfig = {
    val __obj = js.Dynamic.literal(retry_codes_name = retry_codes_name, retry_params_name = retry_params_name)
    if (bundling != null) __obj.updateDynamic("bundling")(bundling)
    if (timeout_millis != null) __obj.updateDynamic("timeout_millis")(timeout_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodConfig]
  }
}

