package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImmunizationRecommendation
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdImmunizationRecommendation extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ImmunizationRecommendation
  var version: String
}

object Anon_HeadersIdImmunizationRecommendation {
  @scala.inline
  def apply(
    id: String,
    resourceType: ImmunizationRecommendation,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon_HeadersIdImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdImmunizationRecommendation]
  }
}

