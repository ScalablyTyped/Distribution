package typings.fhirKitClient

import typings.fhir.fhir.AllergyIntolerance
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllergyIntoleranceBodyHeaders extends js.Object {
  var body: AllergyIntolerance
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.AllergyIntolerance
}

object AnonAllergyIntoleranceBodyHeaders {
  @scala.inline
  def apply(
    body: AllergyIntolerance,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.AllergyIntolerance,
    headers: Headers = null,
    options: Options = null
  ): AnonAllergyIntoleranceBodyHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllergyIntoleranceBodyHeaders]
  }
}

