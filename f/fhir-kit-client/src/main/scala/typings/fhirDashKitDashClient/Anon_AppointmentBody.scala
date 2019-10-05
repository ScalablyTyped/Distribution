package typings.fhirDashKitDashClient

import typings.fhir.fhir.Appointment
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppointmentBody extends js.Object {
  var body: Appointment
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Appointment
}

object Anon_AppointmentBody {
  @scala.inline
  def apply(
    body: Appointment,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Appointment,
    headers: Headers = null,
    options: Options = null
  ): Anon_AppointmentBody = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AppointmentBody]
  }
}

