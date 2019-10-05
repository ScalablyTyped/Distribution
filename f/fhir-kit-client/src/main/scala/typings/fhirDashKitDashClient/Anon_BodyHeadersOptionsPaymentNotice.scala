package typings.fhirDashKitDashClient

import typings.fhir.fhir.PaymentNotice
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsPaymentNotice extends js.Object {
  var body: PaymentNotice
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.PaymentNotice
}

object Anon_BodyHeadersOptionsPaymentNotice {
  @scala.inline
  def apply(
    body: PaymentNotice,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.PaymentNotice,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsPaymentNotice = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsPaymentNotice]
  }
}

