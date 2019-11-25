package typings.atGoogleMaps

import typings.atGoogleMaps.atGoogleMapsMod.GeolocationErrorReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var domain: String
  var message: String
  var reason: GeolocationErrorReason
}

object Anon_Domain {
  @scala.inline
  def apply(domain: String, message: String, reason: GeolocationErrorReason): Anon_Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Domain]
  }
}

