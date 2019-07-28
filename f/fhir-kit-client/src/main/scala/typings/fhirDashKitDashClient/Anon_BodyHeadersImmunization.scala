package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Immunization
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersImmunization extends js.Object {
  var body: Immunization
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Immunization
}

object Anon_BodyHeadersImmunization {
  @scala.inline
  def apply(
    body: Immunization,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Immunization,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersImmunization = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersImmunization]
  }
}

