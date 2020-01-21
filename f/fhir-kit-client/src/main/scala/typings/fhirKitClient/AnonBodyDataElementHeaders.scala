package typings.fhirKitClient

import typings.fhir.fhir.DataElement
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDataElementHeaders extends js.Object {
  var body: DataElement
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.DataElement
}

object AnonBodyDataElementHeaders {
  @scala.inline
  def apply(
    body: DataElement,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.DataElement,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDataElementHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDataElementHeaders]
  }
}

