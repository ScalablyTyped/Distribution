package typings.fhirDashKitDashClient

import typings.fhir.fhir.Encounter
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyEncounter extends js.Object {
  var body: Encounter
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Encounter
}

object Anon_BodyEncounter {
  @scala.inline
  def apply(
    body: Encounter,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Encounter,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyEncounter = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyEncounter]
  }
}

