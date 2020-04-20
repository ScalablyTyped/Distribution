package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var lat: Double
  var lng: Double
  var weight: js.UndefOr[Double] = js.undefined
}

object Position {
  @scala.inline
  def apply(lat: Double, lng: Double, weight: Int | Double = null): Position = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

