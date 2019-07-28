package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.OperationOutcome
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOperationOutcome extends js.Object {
  var body: OperationOutcome
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.OperationOutcome
}

object Anon_BodyHeadersOperationOutcome {
  @scala.inline
  def apply(
    body: OperationOutcome,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.OperationOutcome,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOperationOutcome = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOperationOutcome]
  }
}

