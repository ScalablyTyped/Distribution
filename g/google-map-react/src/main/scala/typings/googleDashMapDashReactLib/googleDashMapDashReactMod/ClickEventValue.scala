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
    val __obj = js.Dynamic.literal(event = event, lat = lat, lng = lng, x = x, y = y)
  
    __obj.asInstanceOf[ClickEventValue]
  }
}

