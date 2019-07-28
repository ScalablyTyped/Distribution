package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.DiagnosticReport
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDiagnosticReport extends js.Object {
  var body: DiagnosticReport
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DiagnosticReport
}

object Anon_BodyDiagnosticReport {
  @scala.inline
  def apply(
    body: DiagnosticReport,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DiagnosticReport,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDiagnosticReport = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDiagnosticReport]
  }
}

