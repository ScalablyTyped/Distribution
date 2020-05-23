package typings.expoLocation.expoLocationWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinates extends js.Object {
  var accuracy: js.UndefOr[Double] = js.undefined
  var altitude: js.UndefOr[Double] = js.undefined
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  var heading: js.UndefOr[Double] = js.undefined
  var latitude: Double
  var longitude: Double
  var speed: js.UndefOr[Double] = js.undefined
}

object Coordinates {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    accuracy: js.UndefOr[Double] = js.undefined,
    altitude: js.UndefOr[Double] = js.undefined,
    altitudeAccuracy: js.UndefOr[Double] = js.undefined,
    heading: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): Coordinates = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altitudeAccuracy)) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
}

