package typings.framebus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameBus extends js.Object {
  def emit(event: String, args: js.Any*): Boolean
  def off(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def pub(event: String, args: js.Any*): Boolean
  def publish(event: String, args: js.Any*): Boolean
  def sub(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def subscribe(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def trigger(event: String, args: js.Any*): Boolean
  def unsub(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
  def unsubscribe(event: String, fn: js.Function1[/* repeated */ js.Any, _]): Boolean
}

object FrameBus {
  @scala.inline
  def apply(
    emit: (String, /* repeated */ js.Any) => Boolean,
    off: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    on: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    pub: (String, /* repeated */ js.Any) => Boolean,
    publish: (String, /* repeated */ js.Any) => Boolean,
    sub: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    subscribe: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    trigger: (String, /* repeated */ js.Any) => Boolean,
    unsub: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean,
    unsubscribe: (String, js.Function1[/* repeated */ js.Any, _]) => Boolean
  ): FrameBus = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), pub = js.Any.fromFunction2(pub), publish = js.Any.fromFunction2(publish), sub = js.Any.fromFunction2(sub), subscribe = js.Any.fromFunction2(subscribe), trigger = js.Any.fromFunction2(trigger), unsub = js.Any.fromFunction2(unsub), unsubscribe = js.Any.fromFunction2(unsubscribe))
  
    __obj.asInstanceOf[FrameBus]
  }
}

