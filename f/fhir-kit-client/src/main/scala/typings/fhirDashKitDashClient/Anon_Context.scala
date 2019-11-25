package typings.fhirDashKitDashClient

import typings.fhir.fhir.Bundle
import typings.fhir.fhir.DomainResource
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[Bundle | DomainResource] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var reference: String
}

object Anon_Context {
  @scala.inline
  def apply(reference: String, context: Bundle | DomainResource = null, options: Options = null): Anon_Context = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

