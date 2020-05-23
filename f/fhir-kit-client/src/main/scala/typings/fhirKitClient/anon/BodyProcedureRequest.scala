package typings.fhirKitClient.anon

import typings.fhir.fhir.ProcedureRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyProcedureRequest extends js.Object {
  var body: ProcedureRequest
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ProcedureRequest
}

object BodyProcedureRequest {
  @scala.inline
  def apply(
    body: ProcedureRequest,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ProcedureRequest,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyProcedureRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProcedureRequest]
  }
}

