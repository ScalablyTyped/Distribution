package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLng extends js.Object {
  /** The latitude in degrees. It must be in the range [-90.0, +90.0]. */
  var latitude: js.UndefOr[Double] = js.native
  /** The longitude in degrees. It must be in the range [-180.0, +180.0]. */
  var longitude: js.UndefOr[Double] = js.native
}

object LatLng {
  @scala.inline
  def apply(): LatLng = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatLng]
  }
  @scala.inline
  implicit class LatLngOps[Self <: LatLng] (val x: Self) extends AnyVal {
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
  }
  
}

