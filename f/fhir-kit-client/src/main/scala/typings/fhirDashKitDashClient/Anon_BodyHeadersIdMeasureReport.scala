package typings.fhirDashKitDashClient

import typings.fhir.fhir.MeasureReport
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdMeasureReport extends js.Object {
  var body: MeasureReport
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MeasureReport
}

object Anon_BodyHeadersIdMeasureReport {
  @scala.inline
  def apply(
    body: MeasureReport,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MeasureReport,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdMeasureReport = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdMeasureReport]
  }
}

