package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.ClaimResponse
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyClaimResponse extends js.Object {
  var body: ClaimResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ClaimResponse
}

object Anon_BodyClaimResponse {
  @scala.inline
  def apply(
    body: ClaimResponse,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ClaimResponse,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyClaimResponse = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyClaimResponse]
  }
}

