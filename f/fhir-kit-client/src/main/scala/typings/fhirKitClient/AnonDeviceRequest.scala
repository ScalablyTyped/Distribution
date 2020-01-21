package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.DeviceRequest
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeviceRequest extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: DeviceRequest
  var version: String
}

object AnonDeviceRequest {
  @scala.inline
  def apply(
    id: String,
    resourceType: DeviceRequest,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): AnonDeviceRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeviceRequest]
  }
}

