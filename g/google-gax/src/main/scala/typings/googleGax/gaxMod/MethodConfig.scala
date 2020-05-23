package typings.googleGax.gaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodConfig extends js.Object {
  var bundling: js.UndefOr[BundlingConfig | Null] = js.undefined
  var retry_codes_name: js.UndefOr[String] = js.undefined
  var retry_params_name: js.UndefOr[String] = js.undefined
  var timeout_millis: js.UndefOr[Double] = js.undefined
}

object MethodConfig {
  @scala.inline
  def apply(
    bundling: js.UndefOr[Null | BundlingConfig] = js.undefined,
    retry_codes_name: String = null,
    retry_params_name: String = null,
    timeout_millis: js.UndefOr[Double] = js.undefined
  ): MethodConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bundling)) __obj.updateDynamic("bundling")(bundling.asInstanceOf[js.Any])
    if (retry_codes_name != null) __obj.updateDynamic("retry_codes_name")(retry_codes_name.asInstanceOf[js.Any])
    if (retry_params_name != null) __obj.updateDynamic("retry_params_name")(retry_params_name.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout_millis)) __obj.updateDynamic("timeout_millis")(timeout_millis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodConfig]
  }
}

