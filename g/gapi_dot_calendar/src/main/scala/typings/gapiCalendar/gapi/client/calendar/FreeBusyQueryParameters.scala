package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusyQueryParameters extends js.Object {
  var calendarExpansionMax: js.UndefOr[integer] = js.native
  var groupExpansionMax: js.UndefOr[integer] = js.native
  var items: js.Array[Id] = js.native
  var timeMax: datetime = js.native
  var timeMin: datetime = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object FreeBusyQueryParameters {
  @scala.inline
  def apply(items: js.Array[Id], timeMax: datetime, timeMin: datetime): FreeBusyQueryParameters = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyQueryParameters]
  }
  @scala.inline
  implicit class FreeBusyQueryParametersOps[Self <: FreeBusyQueryParameters] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Id*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Id]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeMax(value: datetime): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeMin(value: datetime): Self = this.set("timeMin", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalendarExpansionMax(value: integer): Self = this.set("calendarExpansionMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarExpansionMax: Self = this.set("calendarExpansionMax", js.undefined)
    @scala.inline
    def setGroupExpansionMax(value: integer): Self = this.set("groupExpansionMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupExpansionMax: Self = this.set("groupExpansionMax", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

