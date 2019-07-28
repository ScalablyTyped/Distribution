package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.AuditEvent
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuditEventBody extends js.Object {
  var body: AuditEvent
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.AuditEvent
}

object Anon_AuditEventBody {
  @scala.inline
  def apply(
    body: AuditEvent,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.AuditEvent,
    headers: Headers = null,
    options: Options = null
  ): Anon_AuditEventBody = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuditEventBody]
  }
}

