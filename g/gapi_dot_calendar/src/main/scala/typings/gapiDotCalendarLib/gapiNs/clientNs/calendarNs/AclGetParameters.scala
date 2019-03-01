package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclGetParameters extends js.Object {
  var calendarId: java.lang.String
  var ruleId: java.lang.String
}

object AclGetParameters {
  @scala.inline
  def apply(calendarId: java.lang.String, ruleId: java.lang.String): AclGetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calendarId")(calendarId)
    __obj.updateDynamic("ruleId")(ruleId)
    __obj.asInstanceOf[AclGetParameters]
  }
}

