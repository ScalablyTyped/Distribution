package typings.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttLocaleLabels extends js.Object {
  var confirm_closing: String = js.native
  var confirm_deleting: String = js.native
  var confirm_link_deleting: String = js.native
  var days: String = js.native
  var hours: String = js.native
  var icon_cancel: String = js.native
  var icon_delete: String = js.native
  var icon_details: String = js.native
  var icon_edit: String = js.native
  var icon_save: String = js.native
  var link_end: String = js.native
  var link_from: String = js.native
  var link_start: String = js.native
  var link_to: String = js.native
  var minutes: String = js.native
  var months: String = js.native
  var new_task: String = js.native
  var section_description: String = js.native
  var section_time: String = js.native
  var weeks: String = js.native
  var years: String = js.native
}

object GanttLocaleLabels {
  @scala.inline
  def apply(
    confirm_closing: String,
    confirm_deleting: String,
    confirm_link_deleting: String,
    days: String,
    hours: String,
    icon_cancel: String,
    icon_delete: String,
    icon_details: String,
    icon_edit: String,
    icon_save: String,
    link_end: String,
    link_from: String,
    link_start: String,
    link_to: String,
    minutes: String,
    months: String,
    new_task: String,
    section_description: String,
    section_time: String,
    weeks: String,
    years: String
  ): GanttLocaleLabels = {
    val __obj = js.Dynamic.literal(confirm_closing = confirm_closing.asInstanceOf[js.Any], confirm_deleting = confirm_deleting.asInstanceOf[js.Any], confirm_link_deleting = confirm_link_deleting.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], icon_cancel = icon_cancel.asInstanceOf[js.Any], icon_delete = icon_delete.asInstanceOf[js.Any], icon_details = icon_details.asInstanceOf[js.Any], icon_edit = icon_edit.asInstanceOf[js.Any], icon_save = icon_save.asInstanceOf[js.Any], link_end = link_end.asInstanceOf[js.Any], link_from = link_from.asInstanceOf[js.Any], link_start = link_start.asInstanceOf[js.Any], link_to = link_to.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], new_task = new_task.asInstanceOf[js.Any], section_description = section_description.asInstanceOf[js.Any], section_time = section_time.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttLocaleLabels]
  }
  @scala.inline
  implicit class GanttLocaleLabelsOps[Self <: GanttLocaleLabels] (val x: Self) extends AnyVal {
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
    def setConfirm_closing(value: String): Self = this.set("confirm_closing", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirm_deleting(value: String): Self = this.set("confirm_deleting", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirm_link_deleting(value: String): Self = this.set("confirm_link_deleting", value.asInstanceOf[js.Any])
    @scala.inline
    def setDays(value: String): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours(value: String): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon_cancel(value: String): Self = this.set("icon_cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon_delete(value: String): Self = this.set("icon_delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon_details(value: String): Self = this.set("icon_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon_edit(value: String): Self = this.set("icon_edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon_save(value: String): Self = this.set("icon_save", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink_end(value: String): Self = this.set("link_end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink_from(value: String): Self = this.set("link_from", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink_start(value: String): Self = this.set("link_start", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink_to(value: String): Self = this.set("link_to", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes(value: String): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: String): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setNew_task(value: String): Self = this.set("new_task", value.asInstanceOf[js.Any])
    @scala.inline
    def setSection_description(value: String): Self = this.set("section_description", value.asInstanceOf[js.Any])
    @scala.inline
    def setSection_time(value: String): Self = this.set("section_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeeks(value: String): Self = this.set("weeks", value.asInstanceOf[js.Any])
    @scala.inline
    def setYears(value: String): Self = this.set("years", value.asInstanceOf[js.Any])
  }
  
}

