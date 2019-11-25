package typings.fhirDashKitDashClient

import typings.fhir.fhir.GuidanceResponse
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyGuidanceResponseHeaders extends js.Object {
  var body: GuidanceResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.GuidanceResponse
}

object Anon_BodyGuidanceResponseHeaders {
  @scala.inline
  def apply(
    body: GuidanceResponse,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.GuidanceResponse,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyGuidanceResponseHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyGuidanceResponseHeaders]
  }
}

