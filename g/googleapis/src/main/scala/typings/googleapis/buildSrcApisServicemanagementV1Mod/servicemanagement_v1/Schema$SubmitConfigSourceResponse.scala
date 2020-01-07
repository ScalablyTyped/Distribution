package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for SubmitConfigSource method.
  */
@js.native
trait Schema$SubmitConfigSourceResponse extends js.Object {
  /**
    * The generated service configuration.
    */
  var serviceConfig: js.UndefOr[Schema$Service] = js.native
}

object Schema$SubmitConfigSourceResponse {
  @scala.inline
  def apply(serviceConfig: Schema$Service = null): Schema$SubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceConfig != null) __obj.updateDynamic("serviceConfig")(serviceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubmitConfigSourceResponse]
  }
}

