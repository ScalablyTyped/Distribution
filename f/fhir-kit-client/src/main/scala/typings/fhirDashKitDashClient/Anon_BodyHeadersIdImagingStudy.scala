package typings.fhirDashKitDashClient

import typings.fhir.fhir.ImagingStudy
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdImagingStudy extends js.Object {
  var body: ImagingStudy
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImagingStudy
}

object Anon_BodyHeadersIdImagingStudy {
  @scala.inline
  def apply(
    body: ImagingStudy,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImagingStudy,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdImagingStudy = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdImagingStudy]
  }
}

