package typings.googleMaps.mod

import typings.googleMaps.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationError extends js.Object {
  var error: Code = js.native
}

object GeolocationError {
  @scala.inline
  def apply(error: Code): GeolocationError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationError]
  }
  @scala.inline
  implicit class GeolocationErrorOps[Self <: GeolocationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: Code): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

