package typings.fhirKitClient.anon

import typings.fhir.fhir.ConceptMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyConceptMapHeadersHeaders extends js.Object {
  var body: ConceptMap
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ConceptMap
}

object BodyConceptMapHeadersHeaders {
  @scala.inline
  def apply(
    body: ConceptMap,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ConceptMap,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyConceptMapHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyConceptMapHeadersHeaders]
  }
}

