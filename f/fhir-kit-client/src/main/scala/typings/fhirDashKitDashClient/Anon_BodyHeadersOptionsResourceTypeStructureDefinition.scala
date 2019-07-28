package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.StructureDefinition
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeStructureDefinition extends js.Object {
  var body: StructureDefinition
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.StructureDefinition
}

object Anon_BodyHeadersOptionsResourceTypeStructureDefinition {
  @scala.inline
  def apply(
    body: StructureDefinition,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.StructureDefinition,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsResourceTypeStructureDefinition = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeStructureDefinition]
  }
}

