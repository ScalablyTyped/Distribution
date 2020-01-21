package typings.googleMaps

import typings.googleMaps.mod.GeolocationErrorReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
  var domain: String
  var message: String
  var reason: GeolocationErrorReason
}

object AnonDomain {
  @scala.inline
  def apply(domain: String, message: String, reason: GeolocationErrorReason): AnonDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomain]
  }
}

