package typings.fhirDashKitDashClient

import typings.fhir.fhirNs.ImagingManifest
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersId extends js.Object {
  var body: ImagingManifest
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImagingManifest
}

object Anon_BodyHeadersId {
  @scala.inline
  def apply(
    body: ImagingManifest,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ImagingManifest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersId = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersId]
  }
}

