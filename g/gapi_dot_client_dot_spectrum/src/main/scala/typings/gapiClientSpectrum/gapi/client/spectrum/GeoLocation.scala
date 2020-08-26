package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocation extends js.Object {
  /**
    * The location confidence level, as an integer percentage, may be required, depending on the regulatory domain. When the parameter is optional and not
    * provided, its value is assumed to be 95. Valid values range from 0 to 99, since, in practice, 100-percent confidence is not achievable. The confidence
    * value is meaningful only when geolocation refers to a point with uncertainty.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * If present, indicates that the geolocation represents a point. Paradoxically, a point is parameterized using an ellipse, where the center represents
    * the location of the point and the distances along the major and minor axes represent the uncertainty. The uncertainty values may be required, depending
    * on the regulatory domain.
    */
  var point: js.UndefOr[GeoLocationEllipse] = js.native
  /** If present, indicates that the geolocation represents a region. Database support for regions is optional. */
  var region: js.UndefOr[GeoLocationPolygon] = js.native
}

object GeoLocation {
  @scala.inline
  def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  @scala.inline
  implicit class GeoLocationOps[Self <: GeoLocation] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setPoint(value: GeoLocationEllipse): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setRegion(value: GeoLocationPolygon): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

