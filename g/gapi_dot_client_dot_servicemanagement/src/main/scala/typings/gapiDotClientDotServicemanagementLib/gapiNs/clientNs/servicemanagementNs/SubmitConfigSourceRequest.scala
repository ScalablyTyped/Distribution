package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitConfigSourceRequest extends js.Object {
  /** The source configuration for the service. */
  var configSource: js.UndefOr[ConfigSource] = js.undefined
  /**
    * Optional. If set, this will result in the generation of a
    * `google.api.Service` configuration based on the `ConfigSource` provided,
    * but the generated config and the sources will NOT be persisted.
    */
  var validateOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object SubmitConfigSourceRequest {
  @scala.inline
  def apply(configSource: ConfigSource = null, validateOnly: js.UndefOr[scala.Boolean] = js.undefined): SubmitConfigSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (configSource != null) __obj.updateDynamic("configSource")(configSource)
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly)
    __obj.asInstanceOf[SubmitConfigSourceRequest]
  }
}

