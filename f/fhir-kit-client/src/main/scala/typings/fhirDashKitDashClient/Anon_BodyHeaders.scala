package typings.fhirDashKitDashClient

import typings.fhir.fhir.HealthcareService
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeaders extends js.Object {
  var body: HealthcareService
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.HealthcareService
}

object Anon_BodyHeaders {
  @scala.inline
  def apply(
    body: HealthcareService,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.HealthcareService,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeaders]
  }
}

