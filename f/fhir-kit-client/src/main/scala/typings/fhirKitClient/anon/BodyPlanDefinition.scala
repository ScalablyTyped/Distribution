package typings.fhirKitClient.anon

import typings.fhir.fhir.PlanDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyPlanDefinition extends js.Object {
  var body: PlanDefinition
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.PlanDefinition
}

object BodyPlanDefinition {
  @scala.inline
  def apply(
    body: PlanDefinition,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.PlanDefinition,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyPlanDefinition = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyPlanDefinition]
  }
}

