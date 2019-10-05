package typings.fhirDashKitDashClient

import typings.fhir.fhir.Condition
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCondition extends js.Object {
  var body: Condition
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Condition
}

object Anon_BodyCondition {
  @scala.inline
  def apply(
    body: Condition,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Condition,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyCondition = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCondition]
  }
}

