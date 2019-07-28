package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.ImmunizationRecommendation
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersImmunizationRecommendation extends js.Object {
  var body: ImmunizationRecommendation
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImmunizationRecommendation
}

object Anon_BodyHeadersImmunizationRecommendation {
  @scala.inline
  def apply(
    body: ImmunizationRecommendation,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImmunizationRecommendation,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersImmunizationRecommendation]
  }
}

