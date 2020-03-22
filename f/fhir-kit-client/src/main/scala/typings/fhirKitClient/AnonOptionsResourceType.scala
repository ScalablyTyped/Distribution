package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.AuditEvent
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptionsResourceType extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: AuditEvent
  var version: String
}

object AnonOptionsResourceType {
  @scala.inline
  def apply(
    id: String,
    resourceType: AuditEvent,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): AnonOptionsResourceType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionsResourceType]
  }
}

