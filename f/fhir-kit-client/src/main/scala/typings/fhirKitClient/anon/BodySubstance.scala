package typings.fhirKitClient.anon

import typings.fhir.fhir.Substance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySubstance extends js.Object {
  var body: Substance
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Substance
}

object BodySubstance {
  @scala.inline
  def apply(
    body: Substance,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Substance,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodySubstance = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySubstance]
  }
}

