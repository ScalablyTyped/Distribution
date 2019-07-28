package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Practitioner
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdOptionsPractitioner extends js.Object {
  var body: Practitioner
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Practitioner
}

object Anon_BodyHeadersIdOptionsPractitioner {
  @scala.inline
  def apply(
    body: Practitioner,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Practitioner,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdOptionsPractitioner = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdOptionsPractitioner]
  }
}

