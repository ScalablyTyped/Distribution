package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateProfile extends StObject {
  
  var activeRange: DateRange | Null
  
  var currentRange: DateRange
  
  var currentRangeUnit: String
  
  var dateIncrement: Duration
  
  var isRangeAllDay: Boolean
  
  var isValid: Boolean
  
  var renderRange: DateRange
  
  var slotMaxTime: Duration
  
  var slotMinTime: Duration
  
  var validRange: OpenDateRange
}
object DateProfile {
  
  inline def apply(
    currentRange: DateRange,
    currentRangeUnit: String,
    dateIncrement: Duration,
    isRangeAllDay: Boolean,
    isValid: Boolean,
    renderRange: DateRange,
    slotMaxTime: Duration,
    slotMinTime: Duration,
    validRange: OpenDateRange
  ): DateProfile = {
    val __obj = js.Dynamic.literal(currentRange = currentRange.asInstanceOf[js.Any], currentRangeUnit = currentRangeUnit.asInstanceOf[js.Any], dateIncrement = dateIncrement.asInstanceOf[js.Any], isRangeAllDay = isRangeAllDay.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], renderRange = renderRange.asInstanceOf[js.Any], slotMaxTime = slotMaxTime.asInstanceOf[js.Any], slotMinTime = slotMinTime.asInstanceOf[js.Any], validRange = validRange.asInstanceOf[js.Any], activeRange = null)
    __obj.asInstanceOf[DateProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateProfile] (val x: Self) extends AnyVal {
    
    inline def setActiveRange(value: DateRange): Self = StObject.set(x, "activeRange", value.asInstanceOf[js.Any])
    
    inline def setActiveRangeNull: Self = StObject.set(x, "activeRange", null)
    
    inline def setCurrentRange(value: DateRange): Self = StObject.set(x, "currentRange", value.asInstanceOf[js.Any])
    
    inline def setCurrentRangeUnit(value: String): Self = StObject.set(x, "currentRangeUnit", value.asInstanceOf[js.Any])
    
    inline def setDateIncrement(value: Duration): Self = StObject.set(x, "dateIncrement", value.asInstanceOf[js.Any])
    
    inline def setIsRangeAllDay(value: Boolean): Self = StObject.set(x, "isRangeAllDay", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setRenderRange(value: DateRange): Self = StObject.set(x, "renderRange", value.asInstanceOf[js.Any])
    
    inline def setSlotMaxTime(value: Duration): Self = StObject.set(x, "slotMaxTime", value.asInstanceOf[js.Any])
    
    inline def setSlotMinTime(value: Duration): Self = StObject.set(x, "slotMinTime", value.asInstanceOf[js.Any])
    
    inline def setValidRange(value: OpenDateRange): Self = StObject.set(x, "validRange", value.asInstanceOf[js.Any])
  }
}
