package typings.fhirKitClient.anon

import typings.fhir.fhir.DomainResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.UndefOr[typings.fhir.fhir.Bundle | DomainResource] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var reference: String
}

object Context {
  @scala.inline
  def apply(
    reference: String,
    context: typings.fhir.fhir.Bundle | DomainResource = null,
    options: typings.request.mod.Options = null
  ): Context = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

