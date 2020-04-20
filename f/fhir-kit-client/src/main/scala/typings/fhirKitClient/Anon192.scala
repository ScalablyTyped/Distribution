package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.SearchParameter
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon192 extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: SearchParameter
  var version: String
}

object Anon192 {
  @scala.inline
  def apply(
    id: String,
    resourceType: SearchParameter,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon192 = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon192]
  }
}

