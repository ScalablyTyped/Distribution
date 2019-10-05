package typings.fhirDashKitDashClient

import typings.fhir.fhir.CapabilityStatement
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCapabilityStatement extends js.Object {
  var body: CapabilityStatement
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.CapabilityStatement
}

object Anon_BodyCapabilityStatement {
  @scala.inline
  def apply(
    body: CapabilityStatement,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.CapabilityStatement,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyCapabilityStatement = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCapabilityStatement]
  }
}

