package typings.googleMaps.anon

import typings.googleMaps.mod.GeolocationErrorReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var domain: String
  var message: String
  var reason: GeolocationErrorReason
}

object Domain {
  @scala.inline
  def apply(domain: String, message: String, reason: GeolocationErrorReason): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}

