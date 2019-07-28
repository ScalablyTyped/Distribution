package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Binary
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinaryBody extends js.Object {
  var body: Binary
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Binary
}

object Anon_BinaryBody {
  @scala.inline
  def apply(
    body: Binary,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Binary,
    headers: Headers = null,
    options: Options = null
  ): Anon_BinaryBody = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BinaryBody]
  }
}

