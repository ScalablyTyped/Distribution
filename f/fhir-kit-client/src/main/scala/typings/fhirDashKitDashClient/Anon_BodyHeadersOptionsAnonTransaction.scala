package typings.fhirDashKitDashClient

import typings.fhir.fhir.Bundle
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsAnonTransaction extends js.Object {
  var body: Bundle with Anon_Transaction
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
}

object Anon_BodyHeadersOptionsAnonTransaction {
  @scala.inline
  def apply(body: Bundle with Anon_Transaction, headers: Headers = null, options: Options = null): Anon_BodyHeadersOptionsAnonTransaction = {
    val __obj = js.Dynamic.literal(body = body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsAnonTransaction]
  }
}

