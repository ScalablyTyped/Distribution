package typings.fhirDashKitDashClient

import typings.fhir.fhir.Claim
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyClaim extends js.Object {
  var body: Claim
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Claim
}

object Anon_BodyClaim {
  @scala.inline
  def apply(
    body: Claim,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Claim,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyClaim = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyClaim]
  }
}

