package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOperationDefinition extends js.Object {
  var body: fhirLib.fhirNs.OperationDefinition
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.OperationDefinition
}

object Anon_BodyHeadersOperationDefinition {
  @scala.inline
  def apply(
    body: fhirLib.fhirNs.OperationDefinition,
    resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.OperationDefinition,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_BodyHeadersOperationDefinition = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOperationDefinition]
  }
}

