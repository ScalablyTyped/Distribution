package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.RelatedPerson
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsRelatedPerson extends js.Object {
  var body: RelatedPerson
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.RelatedPerson
}

object Anon_BodyHeadersOptionsRelatedPerson {
  @scala.inline
  def apply(
    body: RelatedPerson,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.RelatedPerson,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsRelatedPerson = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsRelatedPerson]
  }
}

