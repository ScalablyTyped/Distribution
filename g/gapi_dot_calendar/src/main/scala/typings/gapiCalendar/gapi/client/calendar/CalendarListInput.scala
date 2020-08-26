package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.anon.Notifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListInput extends js.Object {
  // Optional Properties
  var backgroundColor: js.UndefOr[String] = js.native
  var colorId: js.UndefOr[String] = js.native
  var defaultReminders: js.UndefOr[js.Array[Method]] = js.native
  var foregroundColor: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  // Required Properties
  var id: String = js.native
  var notificationSettings: js.UndefOr[Notifications] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var summaryOverride: js.UndefOr[String] = js.native
}

object CalendarListInput {
  @scala.inline
  def apply(id: String): CalendarListInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInput]
  }
  @scala.inline
  implicit class CalendarListInputOps[Self <: CalendarListInput] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColorId(value: String): Self = this.set("colorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorId: Self = this.set("colorId", js.undefined)
    @scala.inline
    def setDefaultRemindersVarargs(value: Method*): Self = this.set("defaultReminders", js.Array(value :_*))
    @scala.inline
    def setDefaultReminders(value: js.Array[Method]): Self = this.set("defaultReminders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultReminders: Self = this.set("defaultReminders", js.undefined)
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setNotificationSettings(value: Notifications): Self = this.set("notificationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationSettings: Self = this.set("notificationSettings", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSummaryOverride(value: String): Self = this.set("summaryOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryOverride: Self = this.set("summaryOverride", js.undefined)
  }
  
}

