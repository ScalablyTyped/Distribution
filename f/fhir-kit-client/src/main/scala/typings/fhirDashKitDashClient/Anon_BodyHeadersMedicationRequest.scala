package typings.fhirDashKitDashClient

import typings.fhir.fhir.MedicationRequest
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMedicationRequest extends js.Object {
  var body: MedicationRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MedicationRequest
}

object Anon_BodyHeadersMedicationRequest {
  @scala.inline
  def apply(
    body: MedicationRequest,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MedicationRequest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMedicationRequest = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMedicationRequest]
  }
}

