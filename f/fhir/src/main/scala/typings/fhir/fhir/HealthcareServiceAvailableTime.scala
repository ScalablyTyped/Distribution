package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Times the Service Site is available
  */
@js.native
trait HealthcareServiceAvailableTime extends BackboneElement {
  
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
object HealthcareServiceAvailableTime {
  
  @scala.inline
  def apply(): HealthcareServiceAvailableTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthcareServiceAvailableTime]
  }
  
  @scala.inline
  implicit class HealthcareServiceAvailableTimeMutableBuilder[Self <: HealthcareServiceAvailableTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    @scala.inline
    def setAvailableEndTime(value: time): Self = StObject.set(x, "availableEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableEndTimeUndefined: Self = StObject.set(x, "availableEndTime", js.undefined)
    
    @scala.inline
    def setAvailableStartTime(value: time): Self = StObject.set(x, "availableStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableStartTimeUndefined: Self = StObject.set(x, "availableStartTime", js.undefined)
    
    @scala.inline
    def setDaysOfWeek(value: js.Array[code]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    @scala.inline
    def setDaysOfWeekVarargs(value: code*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def set_allDay(value: Element): Self = StObject.set(x, "_allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_allDayUndefined: Self = StObject.set(x, "_allDay", js.undefined)
    
    @scala.inline
    def set_availableEndTime(value: Element): Self = StObject.set(x, "_availableEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_availableEndTimeUndefined: Self = StObject.set(x, "_availableEndTime", js.undefined)
    
    @scala.inline
    def set_availableStartTime(value: Element): Self = StObject.set(x, "_availableStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_availableStartTimeUndefined: Self = StObject.set(x, "_availableStartTime", js.undefined)
    
    @scala.inline
    def set_daysOfWeek(value: js.Array[Element]): Self = StObject.set(x, "_daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_daysOfWeekUndefined: Self = StObject.set(x, "_daysOfWeek", js.undefined)
    
    @scala.inline
    def set_daysOfWeekVarargs(value: Element*): Self = StObject.set(x, "_daysOfWeek", js.Array(value :_*))
  }
}
