package typings.fhirDashKitDashClient

import typings.fhir.fhir.Slot
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeSlot extends js.Object {
  var body: Slot
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Slot
}

object Anon_BodyHeadersOptionsResourceTypeSlot {
  @scala.inline
  def apply(
    body: Slot,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Slot,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsResourceTypeSlot = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeSlot]
  }
}

