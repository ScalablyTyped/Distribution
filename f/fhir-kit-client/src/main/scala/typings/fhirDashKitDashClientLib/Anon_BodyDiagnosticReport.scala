package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDiagnosticReport extends js.Object {
  var body: fhirLib.fhirNs.DiagnosticReport
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.DiagnosticReport
}

object Anon_BodyDiagnosticReport {
  @scala.inline
  def apply(
    body: fhirLib.fhirNs.DiagnosticReport,
    resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.DiagnosticReport,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_BodyDiagnosticReport = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDiagnosticReport]
  }
}

