package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitConfigSourceResponse extends js.Object {
  /** The generated service configuration. */
  var serviceConfig: js.UndefOr[Service] = js.undefined
}

object SubmitConfigSourceResponse {
  @scala.inline
  def apply(serviceConfig: Service = null): SubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceConfig != null) __obj.updateDynamic("serviceConfig")(serviceConfig)
    __obj.asInstanceOf[SubmitConfigSourceResponse]
  }
}

