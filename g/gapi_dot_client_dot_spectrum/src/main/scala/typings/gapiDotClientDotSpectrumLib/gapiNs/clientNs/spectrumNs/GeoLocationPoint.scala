package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocationPoint extends js.Object {
  /**
    * A required floating-point number that expresses the latitude in degrees using the WGS84 datum. For details on this encoding, see the National Imagery
    * and Mapping Agency's Technical Report TR8350.2.
    */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * A required floating-point number that expresses the longitude in degrees using the WGS84 datum. For details on this encoding, see the National Imagery
    * and Mapping Agency's Technical Report TR8350.2.
    */
  var longitude: js.UndefOr[scala.Double] = js.undefined
}

object GeoLocationPoint {
  @scala.inline
  def apply(latitude: scala.Int | scala.Double = null, longitude: scala.Int | scala.Double = null): GeoLocationPoint = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocationPoint]
  }
}

