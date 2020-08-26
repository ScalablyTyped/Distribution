package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocationEllipse extends js.Object {
  /** A required geo-spatial point representing the center of the ellipse. */
  var center: js.UndefOr[GeoLocationPoint] = js.native
  /**
    * A floating-point number that expresses the orientation of the ellipse, representing the rotation, in degrees, of the semi-major axis from North towards
    * the East. For example, when the uncertainty is greatest along the North-South direction, orientation is 0 degrees; conversely, if the uncertainty is
    * greatest along the East-West direction, orientation is 90 degrees. When orientation is not present, the orientation is assumed to be 0.
    */
  var orientation: js.UndefOr[Double] = js.native
  /**
    * A floating-point number that expresses the location uncertainty along the major axis of the ellipse. May be required by the regulatory domain. When the
    * uncertainty is optional, the default value is 0.
    */
  var semiMajorAxis: js.UndefOr[Double] = js.native
  /**
    * A floating-point number that expresses the location uncertainty along the minor axis of the ellipse. May be required by the regulatory domain. When the
    * uncertainty is optional, the default value is 0.
    */
  var semiMinorAxis: js.UndefOr[Double] = js.native
}

object GeoLocationEllipse {
  @scala.inline
  def apply(): GeoLocationEllipse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationEllipse]
  }
  @scala.inline
  implicit class GeoLocationEllipseOps[Self <: GeoLocationEllipse] (val x: Self) extends AnyVal {
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
    def setCenter(value: GeoLocationPoint): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setSemiMajorAxis(value: Double): Self = this.set("semiMajorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemiMajorAxis: Self = this.set("semiMajorAxis", js.undefined)
    @scala.inline
    def setSemiMinorAxis(value: Double): Self = this.set("semiMinorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemiMinorAxis: Self = this.set("semiMinorAxis", js.undefined)
  }
  
}

