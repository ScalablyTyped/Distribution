package typings.fhirKitClient.anon

import typings.fhir.fhir.SupplyDelivery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySupplyDeliveryHeadersHeaders extends js.Object {
  var body: SupplyDelivery
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.SupplyDelivery
}

object BodySupplyDeliveryHeadersHeaders {
  @scala.inline
  def apply(
    body: SupplyDelivery,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.SupplyDelivery,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodySupplyDeliveryHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySupplyDeliveryHeadersHeaders]
  }
}

