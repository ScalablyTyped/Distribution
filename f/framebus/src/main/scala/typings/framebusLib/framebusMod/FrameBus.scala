package typings
package framebusLib.framebusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameBus extends js.Object {
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean
  def off(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): scala.Boolean
  def on(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): scala.Boolean
  def pub(event: java.lang.String, args: js.Any*): scala.Boolean
  def publish(event: java.lang.String, args: js.Any*): scala.Boolean
  def sub(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): scala.Boolean
  def subscribe(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): scala.Boolean
  def trigger(event: java.lang.String, args: js.Any*): scala.Boolean
  def unsub(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): scala.Boolean
  def unsubscribe(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): scala.Boolean
}

object FrameBus {
  @scala.inline
  def apply(
    emit: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Boolean],
    off: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, _], scala.Boolean],
    on: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, _], scala.Boolean],
    pub: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Boolean],
    publish: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Boolean],
    sub: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, _], scala.Boolean],
    subscribe: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, _], scala.Boolean],
    trigger: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Boolean],
    unsub: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, _], scala.Boolean],
    unsubscribe: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, _], scala.Boolean]
  ): FrameBus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("pub")(pub)
    __obj.updateDynamic("publish")(publish)
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.updateDynamic("trigger")(trigger)
    __obj.updateDynamic("unsub")(unsub)
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.asInstanceOf[FrameBus]
  }
}

