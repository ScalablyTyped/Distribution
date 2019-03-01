package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.ScopeType
  var value: java.lang.String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.ScopeType, value: java.lang.String): Anon_Type = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Type]
  }
}

