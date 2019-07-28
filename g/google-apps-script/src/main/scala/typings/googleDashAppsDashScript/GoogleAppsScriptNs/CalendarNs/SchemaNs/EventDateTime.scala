package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDateTime extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var dateTime: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object EventDateTime {
  @scala.inline
  def apply(date: String = null, dateTime: String = null, timeZone: String = null): EventDateTime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[EventDateTime]
  }
}

