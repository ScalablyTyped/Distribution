package typings.fhirKitClient.anon

import typings.fhir.fhir.Provenance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyProvenance extends js.Object {
  var body: Provenance
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Provenance
}

object BodyProvenance {
  @scala.inline
  def apply(
    body: Provenance,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Provenance,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyProvenance = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProvenance]
  }
}

