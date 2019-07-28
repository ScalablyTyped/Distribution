package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Sequence
import typings.jsonDashPatch.jsonDashPatchMod.OpPatch
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdJSONPatchOptionsResourceTypeSequence extends js.Object {
  var JSONPatch: js.Array[OpPatch]
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: Sequence
}

object Anon_HeadersIdJSONPatchOptionsResourceTypeSequence {
  @scala.inline
  def apply(
    JSONPatch: js.Array[OpPatch],
    id: String,
    resourceType: Sequence,
    headers: Headers = null,
    options: Options = null
  ): Anon_HeadersIdJSONPatchOptionsResourceTypeSequence = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdJSONPatchOptionsResourceTypeSequence]
  }
}

