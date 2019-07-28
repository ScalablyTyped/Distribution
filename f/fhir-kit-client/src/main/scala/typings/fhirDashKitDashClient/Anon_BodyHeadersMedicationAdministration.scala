package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.MedicationAdministration
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMedicationAdministration extends js.Object {
  var body: MedicationAdministration
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MedicationAdministration
}

object Anon_BodyHeadersMedicationAdministration {
  @scala.inline
  def apply(
    body: MedicationAdministration,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MedicationAdministration,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMedicationAdministration = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMedicationAdministration]
  }
}

