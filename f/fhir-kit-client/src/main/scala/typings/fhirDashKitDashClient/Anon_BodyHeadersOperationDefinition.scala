package typings.fhirDashKitDashClient

import typings.fhir.fhir.OperationDefinition
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOperationDefinition extends js.Object {
  var body: OperationDefinition
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.OperationDefinition
}

object Anon_BodyHeadersOperationDefinition {
  @scala.inline
  def apply(
    body: OperationDefinition,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.OperationDefinition,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOperationDefinition = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOperationDefinition]
  }
}

