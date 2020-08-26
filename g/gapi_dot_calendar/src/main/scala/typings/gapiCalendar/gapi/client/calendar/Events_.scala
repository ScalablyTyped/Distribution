package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignevents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events_ extends js.Object {
  // The user's access role for this calendar. Read-only. Possible values are:
  var accessRole: AccessRole = js.native
  var defaultReminders: js.Array[Method] = js.native
  var description: String = js.native
  var etag: typings.gapiCalendar.gapi.client.calendar.etag = js.native
  var items: js.Array[Event] = js.native
  var kind: calendarNumbersignevents = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var nextSyncToken: js.UndefOr[String] = js.native
  var summary: String = js.native
  var timeZone: String = js.native
  var updated: datetime = js.native
}

object Events_ {
  @scala.inline
  def apply(
    accessRole: AccessRole,
    defaultReminders: js.Array[Method],
    description: String,
    etag: etag,
    items: js.Array[Event],
    kind: calendarNumbersignevents,
    summary: String,
    timeZone: String,
    updated: datetime
  ): Events_ = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], defaultReminders = defaultReminders.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events_]
  }
  @scala.inline
  implicit class Events_Ops[Self <: Events_] (val x: Self) extends AnyVal {
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
    def setAccessRole(value: AccessRole): Self = this.set("accessRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRemindersVarargs(value: Method*): Self = this.set("defaultReminders", js.Array(value :_*))
    @scala.inline
    def setDefaultReminders(value: js.Array[Method]): Self = this.set("defaultReminders", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: etag): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Event*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Event]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: calendarNumbersignevents): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: datetime): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setNextSyncToken(value: String): Self = this.set("nextSyncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSyncToken: Self = this.set("nextSyncToken", js.undefined)
  }
  
}

