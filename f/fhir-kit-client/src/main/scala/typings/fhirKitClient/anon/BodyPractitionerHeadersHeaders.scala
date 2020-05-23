package typings.fhirKitClient.anon

import typings.fhir.fhir.Practitioner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyPractitionerHeadersHeaders extends js.Object {
  var body: Practitioner
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Practitioner
}

object BodyPractitionerHeadersHeaders {
  @scala.inline
  def apply(
    body: Practitioner,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Practitioner,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyPractitionerHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyPractitionerHeadersHeaders]
  }
}

