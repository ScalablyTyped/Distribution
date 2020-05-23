package typings.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUrl extends js.Object {
  var baseUrl: String
  var customHeaders: js.UndefOr[typings.request.mod.Headers] = js.undefined
}

object BaseUrl {
  @scala.inline
  def apply(baseUrl: String, customHeaders: typings.request.mod.Headers = null): BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
}

