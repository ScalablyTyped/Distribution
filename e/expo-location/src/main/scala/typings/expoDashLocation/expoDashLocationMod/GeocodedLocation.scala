package typings.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodedLocation extends js.Object {
  var accuracy: js.UndefOr[Double] = js.undefined
  var altitude: js.UndefOr[Double] = js.undefined
  var latitude: Double
  var longitude: Double
}

object GeocodedLocation {
  @scala.inline
  def apply(latitude: Double, longitude: Double, accuracy: Int | Double = null, altitude: Int | Double = null): GeocodedLocation = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodedLocation]
  }
}

