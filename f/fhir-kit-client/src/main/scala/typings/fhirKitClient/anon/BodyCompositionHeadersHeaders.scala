package typings.fhirKitClient.anon

import typings.fhir.fhir.Composition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyCompositionHeadersHeaders extends js.Object {
  var body: Composition
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Composition
}

object BodyCompositionHeadersHeaders {
  @scala.inline
  def apply(
    body: Composition,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Composition,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyCompositionHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCompositionHeadersHeaders]
  }
}

