package typings.detectTouchEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detectTouchEvents extends js.Object {
  var hasApi: Boolean = js.native
  var maxTouchPoints: Double = js.native
  def update(): Unit = js.native
}

object detectTouchEvents {
  @scala.inline
  def apply(hasApi: Boolean, maxTouchPoints: Double, update: () => Unit): detectTouchEvents = {
    val __obj = js.Dynamic.literal(hasApi = hasApi.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectTouchEvents]
  }
  @scala.inline
  implicit class detectTouchEventsOps[Self <: detectTouchEvents] (val x: Self) extends AnyVal {
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
    def setHasApi(value: Boolean): Self = this.set("hasApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTouchPoints(value: Double): Self = this.set("maxTouchPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

