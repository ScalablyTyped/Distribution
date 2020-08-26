package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocationPoint extends js.Object {
  /**
    * A required floating-point number that expresses the latitude in degrees using the WGS84 datum. For details on this encoding, see the National Imagery
    * and Mapping Agency's Technical Report TR8350.2.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * A required floating-point number that expresses the longitude in degrees using the WGS84 datum. For details on this encoding, see the National Imagery
    * and Mapping Agency's Technical Report TR8350.2.
    */
  var longitude: js.UndefOr[Double] = js.native
}

object GeoLocationPoint {
  @scala.inline
  def apply(): GeoLocationPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationPoint]
  }
  @scala.inline
  implicit class GeoLocationPointOps[Self <: GeoLocationPoint] (val x: Self) extends AnyVal {
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

