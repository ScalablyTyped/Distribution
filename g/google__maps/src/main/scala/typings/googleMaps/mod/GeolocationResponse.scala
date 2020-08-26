package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationResponse extends js.Object {
  /** The accuracy of the estimated location, in meters. This represents the radius of a circle around the given location. */
  var accuracy: Double = js.native
  /** The user's estimated latitude and longitude, in degrees. Contains one `lat` and one `lng` subfield. */
  var location: LatLngLiteral = js.native
}

object GeolocationResponse {
  @scala.inline
  def apply(accuracy: Double, location: LatLngLiteral): GeolocationResponse = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationResponse]
  }
  @scala.inline
  implicit class GeolocationResponseOps[Self <: GeolocationResponse] (val x: Self) extends AnyVal {
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LatLngLiteral): Self = this.set("location", value.asInstanceOf[js.Any])
  }
  
}

