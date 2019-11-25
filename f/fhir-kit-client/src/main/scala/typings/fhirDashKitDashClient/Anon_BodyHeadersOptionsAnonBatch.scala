package typings.fhirDashKitDashClient

import typings.fhir.fhir.Bundle
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsAnonBatch extends js.Object {
  var body: Bundle with Anon_Batch
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
}

object Anon_BodyHeadersOptionsAnonBatch {
  @scala.inline
  def apply(body: Bundle with Anon_Batch, headers: Headers = null, options: Options = null): Anon_BodyHeadersOptionsAnonBatch = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsAnonBatch]
  }
}

