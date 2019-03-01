package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventValue
  extends Point
     with Coords {
  var event: js.Any
}

object ClickEventValue {
  @scala.inline
  def apply(event: js.Any, lat: scala.Double, lng: scala.Double, x: scala.Double, y: scala.Double): ClickEventValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lng")(lng)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ClickEventValue]
  }
}

