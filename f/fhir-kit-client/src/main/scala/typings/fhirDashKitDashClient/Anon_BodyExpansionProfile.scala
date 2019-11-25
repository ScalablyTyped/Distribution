package typings.fhirDashKitDashClient

import typings.fhir.fhir.ExpansionProfile
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyExpansionProfile extends js.Object {
  var body: ExpansionProfile
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ExpansionProfile
}

object Anon_BodyExpansionProfile {
  @scala.inline
  def apply(
    body: ExpansionProfile,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ExpansionProfile,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyExpansionProfile = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyExpansionProfile]
  }
}

