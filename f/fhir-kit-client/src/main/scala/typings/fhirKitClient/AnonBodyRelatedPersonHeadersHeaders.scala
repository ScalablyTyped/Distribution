package typings.fhirKitClient

import typings.fhir.fhir.RelatedPerson
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyRelatedPersonHeadersHeaders extends js.Object {
  var body: RelatedPerson
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.RelatedPerson
}

object AnonBodyRelatedPersonHeadersHeaders {
  @scala.inline
  def apply(
    body: RelatedPerson,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.RelatedPerson,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyRelatedPersonHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyRelatedPersonHeadersHeaders]
  }
}

