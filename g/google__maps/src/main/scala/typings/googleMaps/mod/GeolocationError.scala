package typings.googleMaps.mod

import typings.googleMaps.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var error: AnonCode
}

object GeolocationError {
  @scala.inline
  def apply(error: AnonCode): GeolocationError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationError]
  }
}

