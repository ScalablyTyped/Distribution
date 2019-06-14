package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyGraphDefinition extends js.Object {
  var body: fhirLib.fhirNs.GraphDefinition
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.GraphDefinition
}

object Anon_BodyGraphDefinition {
  @scala.inline
  def apply(
    body: fhirLib.fhirNs.GraphDefinition,
    resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.GraphDefinition,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_BodyGraphDefinition = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyGraphDefinition]
  }
}

