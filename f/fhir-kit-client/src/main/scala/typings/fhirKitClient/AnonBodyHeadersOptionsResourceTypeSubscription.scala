package typings.fhirKitClient

import typings.fhir.fhir.Subscription
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyHeadersOptionsResourceTypeSubscription extends js.Object {
  var body: Subscription
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Subscription
}

object AnonBodyHeadersOptionsResourceTypeSubscription {
  @scala.inline
  def apply(
    body: Subscription,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Subscription,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyHeadersOptionsResourceTypeSubscription = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyHeadersOptionsResourceTypeSubscription]
  }
}

