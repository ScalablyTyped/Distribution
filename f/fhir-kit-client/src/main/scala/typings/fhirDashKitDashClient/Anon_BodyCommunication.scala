package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Communication
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommunication extends js.Object {
  var body: Communication
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Communication
}

object Anon_BodyCommunication {
  @scala.inline
  def apply(
    body: Communication,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Communication,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyCommunication = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCommunication]
  }
}

