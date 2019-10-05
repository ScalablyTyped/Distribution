package typings.fhirDashKitDashClient

import typings.fhir.fhir.Substance
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdOptionsResourceTypeSubstance extends js.Object {
  var body: Substance
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Substance
}

object Anon_BodyHeadersIdOptionsResourceTypeSubstance {
  @scala.inline
  def apply(
    body: Substance,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Substance,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdOptionsResourceTypeSubstance = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdOptionsResourceTypeSubstance]
  }
}

