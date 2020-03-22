package typings.fhirKitClient

import typings.fhir.fhir.ValueSet
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyValueSetHeadersHeaders extends js.Object {
  var body: ValueSet
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ValueSet
}

object AnonBodyValueSetHeadersHeaders {
  @scala.inline
  def apply(
    body: ValueSet,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ValueSet,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyValueSetHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyValueSetHeadersHeaders]
  }
}

