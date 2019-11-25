package typings.fhirDashKitDashClient

import typings.fhir.fhir.MedicationDispense
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMedicationDispense extends js.Object {
  var body: MedicationDispense
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MedicationDispense
}

object Anon_BodyHeadersMedicationDispense {
  @scala.inline
  def apply(
    body: MedicationDispense,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MedicationDispense,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMedicationDispense = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMedicationDispense]
  }
}

