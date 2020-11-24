package typings.devextreme.mod.DevExpress.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSchedulerAppointment extends CollectionWidgetItem {
  
  /**
    * [descr:dxSchedulerAppointment.allDay]
    */
  var allDay: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxSchedulerAppointment.description]
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSchedulerAppointment.endDate]
    */
  var endDate: js.UndefOr[Date] = js.native
  
  /**
    * [descr:dxSchedulerAppointment.endDateTimeZone]
    */
  var endDateTimeZone: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSchedulerAppointment.recurrenceException]
    */
  var recurrenceException: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSchedulerAppointment.recurrenceRule]
    */
  var recurrenceRule: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSchedulerAppointment.startDate]
    */
  var startDate: js.UndefOr[Date] = js.native
  
  /**
    * [descr:dxSchedulerAppointment.startDateTimeZone]
    */
  var startDateTimeZone: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxSchedulerAppointment.template]
    */
  @JSName("template")
  var template_dxSchedulerAppointment: js.UndefOr[typings.devextreme.mod.DevExpress.core.template] = js.native
}
object dxSchedulerAppointment {
  
  @scala.inline
  def apply(): dxSchedulerAppointment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSchedulerAppointment]
  }
  
  @scala.inline
  implicit class dxSchedulerAppointmentOps[Self <: dxSchedulerAppointment] (val x: Self) extends AnyVal {
    
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
    def setAllDay(value: Boolean): Self = this.set("allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDay: Self = this.set("allDay", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setEndDateTimeZone(value: String): Self = this.set("endDateTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTimeZone: Self = this.set("endDateTimeZone", js.undefined)
    
    @scala.inline
    def setRecurrenceException(value: String): Self = this.set("recurrenceException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceException: Self = this.set("recurrenceException", js.undefined)
    
    @scala.inline
    def setRecurrenceRule(value: String): Self = this.set("recurrenceRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceRule: Self = this.set("recurrenceRule", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartDateTimeZone(value: String): Self = this.set("startDateTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTimeZone: Self = this.set("startDateTimeZone", js.undefined)
    
    @scala.inline
    def setTemplate(value: typings.devextreme.mod.DevExpress.core.template): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
