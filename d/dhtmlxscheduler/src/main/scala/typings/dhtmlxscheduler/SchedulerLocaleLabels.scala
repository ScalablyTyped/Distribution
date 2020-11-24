package typings.dhtmlxscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerLocaleLabels extends js.Object {
  
  var confirm_closing: String = js.native
  
  var confirm_deleting: String = js.native
  
  var day_tab: String = js.native
  
  var dhx_cal_today_button: String = js.native
  
  var icon_cancel: String = js.native
  
  var icon_delete: String = js.native
  
  var icon_details: String = js.native
  
  var icon_edit: String = js.native
  
  var icon_save: String = js.native
  
  var month_tab: String = js.native
  
  var new_event: String = js.native
  
  var section_description: String = js.native
  
  var section_time: String = js.native
  
  var unit_tab: String = js.native
  
  var week_tab: String = js.native
}
object SchedulerLocaleLabels {
  
  @scala.inline
  def apply(
    confirm_closing: String,
    confirm_deleting: String,
    day_tab: String,
    dhx_cal_today_button: String,
    icon_cancel: String,
    icon_delete: String,
    icon_details: String,
    icon_edit: String,
    icon_save: String,
    month_tab: String,
    new_event: String,
    section_description: String,
    section_time: String,
    unit_tab: String,
    week_tab: String
  ): SchedulerLocaleLabels = {
    val __obj = js.Dynamic.literal(confirm_closing = confirm_closing.asInstanceOf[js.Any], confirm_deleting = confirm_deleting.asInstanceOf[js.Any], day_tab = day_tab.asInstanceOf[js.Any], dhx_cal_today_button = dhx_cal_today_button.asInstanceOf[js.Any], icon_cancel = icon_cancel.asInstanceOf[js.Any], icon_delete = icon_delete.asInstanceOf[js.Any], icon_details = icon_details.asInstanceOf[js.Any], icon_edit = icon_edit.asInstanceOf[js.Any], icon_save = icon_save.asInstanceOf[js.Any], month_tab = month_tab.asInstanceOf[js.Any], new_event = new_event.asInstanceOf[js.Any], section_description = section_description.asInstanceOf[js.Any], section_time = section_time.asInstanceOf[js.Any], unit_tab = unit_tab.asInstanceOf[js.Any], week_tab = week_tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerLocaleLabels]
  }
  
  @scala.inline
  implicit class SchedulerLocaleLabelsOps[Self <: SchedulerLocaleLabels] (val x: Self) extends AnyVal {
    
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
    def setDay_tab(value: String): Self = this.set("day_tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhx_cal_today_button(value: String): Self = this.set("dhx_cal_today_button", value.asInstanceOf[js.Any])
    
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
    def setMonth_tab(value: String): Self = this.set("month_tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_event(value: String): Self = this.set("new_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection_description(value: String): Self = this.set("section_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection_time(value: String): Self = this.set("section_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit_tab(value: String): Self = this.set("unit_tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek_tab(value: String): Self = this.set("week_tab", value.asInstanceOf[js.Any])
  }
}
