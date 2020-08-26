package typings.fusioncharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventObject extends js.Object {
  var cancelled: Boolean = js.native
  var detached: Boolean = js.native
  var eventId: Double = js.native
  var prevented: Boolean = js.native
  var sender: FusionCharts = js.native
  var `type`: String = js.native
  def detachHandler(): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object EventObject {
  @scala.inline
  def apply(
    cancelled: Boolean,
    detachHandler: () => Unit,
    detached: Boolean,
    eventId: Double,
    preventDefault: () => Unit,
    prevented: Boolean,
    sender: FusionCharts,
    stopPropagation: () => Unit,
    `type`: String
  ): EventObject = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], detachHandler = js.Any.fromFunction0(detachHandler), detached = detached.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), prevented = prevented.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  @scala.inline
  implicit class EventObjectOps[Self <: EventObject] (val x: Self) extends AnyVal {
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
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetachHandler(value: () => Unit): Self = this.set("detachHandler", js.Any.fromFunction0(value))
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventId(value: Double): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setPrevented(value: Boolean): Self = this.set("prevented", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: FusionCharts): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

