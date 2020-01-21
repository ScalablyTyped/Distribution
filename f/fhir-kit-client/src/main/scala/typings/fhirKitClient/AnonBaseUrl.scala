package typings.fhirKitClient

import typings.request.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseUrl extends js.Object {
  var baseUrl: String
  var customHeaders: js.UndefOr[Headers] = js.undefined
}

object AnonBaseUrl {
  @scala.inline
  def apply(baseUrl: String, customHeaders: Headers = null): AnonBaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseUrl]
  }
}

