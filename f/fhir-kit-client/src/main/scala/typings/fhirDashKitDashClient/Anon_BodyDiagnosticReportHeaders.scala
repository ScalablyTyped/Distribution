package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.DiagnosticReport
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDiagnosticReportHeaders extends js.Object {
  var body: DiagnosticReport
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DiagnosticReport
}

object Anon_BodyDiagnosticReportHeaders {
  @scala.inline
  def apply(
    body: DiagnosticReport,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DiagnosticReport,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDiagnosticReportHeaders = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDiagnosticReportHeaders]
  }
}

