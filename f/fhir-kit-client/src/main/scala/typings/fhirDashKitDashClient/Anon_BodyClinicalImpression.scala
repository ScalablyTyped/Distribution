package typings.fhirDashKitDashClient

import typings.fhir.fhir.ClinicalImpression
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyClinicalImpression extends js.Object {
  var body: ClinicalImpression
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ClinicalImpression
}

object Anon_BodyClinicalImpression {
  @scala.inline
  def apply(
    body: ClinicalImpression,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ClinicalImpression,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyClinicalImpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyClinicalImpression]
  }
}

