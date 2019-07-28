package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Account
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountBody extends js.Object {
  var body: Account
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Account
}

object Anon_AccountBody {
  @scala.inline
  def apply(
    body: Account,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Account,
    headers: Headers = null,
    options: Options = null
  ): Anon_AccountBody = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountBody]
  }
}

