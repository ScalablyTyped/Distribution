package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: java.lang.String
  var customHeaders: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
}

object Anon_BaseUrl {
  @scala.inline
  def apply(baseUrl: java.lang.String, customHeaders: requestLib.requestMod.Headers = null): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

