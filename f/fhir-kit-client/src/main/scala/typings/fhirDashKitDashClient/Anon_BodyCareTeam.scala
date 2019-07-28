package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.CareTeam
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCareTeam extends js.Object {
  var body: CareTeam
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.CareTeam
}

object Anon_BodyCareTeam {
  @scala.inline
  def apply(
    body: CareTeam,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.CareTeam,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyCareTeam = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCareTeam]
  }
}

