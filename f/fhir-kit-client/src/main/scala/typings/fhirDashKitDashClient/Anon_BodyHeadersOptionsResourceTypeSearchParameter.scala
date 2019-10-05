package typings.fhirDashKitDashClient

import typings.fhir.fhir.SearchParameter
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeSearchParameter extends js.Object {
  var body: SearchParameter
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.SearchParameter
}

object Anon_BodyHeadersOptionsResourceTypeSearchParameter {
  @scala.inline
  def apply(
    body: SearchParameter,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.SearchParameter,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsResourceTypeSearchParameter = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeSearchParameter]
  }
}

