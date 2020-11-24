package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Times the Service Site is available
  */
@js.native
trait PractitionerRoleAvailableTime extends BackboneElement {
  
  /**
    * Contains extended information for property 'allDay'.
    */
  var _allDay: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'availableEndTime'.
    */
  var _availableEndTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'availableStartTime'.
    */
  var _availableStartTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'daysOfWeek'.
    */
  var _daysOfWeek: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Always available? e.g. 24 hour service
    */
  var allDay: js.UndefOr[Boolean] = js.native
  
  /**
    * Closing time of day (ignored if allDay = true)
    */
  var availableEndTime: js.UndefOr[time] = js.native
  
  /**
    * Opening time of day (ignored if allDay = true)
    */
  var availableStartTime: js.UndefOr[time] = js.native
  
  /**
    * mon | tue | wed | thu | fri | sat | sun
    */
  var daysOfWeek: js.UndefOr[js.Array[code]] = js.native
}
object PractitionerRoleAvailableTime {
  
  @scala.inline
  def apply(): PractitionerRoleAvailableTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PractitionerRoleAvailableTime]
  }
  
  @scala.inline
  implicit class PractitionerRoleAvailableTimeOps[Self <: PractitionerRoleAvailableTime] (val x: Self) extends AnyVal {
    
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
    def set_allDay(value: Element): Self = this.set("_allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_allDay: Self = this.set("_allDay", js.undefined)
    
    @scala.inline
    def set_availableEndTime(value: Element): Self = this.set("_availableEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_availableEndTime: Self = this.set("_availableEndTime", js.undefined)
    
    @scala.inline
    def set_availableStartTime(value: Element): Self = this.set("_availableStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_availableStartTime: Self = this.set("_availableStartTime", js.undefined)
    
    @scala.inline
    def set_daysOfWeekVarargs(value: Element*): Self = this.set("_daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def set_daysOfWeek(value: js.Array[Element]): Self = this.set("_daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_daysOfWeek: Self = this.set("_daysOfWeek", js.undefined)
    
    @scala.inline
    def setAllDay(value: Boolean): Self = this.set("allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDay: Self = this.set("allDay", js.undefined)
    
    @scala.inline
    def setAvailableEndTime(value: time): Self = this.set("availableEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableEndTime: Self = this.set("availableEndTime", js.undefined)
    
    @scala.inline
    def setAvailableStartTime(value: time): Self = this.set("availableStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableStartTime: Self = this.set("availableStartTime", js.undefined)
    
    @scala.inline
    def setDaysOfWeekVarargs(value: code*): Self = this.set("daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeek(value: js.Array[code]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
  }
}
