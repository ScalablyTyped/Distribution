package typings.fhirDashKitDashClient

import typings.fhir.fhir.Contract
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyContract extends js.Object {
  var body: Contract
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Contract
}

object Anon_BodyContract {
  @scala.inline
  def apply(
    body: Contract,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Contract,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyContract = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyContract]
  }
}

