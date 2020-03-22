package typings.fhirKitClient

import typings.fhir.fhir.Observation
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyObservationHeadersHeaders extends js.Object {
  var body: Observation
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Observation
}

object AnonBodyObservationHeadersHeaders {
  @scala.inline
  def apply(
    body: Observation,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Observation,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyObservationHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyObservationHeadersHeaders]
  }
}

