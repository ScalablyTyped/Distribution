package typings.fhirKitClient.anon

import typings.fhir.fhir.SupplyDelivery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySupplyDelivery extends js.Object {
  var body: SupplyDelivery
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.SupplyDelivery
}

object BodySupplyDelivery {
  @scala.inline
  def apply(
    body: SupplyDelivery,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.SupplyDelivery,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodySupplyDelivery = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySupplyDelivery]
  }
}

