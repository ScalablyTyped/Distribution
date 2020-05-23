package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.ClinicalImpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersHeadersIdStringOptionsOptionsResourceType extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: ClinicalImpression
}

object HeadersHeadersIdStringOptionsOptionsResourceType {
  @scala.inline
  def apply(
    id: String,
    resourceType: ClinicalImpression,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): HeadersHeadersIdStringOptionsOptionsResourceType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersHeadersIdStringOptionsOptionsResourceType]
  }
}

