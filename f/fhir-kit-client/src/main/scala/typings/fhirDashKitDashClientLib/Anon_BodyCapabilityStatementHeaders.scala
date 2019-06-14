package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCapabilityStatementHeaders extends js.Object {
  var body: fhirLib.fhirNs.CapabilityStatement
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var id: java.lang.String
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.CapabilityStatement
}

object Anon_BodyCapabilityStatementHeaders {
  @scala.inline
  def apply(
    body: fhirLib.fhirNs.CapabilityStatement,
    id: java.lang.String,
    resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.CapabilityStatement,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_BodyCapabilityStatementHeaders = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCapabilityStatementHeaders]
  }
}

