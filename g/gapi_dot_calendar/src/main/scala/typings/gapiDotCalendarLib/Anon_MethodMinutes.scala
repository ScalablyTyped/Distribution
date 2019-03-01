package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MethodMinutes extends js.Object {
  var method: java.lang.String
  var minutes: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.integer
}

object Anon_MethodMinutes {
  @scala.inline
  def apply(method: java.lang.String, minutes: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.integer): Anon_MethodMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("minutes")(minutes)
    __obj.asInstanceOf[Anon_MethodMinutes]
  }
}

