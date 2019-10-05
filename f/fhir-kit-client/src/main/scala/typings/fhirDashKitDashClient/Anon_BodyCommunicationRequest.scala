package typings.fhirDashKitDashClient

import typings.fhir.fhir.CommunicationRequest
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommunicationRequest extends js.Object {
  var body: CommunicationRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.CommunicationRequest
}

object Anon_BodyCommunicationRequest {
  @scala.inline
  def apply(
    body: CommunicationRequest,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.CommunicationRequest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyCommunicationRequest = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCommunicationRequest]
  }
}

