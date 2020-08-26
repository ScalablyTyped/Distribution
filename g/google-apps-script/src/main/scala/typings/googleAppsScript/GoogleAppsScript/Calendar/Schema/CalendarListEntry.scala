package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListEntry extends js.Object {
  var accessRole: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var colorId: js.UndefOr[String] = js.native
  var conferenceProperties: js.UndefOr[ConferenceProperties] = js.native
  var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.native
  var deleted: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var foregroundColor: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var notificationSettings: js.UndefOr[CalendarListEntryNotificationSettings] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var summary: js.UndefOr[String] = js.native
  var summaryOverride: js.UndefOr[String] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object CalendarListEntry {
  @scala.inline
  def apply(): CalendarListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarListEntry]
  }
  @scala.inline
  implicit class CalendarListEntryOps[Self <: CalendarListEntry] (val x: Self) extends AnyVal {
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
    def setAccessRole(value: String): Self = this.set("accessRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessRole: Self = this.set("accessRole", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColorId(value: String): Self = this.set("colorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorId: Self = this.set("colorId", js.undefined)
    @scala.inline
    def setConferenceProperties(value: ConferenceProperties): Self = this.set("conferenceProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConferenceProperties: Self = this.set("conferenceProperties", js.undefined)
    @scala.inline
    def setDefaultRemindersVarargs(value: EventReminder*): Self = this.set("defaultReminders", js.Array(value :_*))
    @scala.inline
    def setDefaultReminders(value: js.Array[EventReminder]): Self = this.set("defaultReminders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultReminders: Self = this.set("defaultReminders", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNotificationSettings(value: CalendarListEntryNotificationSettings): Self = this.set("notificationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationSettings: Self = this.set("notificationSettings", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setSummaryOverride(value: String): Self = this.set("summaryOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryOverride: Self = this.set("summaryOverride", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

