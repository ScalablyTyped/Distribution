package typings.fhirDashKitDashClient

import typings.fhir.fhir.HealthcareService
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersHealthcareService extends js.Object {
  var body: HealthcareService
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.HealthcareService
}

object Anon_BodyHeadersHealthcareService {
  @scala.inline
  def apply(
    body: HealthcareService,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.HealthcareService,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersHealthcareService = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersHealthcareService]
  }
}

