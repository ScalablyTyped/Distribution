package typings.fullcalendar.emitterMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterInterface extends js.Object {
  def hasHandlers(`type`: js.Any): js.Any
  def off(types: js.Any, handler: js.Any): js.Any
  def on(types: js.Any, handler: js.Any): js.Any
  def one(types: js.Any, handler: js.Any): js.Any
  def trigger(types: js.Any, args: js.Any*): js.Any
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any
}

object EmitterInterface {
  @scala.inline
  def apply(
    hasHandlers: js.Any => js.Any,
    off: (js.Any, js.Any) => js.Any,
    on: (js.Any, js.Any) => js.Any,
    one: (js.Any, js.Any) => js.Any,
    trigger: (js.Any, /* repeated */ js.Any) => js.Any,
    triggerWith: (js.Any, js.Any, js.Any) => js.Any
  ): EmitterInterface = {
    val __obj = js.Dynamic.literal(hasHandlers = js.Any.fromFunction1(hasHandlers), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), one = js.Any.fromFunction2(one), trigger = js.Any.fromFunction2(trigger), triggerWith = js.Any.fromFunction3(triggerWith))
    __obj.asInstanceOf[EmitterInterface]
  }
}

