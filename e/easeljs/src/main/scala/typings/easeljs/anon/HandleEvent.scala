package typings.easeljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleEvent extends js.Object {
  def handleEvent(eventObj: js.Object): Boolean = js.native
}

object HandleEvent {
  @scala.inline
  def apply(handleEvent: js.Object => Boolean): HandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[HandleEvent]
  }
  @scala.inline
  implicit class HandleEventOps[Self <: HandleEvent] (val x: Self) extends AnyVal {
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
    def setHandleEvent(value: js.Object => Boolean): Self = this.set("handleEvent", js.Any.fromFunction1(value))
  }
  
}

