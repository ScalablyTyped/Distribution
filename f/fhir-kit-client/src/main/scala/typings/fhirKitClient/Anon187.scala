package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.TestScript
import typings.jsonPatch.mod.OpPatch
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon187 extends js.Object {
  var JSONPatch: js.Array[OpPatch]
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: TestScript
}

object Anon187 {
  @scala.inline
  def apply(
    JSONPatch: js.Array[OpPatch],
    id: String,
    resourceType: TestScript,
    headers: Headers = null,
    options: Options = null
  ): Anon187 = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon187]
  }
}

