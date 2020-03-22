package typings.fhirKitClient

import typings.fhir.fhir.MedicationDispense
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyMedicationDispenseHeadersHeaders extends js.Object {
  var body: MedicationDispense
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.MedicationDispense
}

object AnonBodyMedicationDispenseHeadersHeaders {
  @scala.inline
  def apply(
    body: MedicationDispense,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.MedicationDispense,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyMedicationDispenseHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyMedicationDispenseHeadersHeaders]
  }
}

