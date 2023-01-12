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

trait LocationHoursOfOperation
  extends StObject
     with BackboneElement {
  
  var _allDay: js.UndefOr[Element] = js.undefined
  
  var _closingTime: js.UndefOr[Element] = js.undefined
  
  var _daysOfWeek: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _openingTime: js.UndefOr[Element] = js.undefined
  
  /**
    * The Location is open all day.
    */
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time that the Location closes.
    */
  var closingTime: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates which days of the week are available between the start and end Times.
    */
  var daysOfWeek: js.UndefOr[js.Array[mon | tue | wed | thu | fri | sat | sun]] = js.undefined
  
  /**
    * Time that the Location opens.
    */
  var openingTime: js.UndefOr[String] = js.undefined
}
object LocationHoursOfOperation {
  
  inline def apply(): LocationHoursOfOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationHoursOfOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationHoursOfOperation] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setClosingTime(value: String): Self = StObject.set(x, "closingTime", value.asInstanceOf[js.Any])
    
    inline def setClosingTimeUndefined: Self = StObject.set(x, "closingTime", js.undefined)
    
    inline def setDaysOfWeek(value: js.Array[mon | tue | wed | thu | fri | sat | sun]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    inline def setDaysOfWeekVarargs(value: (mon | tue | wed | thu | fri | sat | sun)*): Self = StObject.set(x, "daysOfWeek", js.Array(value*))
    
    inline def setOpeningTime(value: String): Self = StObject.set(x, "openingTime", value.asInstanceOf[js.Any])
    
    inline def setOpeningTimeUndefined: Self = StObject.set(x, "openingTime", js.undefined)
    
    inline def set_allDay(value: Element): Self = StObject.set(x, "_allDay", value.asInstanceOf[js.Any])
    
    inline def set_allDayUndefined: Self = StObject.set(x, "_allDay", js.undefined)
    
    inline def set_closingTime(value: Element): Self = StObject.set(x, "_closingTime", value.asInstanceOf[js.Any])
    
    inline def set_closingTimeUndefined: Self = StObject.set(x, "_closingTime", js.undefined)
    
    inline def set_daysOfWeek(value: js.Array[Element]): Self = StObject.set(x, "_daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def set_daysOfWeekUndefined: Self = StObject.set(x, "_daysOfWeek", js.undefined)
    
    inline def set_daysOfWeekVarargs(value: Element*): Self = StObject.set(x, "_daysOfWeek", js.Array(value*))
    
    inline def set_openingTime(value: Element): Self = StObject.set(x, "_openingTime", value.asInstanceOf[js.Any])
    
    inline def set_openingTimeUndefined: Self = StObject.set(x, "_openingTime", js.undefined)
  }
}
