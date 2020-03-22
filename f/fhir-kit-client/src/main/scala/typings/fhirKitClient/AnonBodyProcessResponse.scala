package typings.fhirKitClient

import typings.fhir.fhir.ProcessResponse
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyProcessResponse extends js.Object {
  var body: ProcessResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ProcessResponse
}

object AnonBodyProcessResponse {
  @scala.inline
  def apply(
    body: ProcessResponse,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ProcessResponse,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyProcessResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyProcessResponse]
  }
}

