package typings.fhirKitClient.anon

import typings.fhir.fhir.OperationOutcome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyOperationOutcomeHeadersHeaders extends js.Object {
  var body: OperationOutcome
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.OperationOutcome
}

object BodyOperationOutcomeHeadersHeaders {
  @scala.inline
  def apply(
    body: OperationOutcome,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.OperationOutcome,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyOperationOutcomeHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyOperationOutcomeHeadersHeaders]
  }
}

