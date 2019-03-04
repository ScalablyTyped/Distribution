package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MethodType extends js.Object {
  var method: java.lang.String
  var `type`: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.NotificationType
}

object Anon_MethodType {
  @scala.inline
  def apply(method: java.lang.String, `type`: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.NotificationType): Anon_MethodType = {
    val __obj = js.Dynamic.literal(method = method)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_MethodType]
  }
}

