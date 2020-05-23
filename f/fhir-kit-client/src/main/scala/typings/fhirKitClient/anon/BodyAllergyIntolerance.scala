package typings.fhirKitClient.anon

import typings.fhir.fhir.AllergyIntolerance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyAllergyIntolerance extends js.Object {
  var body: AllergyIntolerance
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.AllergyIntolerance
}

object BodyAllergyIntolerance {
  @scala.inline
  def apply(
    body: AllergyIntolerance,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.AllergyIntolerance,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyAllergyIntolerance = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyAllergyIntolerance]
  }
}

