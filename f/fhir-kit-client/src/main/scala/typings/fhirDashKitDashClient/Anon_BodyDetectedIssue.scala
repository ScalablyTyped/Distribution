package typings.fhirDashKitDashClient

import typings.fhir.fhir.DetectedIssue
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyDetectedIssue extends js.Object {
  var body: DetectedIssue
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DetectedIssue
}

object Anon_BodyDetectedIssue {
  @scala.inline
  def apply(
    body: DetectedIssue,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.DetectedIssue,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyDetectedIssue = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyDetectedIssue]
  }
}

