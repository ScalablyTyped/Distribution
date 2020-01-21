package typings.fhirKitClient

import typings.fhir.fhir.ValueSet
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyHeadersOptionsResourceTypeValueSet extends js.Object {
  var body: ValueSet
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ValueSet
}

object AnonBodyHeadersOptionsResourceTypeValueSet {
  @scala.inline
  def apply(
    body: ValueSet,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ValueSet,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyHeadersOptionsResourceTypeValueSet = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyHeadersOptionsResourceTypeValueSet]
  }
}

