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
    emit: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Boolean],
    off: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit], EventLite],
    on: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit], EventLite],
    once: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit], EventLite]
  ): EventLite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("once")(once)
    __obj.asInstanceOf[EventLite]
  }
}

