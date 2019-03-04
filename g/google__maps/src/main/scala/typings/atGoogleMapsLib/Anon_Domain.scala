package typings
package atGoogleMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var domain: java.lang.String
  var message: java.lang.String
  var reason: atGoogleMapsLib.atGoogleMapsMod.GeolocationErrorReason
}

object Anon_Domain {
  @scala.inline
  def apply(
    domain: java.lang.String,
    message: java.lang.String,
    reason: atGoogleMapsLib.atGoogleMapsMod.GeolocationErrorReason
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal(domain = domain, message = message, reason = reason)
  
    __obj.asInstanceOf[Anon_Domain]
  }
}

