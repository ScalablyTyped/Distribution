package typings.fhirKitClient.anon

import typings.fhir.fhir.Encounter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyEncounter extends js.Object {
  var body: Encounter
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Encounter
}

object BodyEncounter {
  @scala.inline
  def apply(
    body: Encounter,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.Encounter,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyEncounter = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyEncounter]
  }
}

