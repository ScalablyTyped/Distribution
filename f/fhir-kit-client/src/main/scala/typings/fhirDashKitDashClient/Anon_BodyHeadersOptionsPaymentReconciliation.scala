package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.PaymentReconciliation
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsPaymentReconciliation extends js.Object {
  var body: PaymentReconciliation
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.PaymentReconciliation
}

object Anon_BodyHeadersOptionsPaymentReconciliation {
  @scala.inline
  def apply(
    body: PaymentReconciliation,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.PaymentReconciliation,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsPaymentReconciliation = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsPaymentReconciliation]
  }
}

