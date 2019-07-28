package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.ProcedureRequest
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsProcedureRequest extends js.Object {
  var body: ProcedureRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ProcedureRequest
}

object Anon_BodyHeadersOptionsProcedureRequest {
  @scala.inline
  def apply(
    body: ProcedureRequest,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ProcedureRequest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsProcedureRequest = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsProcedureRequest]
  }
}

