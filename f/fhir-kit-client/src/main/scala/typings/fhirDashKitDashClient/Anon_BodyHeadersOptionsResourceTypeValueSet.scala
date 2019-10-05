package typings.fhirDashKitDashClient

import typings.fhir.fhir.ValueSet
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeValueSet extends js.Object {
  var body: ValueSet
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ValueSet
}

object Anon_BodyHeadersOptionsResourceTypeValueSet {
  @scala.inline
  def apply(
    body: ValueSet,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ValueSet,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsResourceTypeValueSet = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeValueSet]
  }
}

