package typings.fhirKitClient

import typings.fhir.fhir.Bundle
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyHeadersOptionsAnonBatch extends js.Object {
  var body: Bundle with AnonBatch
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
}

object AnonBodyHeadersOptionsAnonBatch {
  @scala.inline
  def apply(body: Bundle with AnonBatch, headers: Headers = null, options: Options = null): AnonBodyHeadersOptionsAnonBatch = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyHeadersOptionsAnonBatch]
  }
}

