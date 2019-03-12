package typings
package eventDashLiteLib.eventDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLite extends js.Object {
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean
  def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type
}

object EventLite {
  @scala.inline
  def apply(
    emit: (java.lang.String, /* repeated */ js.Any) => scala.Boolean,
    off: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => EventLite,
    on: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => EventLite,
    once: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => EventLite
  ): EventLite = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
  
    __obj.asInstanceOf[EventLite]
  }
}

