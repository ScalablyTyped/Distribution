package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsUpdateParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.native
  var calendarId: String = js.native
  var eventId: String = js.native
  var maxAttendees: js.UndefOr[integer] = js.native
  // Event resource
  var resource: EventInput = js.native
  var sendNotifications: js.UndefOr[Boolean] = js.native
  var supportsAttachments: js.UndefOr[Boolean] = js.native
}

object EventsUpdateParameters {
  @scala.inline
  def apply(calendarId: String, eventId: String, resource: EventInput): EventsUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsUpdateParameters]
  }
  @scala.inline
  implicit class EventsUpdateParametersOps[Self <: EventsUpdateParameters] (val x: Self) extends AnyVal {
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
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: EventInput): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlwaysIncludeEmail(value: Boolean): Self = this.set("alwaysIncludeEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysIncludeEmail: Self = this.set("alwaysIncludeEmail", js.undefined)
    @scala.inline
    def setMaxAttendees(value: integer): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    @scala.inline
    def setSendNotifications(value: Boolean): Self = this.set("sendNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotifications: Self = this.set("sendNotifications", js.undefined)
    @scala.inline
    def setSupportsAttachments(value: Boolean): Self = this.set("supportsAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsAttachments: Self = this.set("supportsAttachments", js.undefined)
  }
  
}

