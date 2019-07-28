package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.CompartmentDefinition
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCompartmentDefinition extends js.Object {
  var body: CompartmentDefinition
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.CompartmentDefinition
}

object Anon_BodyCompartmentDefinition {
  @scala.inline
  def apply(
    body: CompartmentDefinition,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.CompartmentDefinition,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyCompartmentDefinition = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCompartmentDefinition]
  }
}

