package typings.fhirKitClient.anon

import typings.fhir.fhir.ClinicalImpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyClinicalImpressionHeadersHeaders extends js.Object {
  var body: ClinicalImpression
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ClinicalImpression
}

object BodyClinicalImpressionHeadersHeaders {
  @scala.inline
  def apply(
    body: ClinicalImpression,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ClinicalImpression,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): BodyClinicalImpressionHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyClinicalImpressionHeadersHeaders]
  }
}

