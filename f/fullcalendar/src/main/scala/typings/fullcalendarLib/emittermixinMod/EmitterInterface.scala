package typings
package fullcalendarLib.emittermixinMod

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
    hasHandlers: js.Function1[js.Any, js.Any],
    off: js.Function2[js.Any, js.Any, js.Any],
    on: js.Function2[js.Any, js.Any, js.Any],
    one: js.Function2[js.Any, js.Any, js.Any],
    trigger: js.Function2[js.Any, /* repeated */ js.Any, js.Any],
    triggerWith: js.Function3[js.Any, js.Any, js.Any, js.Any]
  ): EmitterInterface = {
    val __obj = js.Dynamic.literal(hasHandlers = hasHandlers, off = off, on = on, one = one, trigger = trigger, triggerWith = triggerWith)
  
    __obj.asInstanceOf[EmitterInterface]
  }
}

