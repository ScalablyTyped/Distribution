package typings.fhirDashKitDashClient

import typings.fhir.fhir.GuidanceResponse
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyGuidanceResponse extends js.Object {
  var body: GuidanceResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.GuidanceResponse
}

object Anon_BodyGuidanceResponse {
  @scala.inline
  def apply(
    body: GuidanceResponse,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.GuidanceResponse,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyGuidanceResponse = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyGuidanceResponse]
  }
}

