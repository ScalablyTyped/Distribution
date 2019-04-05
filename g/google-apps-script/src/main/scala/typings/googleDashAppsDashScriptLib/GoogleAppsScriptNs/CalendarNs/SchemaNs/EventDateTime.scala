package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDateTime extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var dateTime: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object EventDateTime {
  @scala.inline
  def apply(
    date: java.lang.String = null,
    dateTime: java.lang.String = null,
    timeZone: java.lang.String = null
  ): EventDateTime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[EventDateTime]
  }
}

