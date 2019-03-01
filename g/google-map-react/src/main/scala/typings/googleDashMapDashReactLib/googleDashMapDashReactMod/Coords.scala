package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coords extends js.Object {
  var lat: scala.Double
  var lng: scala.Double
}

object Coords {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): Coords = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lng")(lng)
    __obj.asInstanceOf[Coords]
  }
}

