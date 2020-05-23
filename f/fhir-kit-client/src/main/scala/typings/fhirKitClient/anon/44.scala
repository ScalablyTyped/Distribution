package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `44` extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: List
}

object `44` {
  @scala.inline
  def apply(
    id: String,
    resourceType: List,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): `44` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`44`]
  }
}

