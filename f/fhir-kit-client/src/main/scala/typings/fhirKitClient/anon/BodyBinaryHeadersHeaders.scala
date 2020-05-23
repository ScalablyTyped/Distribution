package typings.fhirKitClient.anon

import typings.fhir.fhir.Binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyBinaryHeadersHeaders extends js.Object {
  var body: Binary
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Binary
}

object BodyBinaryHeadersHeaders {
  @scala.inline
  def apply(
    body: Binary,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Binary,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyBinaryHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyBinaryHeadersHeaders]
  }
}

