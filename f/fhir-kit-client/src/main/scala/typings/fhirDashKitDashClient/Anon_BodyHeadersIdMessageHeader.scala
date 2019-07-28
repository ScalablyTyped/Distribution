package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.MessageHeader
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdMessageHeader extends js.Object {
  var body: MessageHeader
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MessageHeader
}

object Anon_BodyHeadersIdMessageHeader {
  @scala.inline
  def apply(
    body: MessageHeader,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MessageHeader,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdMessageHeader = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdMessageHeader]
  }
}

