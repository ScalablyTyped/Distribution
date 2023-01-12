package typings.fhir.r4Mod

import typings.fhir.fhirStrings.fri
import typings.fhir.fhirStrings.mon
import typings.fhir.fhirStrings.sat
import typings.fhir.fhirStrings.sun
import typings.fhir.fhirStrings.thu
import typings.fhir.fhirStrings.tue
import typings.fhir.fhirStrings.wed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthcareServiceAvailableTime
  extends StObject
     with BackboneElement {
  
  var _allDay: js.UndefOr[Element] = js.undefined
  
  var _availableEndTime: js.UndefOr[Element] = js.undefined
  
  var _availableStartTime: js.UndefOr[Element] = js.undefined
  
  var _daysOfWeek: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Is this always available? (hence times are irrelevant) e.g. 24 hour service.
    */
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time zone is expected to be for where this HealthcareService is provided at.
    */
  var availableEndTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone is expected to be for where this HealthcareService is provided at.
    */
  var availableStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates which days of the week are available between the start and end Times.
    */
  var daysOfWeek: js.UndefOr[js.Array[mon | tue | wed | thu | fri | sat | sun]] = js.undefined
}
object HealthcareServiceAvailableTime {
  
  inline def apply(): HealthcareServiceAvailableTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthcareServiceAvailableTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthcareServiceAvailableTime] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setAvailableEndTime(value: String): Self = StObject.set(x, "availableEndTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableEndTimeUndefined: Self = StObject.set(x, "availableEndTime", js.undefined)
    
    inline def setAvailableStartTime(value: String): Self = StObject.set(x, "availableStartTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableStartTimeUndefined: Self = StObject.set(x, "availableStartTime", js.undefined)
    
    inline def setDaysOfWeek(value: js.Array[mon | tue | wed | thu | fri | sat | sun]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    inline def setDaysOfWeekVarargs(value: (mon | tue | wed | thu | fri | sat | sun)*): Self = StObject.set(x, "daysOfWeek", js.Array(value*))
    
    inline def set_allDay(value: Element): Self = StObject.set(x, "_allDay", value.asInstanceOf[js.Any])
    
    inline def set_allDayUndefined: Self = StObject.set(x, "_allDay", js.undefined)
    
    inline def set_availableEndTime(value: Element): Self = StObject.set(x, "_availableEndTime", value.asInstanceOf[js.Any])
    
    inline def set_availableEndTimeUndefined: Self = StObject.set(x, "_availableEndTime", js.undefined)
    
    inline def set_availableStartTime(value: Element): Self = StObject.set(x, "_availableStartTime", value.asInstanceOf[js.Any])
    
    inline def set_availableStartTimeUndefined: Self = StObject.set(x, "_availableStartTime", js.undefined)
    
    inline def set_daysOfWeek(value: js.Array[Element]): Self = StObject.set(x, "_daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def set_daysOfWeekUndefined: Self = StObject.set(x, "_daysOfWeek", js.undefined)
    
    inline def set_daysOfWeekVarargs(value: Element*): Self = StObject.set(x, "_daysOfWeek", js.Array(value*))
  }
}
