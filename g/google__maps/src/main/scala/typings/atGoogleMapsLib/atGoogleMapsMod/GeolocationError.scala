package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var error: atGoogleMapsLib.Anon_Code
}

object GeolocationError {
  @scala.inline
  def apply(error: atGoogleMapsLib.Anon_Code): GeolocationError = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[GeolocationError]
  }
}

