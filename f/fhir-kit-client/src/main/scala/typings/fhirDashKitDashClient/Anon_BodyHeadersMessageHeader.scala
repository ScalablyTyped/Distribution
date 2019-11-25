package typings.fhirDashKitDashClient

import typings.fhir.fhir.MessageHeader
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMessageHeader extends js.Object {
  var body: MessageHeader
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MessageHeader
}

object Anon_BodyHeadersMessageHeader {
  @scala.inline
  def apply(
    body: MessageHeader,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.MessageHeader,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMessageHeader = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMessageHeader]
  }
}

