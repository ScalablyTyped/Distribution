package typings.fhirDashKitDashClient

import typings.fhir.fhir.AllergyIntolerance
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllergyIntoleranceBody extends js.Object {
  var body: AllergyIntolerance
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.AllergyIntolerance
}

object Anon_AllergyIntoleranceBody {
  @scala.inline
  def apply(
    body: AllergyIntolerance,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.AllergyIntolerance,
    headers: Headers = null,
    options: Options = null
  ): Anon_AllergyIntoleranceBody = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllergyIntoleranceBody]
  }
}

