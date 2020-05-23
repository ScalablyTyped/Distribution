package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.Sequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `85` extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: Sequence
}

object `85` {
  @scala.inline
  def apply(
    id: String,
    resourceType: Sequence,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): `85` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[`85`]
  }
}

