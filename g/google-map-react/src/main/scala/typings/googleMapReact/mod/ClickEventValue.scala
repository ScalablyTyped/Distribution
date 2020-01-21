package typings.googleMapReact.mod

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
  def apply(event: js.Any, lat: Double, lng: Double, x: Double, y: Double): ClickEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClickEventValue]
  }
}

