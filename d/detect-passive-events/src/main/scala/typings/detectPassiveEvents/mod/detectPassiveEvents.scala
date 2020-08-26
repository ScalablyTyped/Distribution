package typings.detectPassiveEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detectPassiveEvents extends js.Object {
  var hasSupport: Boolean = js.native
  def update(): Unit = js.native
}

object detectPassiveEvents {
  @scala.inline
  def apply(hasSupport: Boolean, update: () => Unit): detectPassiveEvents = {
    val __obj = js.Dynamic.literal(hasSupport = hasSupport.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectPassiveEvents]
  }
  @scala.inline
  implicit class detectPassiveEventsOps[Self <: detectPassiveEvents] (val x: Self) extends AnyVal {
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
    def setHasSupport(value: Boolean): Self = this.set("hasSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

