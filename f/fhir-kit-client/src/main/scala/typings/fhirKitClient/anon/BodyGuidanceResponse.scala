package typings.fhirKitClient.anon

import typings.fhir.fhir.GuidanceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyGuidanceResponse extends js.Object {
  var body: GuidanceResponse
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.GuidanceResponse
}

object BodyGuidanceResponse {
  @scala.inline
  def apply(
    body: GuidanceResponse,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.GuidanceResponse,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyGuidanceResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyGuidanceResponse]
  }
}

