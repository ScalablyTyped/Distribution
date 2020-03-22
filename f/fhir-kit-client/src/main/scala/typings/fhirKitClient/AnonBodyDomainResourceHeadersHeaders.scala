package typings.fhirKitClient

import typings.fhir.fhir.DomainResource
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDomainResourceHeadersHeaders extends js.Object {
  var body: DomainResource
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.DomainResource
}

object AnonBodyDomainResourceHeadersHeaders {
  @scala.inline
  def apply(
    body: DomainResource,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.DomainResource,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDomainResourceHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDomainResourceHeadersHeaders]
  }
}

