package typings.fhirKitClient.anon

import typings.fhir.fhir.MedicationDispense
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyMedicationDispense extends js.Object {
  var body: MedicationDispense
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.MedicationDispense
}

object BodyMedicationDispense {
  @scala.inline
  def apply(
    body: MedicationDispense,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.MedicationDispense,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyMedicationDispense = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyMedicationDispense]
  }
}

