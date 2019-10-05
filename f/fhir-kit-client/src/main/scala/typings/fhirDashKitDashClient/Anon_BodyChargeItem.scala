package typings.fhirDashKitDashClient

import typings.fhir.fhir.ChargeItem
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyChargeItem extends js.Object {
  var body: ChargeItem
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ChargeItem
}

object Anon_BodyChargeItem {
  @scala.inline
  def apply(
    body: ChargeItem,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ChargeItem,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyChargeItem = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyChargeItem]
  }
}

