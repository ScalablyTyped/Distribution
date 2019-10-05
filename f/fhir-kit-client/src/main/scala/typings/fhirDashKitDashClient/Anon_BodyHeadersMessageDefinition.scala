package typings.fhirDashKitDashClient

import typings.fhir.fhir.MessageDefinition
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMessageDefinition extends js.Object {
  var body: MessageDefinition
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MessageDefinition
}

object Anon_BodyHeadersMessageDefinition {
  @scala.inline
  def apply(
    body: MessageDefinition,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MessageDefinition,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMessageDefinition = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMessageDefinition]
  }
}

