package typings.atGoogleMaps.atGoogleMapsMod

import typings.atGoogleMaps.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var error: Anon_Code
}

object GeolocationError {
  @scala.inline
  def apply(error: Anon_Code): GeolocationError = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[GeolocationError]
  }
}

