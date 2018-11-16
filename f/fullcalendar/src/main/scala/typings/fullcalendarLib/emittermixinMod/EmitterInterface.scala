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

