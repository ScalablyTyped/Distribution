package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyBundle extends js.Object {
  var body: typings.fhir.fhir.Bundle
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Bundle
}

object BodyBundle {
  @scala.inline
  def apply(
    body: typings.fhir.fhir.Bundle,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Bundle,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyBundle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyBundle]
  }
}

