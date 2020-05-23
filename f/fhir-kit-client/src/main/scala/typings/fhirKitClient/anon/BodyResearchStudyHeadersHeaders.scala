package typings.fhirKitClient.anon

import typings.fhir.fhir.ResearchStudy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyResearchStudyHeadersHeaders extends js.Object {
  var body: ResearchStudy
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ResearchStudy
}

object BodyResearchStudyHeadersHeaders {
  @scala.inline
  def apply(
    body: ResearchStudy,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ResearchStudy,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyResearchStudyHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyResearchStudyHeadersHeaders]
  }
}

