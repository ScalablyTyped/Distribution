package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.ChargeItem
import typings.jsonPatch.mod.OpPatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPatchArrayOptionsOptionsResourceType extends js.Object {
  var JSONPatch: js.Array[OpPatch]
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: ChargeItem
}

object JSONPatchArrayOptionsOptionsResourceType {
  @scala.inline
  def apply(
    JSONPatch: js.Array[OpPatch],
    id: String,
    resourceType: ChargeItem,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): JSONPatchArrayOptionsOptionsResourceType = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPatchArrayOptionsOptionsResourceType]
  }
}

