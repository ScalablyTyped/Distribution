package typings.fhirKitClient

import typings.fhir.fhir.Basic
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBasicBodyHeaders extends js.Object {
  var body: Basic
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Basic
}

object AnonBasicBodyHeaders {
  @scala.inline
  def apply(
    body: Basic,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Basic,
    headers: Headers = null,
    options: Options = null
  ): AnonBasicBodyHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBasicBodyHeaders]
  }
}

