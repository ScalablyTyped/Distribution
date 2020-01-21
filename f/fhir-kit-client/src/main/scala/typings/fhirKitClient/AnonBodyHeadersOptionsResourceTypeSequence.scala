package typings.fhirKitClient

import typings.fhir.fhir.Sequence
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyHeadersOptionsResourceTypeSequence extends js.Object {
  var body: Sequence
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Sequence
}

object AnonBodyHeadersOptionsResourceTypeSequence {
  @scala.inline
  def apply(
    body: Sequence,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Sequence,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyHeadersOptionsResourceTypeSequence = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyHeadersOptionsResourceTypeSequence]
  }
}

