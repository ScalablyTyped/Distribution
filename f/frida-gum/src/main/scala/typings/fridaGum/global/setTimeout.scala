package typings.fridaGum.global

import typings.fridaGum.ScheduledCallback
import typings.fridaGum.TimeoutId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("setTimeout")
@js.native
object setTimeout extends js.Object {
  
  def apply(func: ScheduledCallback, delay: js.UndefOr[scala.Nothing], params: js.Any*): TimeoutId = js.native
  /**
    * Calls `func` after `delay` milliseconds, or if omitted: as soon as Frida's
    * JavaScript thread is idle. Any additional `params` are passed along.
    *
    * Returns an id that can be passed to `clearTimeout()` to cancel it.
    */
  def apply(func: ScheduledCallback, delay: Double, params: js.Any*): TimeoutId = js.native
}
