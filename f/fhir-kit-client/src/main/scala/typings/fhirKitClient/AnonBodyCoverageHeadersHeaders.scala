package typings.fhirKitClient

import typings.fhir.fhir.Coverage
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCoverageHeadersHeaders extends js.Object {
  var body: Coverage
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Coverage
}

object AnonBodyCoverageHeadersHeaders {
  @scala.inline
  def apply(
    body: Coverage,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Coverage,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyCoverageHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyCoverageHeadersHeaders]
  }
}

