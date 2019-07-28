package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.DomainResource
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDomainResource extends js.Object {
  var body: DomainResource
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DomainResource
}

object Anon_BodyDomainResource {
  @scala.inline
  def apply(
    body: DomainResource,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DomainResource,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDomainResource = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDomainResource]
  }
}

