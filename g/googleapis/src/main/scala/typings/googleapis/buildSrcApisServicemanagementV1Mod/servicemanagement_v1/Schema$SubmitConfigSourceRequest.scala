package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for SubmitConfigSource method.
  */
@js.native
trait Schema$SubmitConfigSourceRequest extends js.Object {
  /**
    * The source configuration for the service.
    */
  var configSource: js.UndefOr[Schema$ConfigSource] = js.native
  /**
    * Optional. If set, this will result in the generation of a
    * `google.api.Service` configuration based on the `ConfigSource` provided,
    * but the generated config and the sources will NOT be persisted.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}

object Schema$SubmitConfigSourceRequest {
  @scala.inline
  def apply(configSource: Schema$ConfigSource = null, validateOnly: js.UndefOr[Boolean] = js.undefined): Schema$SubmitConfigSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (configSource != null) __obj.updateDynamic("configSource")(configSource.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubmitConfigSourceRequest]
  }
}

