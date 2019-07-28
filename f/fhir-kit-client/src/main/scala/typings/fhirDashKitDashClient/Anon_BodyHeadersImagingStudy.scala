package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.ImagingStudy
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersImagingStudy extends js.Object {
  var body: ImagingStudy
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImagingStudy
}

object Anon_BodyHeadersImagingStudy {
  @scala.inline
  def apply(
    body: ImagingStudy,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImagingStudy,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersImagingStudy = {
    val __obj = js.Dynamic.literal(body = body, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersImagingStudy]
  }
}

