package typings.fhirDashKitDashClient

import typings.request.requestMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: String
  var customHeaders: js.UndefOr[Headers] = js.undefined
}

object Anon_BaseUrl {
  @scala.inline
  def apply(baseUrl: String, customHeaders: Headers = null): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

