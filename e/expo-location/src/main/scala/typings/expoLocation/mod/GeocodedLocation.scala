package typings.expoLocation.mod

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
  def apply(
    latitude: Double,
    longitude: Double,
    accuracy: js.UndefOr[Double] = js.undefined,
    altitude: js.UndefOr[Double] = js.undefined
  ): GeocodedLocation = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodedLocation]
  }
}

