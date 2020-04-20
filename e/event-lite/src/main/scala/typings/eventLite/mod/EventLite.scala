package typings.eventLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLite extends js.Object {
  def emit(event: String, args: js.Any*): Boolean
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
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
}

