package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  var resourceType: Account
}

object Id {
  @scala.inline
  def apply(
    id: String,
    resourceType: Account,
    headers: typings.request.mod.Headers = null,
    options: typings.request.mod.Options = null
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

