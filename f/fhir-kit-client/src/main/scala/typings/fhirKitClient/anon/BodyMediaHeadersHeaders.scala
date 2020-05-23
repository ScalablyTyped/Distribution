package typings.fhirKitClient.anon

import typings.fhir.fhir.Media
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyMediaHeadersHeaders extends js.Object {
  var body: Media
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Media
}

object BodyMediaHeadersHeaders {
  @scala.inline
  def apply(
    body: Media,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Media,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyMediaHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyMediaHeadersHeaders]
  }
}

