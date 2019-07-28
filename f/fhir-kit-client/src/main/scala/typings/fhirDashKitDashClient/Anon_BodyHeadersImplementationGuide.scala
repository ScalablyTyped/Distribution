package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.ImplementationGuide
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersImplementationGuide extends js.Object {
  var body: ImplementationGuide
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImplementationGuide
}

object Anon_BodyHeadersImplementationGuide {
  @scala.inline
  def apply(
    body: ImplementationGuide,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImplementationGuide,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersImplementationGuide = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersImplementationGuide]
  }
}

