package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyGuidanceResponseHeaders extends js.Object {
  var body: fhirLib.fhirNs.GuidanceResponse
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var id: java.lang.String
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.GuidanceResponse
}

object Anon_BodyGuidanceResponseHeaders {
  @scala.inline
  def apply(
    body: fhirLib.fhirNs.GuidanceResponse,
    id: java.lang.String,
    resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.GuidanceResponse,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_BodyGuidanceResponseHeaders = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyGuidanceResponseHeaders]
  }
}

