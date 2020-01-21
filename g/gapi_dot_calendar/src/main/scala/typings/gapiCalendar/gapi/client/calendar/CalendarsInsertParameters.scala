package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsInsertParameters extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  // Calendars resource
  // Required Properties
  var summary: String
  var timeZone: js.UndefOr[String] = js.undefined
}

object CalendarsInsertParameters {
  @scala.inline
  def apply(summary: String, description: String = null, location: String = null, timeZone: String = null): CalendarsInsertParameters = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsInsertParameters]
  }
}

