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
    emit: (java.lang.String, /* repeated */ js.Any) => scala.Boolean,
    off: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Boolean,
    on: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Boolean,
    pub: (java.lang.String, /* repeated */ js.Any) => scala.Boolean,
    publish: (java.lang.String, /* repeated */ js.Any) => scala.Boolean,
    sub: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Boolean,
    subscribe: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Boolean,
    trigger: (java.lang.String, /* repeated */ js.Any) => scala.Boolean,
    unsub: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Boolean,
    unsubscribe: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Boolean
  ): FrameBus = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), pub = js.Any.fromFunction2(pub), publish = js.Any.fromFunction2(publish), sub = js.Any.fromFunction2(sub), subscribe = js.Any.fromFunction2(subscribe), trigger = js.Any.fromFunction2(trigger), unsub = js.Any.fromFunction2(unsub), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[FrameBus]
  }
}

