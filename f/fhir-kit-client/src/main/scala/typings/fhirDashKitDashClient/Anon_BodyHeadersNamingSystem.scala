package typings.fhirDashKitDashClient

import typings.fhir.fhir.NamingSystem
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersNamingSystem extends js.Object {
  var body: NamingSystem
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.NamingSystem
}

object Anon_BodyHeadersNamingSystem {
  @scala.inline
  def apply(
    body: NamingSystem,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.NamingSystem,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersNamingSystem = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersNamingSystem]
  }
}

