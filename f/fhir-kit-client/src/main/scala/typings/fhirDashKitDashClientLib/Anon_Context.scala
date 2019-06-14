package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[fhirLib.fhirNs.Bundle | fhirLib.fhirNs.DomainResource] = js.undefined
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var reference: java.lang.String
}

object Anon_Context {
  @scala.inline
  def apply(
    reference: java.lang.String,
    context: fhirLib.fhirNs.Bundle | fhirLib.fhirNs.DomainResource = null,
    options: requestLib.requestMod.Options = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(reference = reference)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

