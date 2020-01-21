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
    accuracy: Int | Double = null,
    altitude: Int | Double = null,
    altitudeAccuracy: Int | Double = null,
    heading: Int | Double = null,
    speed: Int | Double = null
  ): Coordinates = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (altitudeAccuracy != null) __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
}

