package typings.fhirDashKitDashClient

import typings.fhir.fhir.Location
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersLocation extends js.Object {
  var body: Location
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Location
}

object Anon_BodyHeadersLocation {
  @scala.inline
  def apply(
    body: Location,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Location,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersLocation = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersLocation]
  }
}

