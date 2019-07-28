package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Consent
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyConsent extends js.Object {
  var body: Consent
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Consent
}

object Anon_BodyConsent {
  @scala.inline
  def apply(
    body: Consent,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Consent,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyConsent = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyConsent]
  }
}

