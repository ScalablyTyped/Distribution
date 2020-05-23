package typings.fhirKitClient.anon

import typings.fhir.fhir.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyValueSet extends js.Object {
  var body: ValueSet
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ValueSet
}

object BodyValueSet {
  @scala.inline
  def apply(
    body: ValueSet,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ValueSet,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyValueSet = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyValueSet]
  }
}

