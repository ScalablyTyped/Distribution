package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.VisionPrescription
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeVisionPrescription extends js.Object {
  var body: VisionPrescription
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.VisionPrescription
}

object Anon_BodyHeadersOptionsResourceTypeVisionPrescription {
  @scala.inline
  def apply(
    body: VisionPrescription,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.VisionPrescription,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsResourceTypeVisionPrescription = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeVisionPrescription]
  }
}

