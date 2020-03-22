package typings.fhirKitClient

import typings.fhir.fhir.Measure
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyMeasure extends js.Object {
  var body: Measure
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Measure
}

object AnonBodyMeasure {
  @scala.inline
  def apply(
    body: Measure,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Measure,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyMeasure = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyMeasure]
  }
}

