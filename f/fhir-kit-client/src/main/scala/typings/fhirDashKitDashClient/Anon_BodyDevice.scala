package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Device
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDevice extends js.Object {
  var body: Device
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Device
}

object Anon_BodyDevice {
  @scala.inline
  def apply(
    body: Device,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Device,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDevice = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDevice]
  }
}

