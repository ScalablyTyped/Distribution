package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocation extends js.Object {
  /**
    * The location confidence level, as an integer percentage, may be required, depending on the regulatory domain. When the parameter is optional and not
    * provided, its value is assumed to be 95. Valid values range from 0 to 99, since, in practice, 100-percent confidence is not achievable. The confidence
    * value is meaningful only when geolocation refers to a point with uncertainty.
    */
  var confidence: js.UndefOr[scala.Double] = js.undefined
  /**
    * If present, indicates that the geolocation represents a point. Paradoxically, a point is parameterized using an ellipse, where the center represents
    * the location of the point and the distances along the major and minor axes represent the uncertainty. The uncertainty values may be required, depending
    * on the regulatory domain.
    */
  var point: js.UndefOr[GeoLocationEllipse] = js.undefined
  /** If present, indicates that the geolocation represents a region. Database support for regions is optional. */
  var region: js.UndefOr[GeoLocationPolygon] = js.undefined
}

object GeoLocation {
  @scala.inline
  def apply(
    confidence: scala.Int | scala.Double = null,
    point: GeoLocationEllipse = null,
    region: GeoLocationPolygon = null
  ): GeoLocation = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GeoLocation]
  }
}

