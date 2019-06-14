package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsAnonTransaction extends js.Object {
  var body: fhirLib.fhirNs.Bundle with Anon_Transaction
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
}

object Anon_BodyHeadersOptionsAnonTransaction {
  @scala.inline
  def apply(
    body: fhirLib.fhirNs.Bundle with Anon_Transaction,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_BodyHeadersOptionsAnonTransaction = {
    val __obj = js.Dynamic.literal(body = body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsAnonTransaction]
  }
}

