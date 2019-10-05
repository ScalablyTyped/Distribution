package typings.fhirDashKitDashClient

import typings.fhir.fhir.MedicationStatement
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMedicationStatement extends js.Object {
  var body: MedicationStatement
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MedicationStatement
}

object Anon_BodyHeadersMedicationStatement {
  @scala.inline
  def apply(
    body: MedicationStatement,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MedicationStatement,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMedicationStatement = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMedicationStatement]
  }
}

