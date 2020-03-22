package typings.fhirKitClient

import typings.fhir.fhir.NamingSystem
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyNamingSystemHeadersHeaders extends js.Object {
  var body: NamingSystem
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.NamingSystem
}

object AnonBodyNamingSystemHeadersHeaders {
  @scala.inline
  def apply(
    body: NamingSystem,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.NamingSystem,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyNamingSystemHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyNamingSystemHeadersHeaders]
  }
}

