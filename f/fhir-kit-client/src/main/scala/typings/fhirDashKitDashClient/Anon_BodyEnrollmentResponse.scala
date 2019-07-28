package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.EnrollmentResponse
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyEnrollmentResponse extends js.Object {
  var body: EnrollmentResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.EnrollmentResponse
}

object Anon_BodyEnrollmentResponse {
  @scala.inline
  def apply(
    body: EnrollmentResponse,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.EnrollmentResponse,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyEnrollmentResponse = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyEnrollmentResponse]
  }
}

