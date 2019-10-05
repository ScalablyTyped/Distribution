package typings.fhirDashKitDashClient

import typings.fhir.fhir.Flag
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyFlag extends js.Object {
  var body: Flag
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Flag
}

object Anon_BodyFlag {
  @scala.inline
  def apply(
    body: Flag,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Flag,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyFlag = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyFlag]
  }
}

