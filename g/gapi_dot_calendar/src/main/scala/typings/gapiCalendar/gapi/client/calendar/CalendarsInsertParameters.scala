package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarsInsertParameters extends js.Object {
  var description: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  // Calendars resource
  // Required Properties
  var summary: String = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object CalendarsInsertParameters {
  @scala.inline
  def apply(summary: String): CalendarsInsertParameters = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsInsertParameters]
  }
  @scala.inline
  implicit class CalendarsInsertParametersOps[Self <: CalendarsInsertParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

