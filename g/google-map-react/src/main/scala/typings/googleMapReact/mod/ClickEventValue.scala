package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickEventValue
  extends Point
     with Coords {
  var event: js.Any = js.native
}

object ClickEventValue {
  @scala.inline
  def apply(event: js.Any, lat: Double, lng: Double, x: Double, y: Double): ClickEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickEventValue]
  }
  @scala.inline
  implicit class ClickEventValueOps[Self <: ClickEventValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

