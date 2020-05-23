package typings.fhirKitClient.anon

import typings.fhir.fhir.NutritionOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyNutritionOrder extends js.Object {
  var body: NutritionOrder
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.NutritionOrder
}

object BodyNutritionOrder {
  @scala.inline
  def apply(
    body: NutritionOrder,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.NutritionOrder,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyNutritionOrder = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyNutritionOrder]
  }
}

