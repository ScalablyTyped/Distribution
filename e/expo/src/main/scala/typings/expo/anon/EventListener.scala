package typings.expo.anon

import typings.expo.updatesMod.UpdateEvent
import typings.expo.updatesMod.UpdateEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListener extends js.Object {
  var eventListener: js.UndefOr[UpdateEventListener] = js.native
}

object EventListener {
  @scala.inline
  def apply(): EventListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventListener]
  }
  @scala.inline
  implicit class EventListenerOps[Self <: EventListener] (val x: Self) extends AnyVal {
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
    def setEventListener(value: /* event */ UpdateEvent => Unit): Self = this.set("eventListener", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEventListener: Self = this.set("eventListener", js.undefined)
  }
  
}

