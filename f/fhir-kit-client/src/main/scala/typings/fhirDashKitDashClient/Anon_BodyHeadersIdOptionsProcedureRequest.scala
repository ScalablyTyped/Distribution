package typings.fhirDashKitDashClient

import typings.fhir.fhir.ProcedureRequest
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdOptionsProcedureRequest extends js.Object {
  var body: ProcedureRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ProcedureRequest
}

object Anon_BodyHeadersIdOptionsProcedureRequest {
  @scala.inline
  def apply(
    body: ProcedureRequest,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ProcedureRequest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdOptionsProcedureRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdOptionsProcedureRequest]
  }
}

