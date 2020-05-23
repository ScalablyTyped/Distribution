package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.ProcessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `73` extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: ProcessResponse
}

object `73` {
  @scala.inline
  def apply(
    id: String,
    resourceType: ProcessResponse,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): `73` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`73`]
  }
}

