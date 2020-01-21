package typings.fhirKitClient

import typings.fhir.fhir.Procedure
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyHeadersOptionsProcedure extends js.Object {
  var body: Procedure
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Procedure
}

object AnonBodyHeadersOptionsProcedure {
  @scala.inline
  def apply(
    body: Procedure,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Procedure,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyHeadersOptionsProcedure = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyHeadersOptionsProcedure]
  }
}

