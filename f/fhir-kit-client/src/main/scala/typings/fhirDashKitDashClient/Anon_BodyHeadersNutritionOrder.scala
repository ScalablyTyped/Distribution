package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.NutritionOrder
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersNutritionOrder extends js.Object {
  var body: NutritionOrder
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.NutritionOrder
}

object Anon_BodyHeadersNutritionOrder {
  @scala.inline
  def apply(
    body: NutritionOrder,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.NutritionOrder,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersNutritionOrder = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersNutritionOrder]
  }
}

