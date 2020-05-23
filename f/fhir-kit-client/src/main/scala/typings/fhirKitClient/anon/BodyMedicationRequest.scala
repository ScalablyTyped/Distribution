package typings.fhirKitClient.anon

import typings.fhir.fhir.MedicationRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyMedicationRequest extends js.Object {
  var body: MedicationRequest
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.MedicationRequest
}

object BodyMedicationRequest {
  @scala.inline
  def apply(
    body: MedicationRequest,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.MedicationRequest,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyMedicationRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyMedicationRequest]
  }
}

