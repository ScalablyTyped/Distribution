package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Basic
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BasicBody extends js.Object {
  var body: Basic
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Basic
}

object Anon_BasicBody {
  @scala.inline
  def apply(
    body: Basic,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Basic,
    headers: Headers = null,
    options: Options = null
  ): Anon_BasicBody = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BasicBody]
  }
}

