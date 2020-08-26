package typings.freedom.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandler extends js.Object {
  // The |off| function removes the event event handling function |f| from
  // both |on| and the |once| event handling.
  def off(t: String, f: js.Function): Unit = js.native
  // Adds |f| as an event handler for all subsiquent events of type |t|.
  def on(t: String, f: js.Function): Unit = js.native
  // Adds |f| as an event handler for only the next event of type |t|.
  def once(t: String, f: js.Function): Unit = js.native
}

object EventHandler {
  @scala.inline
  def apply(
    off: (String, js.Function) => Unit,
    on: (String, js.Function) => Unit,
    once: (String, js.Function) => Unit
  ): EventHandler = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[EventHandler]
  }
  @scala.inline
  implicit class EventHandlerOps[Self <: EventHandler] (val x: Self) extends AnyVal {
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
    def setOff(value: (String, js.Function) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, js.Function) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOnce(value: (String, js.Function) => Unit): Self = this.set("once", js.Any.fromFunction2(value))
  }
  
}

