package typings.fhirDashKitDashClient

import typings.fhir.fhir.ConceptMap
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyConceptMap extends js.Object {
  var body: ConceptMap
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ConceptMap
}

object Anon_BodyConceptMap {
  @scala.inline
  def apply(
    body: ConceptMap,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ConceptMap,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyConceptMap = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyConceptMap]
  }
}

