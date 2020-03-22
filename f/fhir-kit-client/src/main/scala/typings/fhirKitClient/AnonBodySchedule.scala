package typings.fhirKitClient

import typings.fhir.fhir.Schedule
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodySchedule extends js.Object {
  var body: Schedule
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Schedule
}

object AnonBodySchedule {
  @scala.inline
  def apply(
    body: Schedule,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Schedule,
    headers: Headers = null,
    options: Options = null
  ): AnonBodySchedule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodySchedule]
  }
}

