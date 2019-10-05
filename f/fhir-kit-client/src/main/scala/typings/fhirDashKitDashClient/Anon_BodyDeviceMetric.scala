package typings.fhirDashKitDashClient

import typings.fhir.fhir.DeviceMetric
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDeviceMetric extends js.Object {
  var body: DeviceMetric
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DeviceMetric
}

object Anon_BodyDeviceMetric {
  @scala.inline
  def apply(
    body: DeviceMetric,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DeviceMetric,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDeviceMetric = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDeviceMetric]
  }
}

