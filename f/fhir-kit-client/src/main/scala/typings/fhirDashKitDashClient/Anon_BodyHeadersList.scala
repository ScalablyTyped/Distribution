package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.List
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersList extends js.Object {
  var body: List
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.List
}

object Anon_BodyHeadersList {
  @scala.inline
  def apply(
    body: List,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.List,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersList = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersList]
  }
}

