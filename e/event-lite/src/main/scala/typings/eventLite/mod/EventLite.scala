package typings.eventLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventLite extends js.Object {
  def emit(event: String, args: js.Any*): Boolean = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
}

object EventLite {
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => Boolean,
    off: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite,
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite,
    once: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite
  ): EventLite = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[EventLite]
  }
  @scala.inline
  implicit class EventLiteOps[Self <: EventLite] (val x: Self) extends AnyVal {
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
    def setEmit(value: (String, /* repeated */ js.Any) => Boolean): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def setOff(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOnce(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => EventLite): Self = this.set("once", js.Any.fromFunction2(value))
  }
  
}

