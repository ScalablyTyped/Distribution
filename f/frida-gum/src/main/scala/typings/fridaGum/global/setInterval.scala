package typings.fridaGum.global

import typings.fridaGum.IntervalId
import typings.fridaGum.ScheduledCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setInterval")
@js.native
object setInterval extends js.Object {
  /**
    * Calls `func` every `delay` milliseconds, optionally passing it the provided params.
    * Returns an id that can be passed to clearInterval() to cancel it.
    */
  def apply(func: ScheduledCallback, delay: Double, params: js.Any*): IntervalId = js.native
}

