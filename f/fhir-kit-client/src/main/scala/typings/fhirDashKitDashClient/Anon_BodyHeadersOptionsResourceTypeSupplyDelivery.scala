package typings.fhirDashKitDashClient

import typings.fhir.fhir.SupplyDelivery
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeSupplyDelivery extends js.Object {
  var body: SupplyDelivery
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.SupplyDelivery
}

object Anon_BodyHeadersOptionsResourceTypeSupplyDelivery {
  @scala.inline
  def apply(
    body: SupplyDelivery,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.SupplyDelivery,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsResourceTypeSupplyDelivery = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeSupplyDelivery]
  }
}

