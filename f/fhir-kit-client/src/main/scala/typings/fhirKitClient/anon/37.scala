package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.ImagingManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `37` extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: ImagingManifest
}

object `37` {
  @scala.inline
  def apply(
    id: String,
    resourceType: ImagingManifest,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): `37` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`37`]
  }
}

