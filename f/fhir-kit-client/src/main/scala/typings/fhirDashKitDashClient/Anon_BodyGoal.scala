package typings.fhirDashKitDashClient

import typings.fhir.fhir.Goal
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyGoal extends js.Object {
  var body: Goal
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Goal
}

object Anon_BodyGoal {
  @scala.inline
  def apply(
    body: Goal,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Goal,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyGoal = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyGoal]
  }
}

