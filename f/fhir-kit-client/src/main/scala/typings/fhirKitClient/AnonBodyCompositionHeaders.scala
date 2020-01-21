package typings.fhirKitClient

import typings.fhir.fhir.Composition
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCompositionHeaders extends js.Object {
  var body: Composition
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Composition
}

object AnonBodyCompositionHeaders {
  @scala.inline
  def apply(
    body: Composition,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Composition,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyCompositionHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyCompositionHeaders]
  }
}

