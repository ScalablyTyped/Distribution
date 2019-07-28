package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.SupplyDelivery
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdOptionsResourceTypeSupplyDelivery extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: SupplyDelivery
  var version: String
}

object Anon_HeadersIdOptionsResourceTypeSupplyDelivery {
  @scala.inline
  def apply(
    id: String,
    resourceType: SupplyDelivery,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon_HeadersIdOptionsResourceTypeSupplyDelivery = {
    val __obj = js.Dynamic.literal(id = id, resourceType = resourceType, version = version)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdOptionsResourceTypeSupplyDelivery]
  }
}

