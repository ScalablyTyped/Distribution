package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.Sequence
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsResourceTypeSequence extends js.Object {
  var body: Sequence
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Sequence
}

object Anon_BodyHeadersOptionsResourceTypeSequence {
  @scala.inline
  def apply(
    body: Sequence,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Sequence,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsResourceTypeSequence = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsResourceTypeSequence]
  }
}

