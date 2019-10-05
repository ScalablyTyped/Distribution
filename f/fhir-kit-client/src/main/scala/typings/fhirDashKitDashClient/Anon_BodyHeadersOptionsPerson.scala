package typings.fhirDashKitDashClient

import typings.fhir.fhir.Person
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsPerson extends js.Object {
  var body: Person
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Person
}

object Anon_BodyHeadersOptionsPerson {
  @scala.inline
  def apply(
    body: Person,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Person,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsPerson = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsPerson]
  }
}

