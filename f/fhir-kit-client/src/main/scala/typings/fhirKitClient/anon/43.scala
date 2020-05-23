package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.Linkage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `43` extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: Linkage
}

object `43` {
  @scala.inline
  def apply(
    id: String,
    resourceType: Linkage,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): `43` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`43`]
  }
}

