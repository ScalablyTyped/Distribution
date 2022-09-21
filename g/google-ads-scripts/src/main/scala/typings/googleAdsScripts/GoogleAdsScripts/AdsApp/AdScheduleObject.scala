package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A plain JavaScript object describing an ad schedule. */
trait AdScheduleObject extends StObject {
  
  var bidModifier: js.UndefOr[Double] = js.undefined
  
  var dayOfWeek: AdScheduleDayOfWeekType
  
  var endHour: Double
  
  var endMinute: Double
  
  var startHour: Double
  
  var startMinute: Double
}
object AdScheduleObject {
  
  inline def apply(
    dayOfWeek: AdScheduleDayOfWeekType,
    endHour: Double,
    endMinute: Double,
    startHour: Double,
    startMinute: Double
  ): AdScheduleObject = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], endHour = endHour.asInstanceOf[js.Any], endMinute = endMinute.asInstanceOf[js.Any], startHour = startHour.asInstanceOf[js.Any], startMinute = startMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdScheduleObject]
  }
  
  extension [Self <: AdScheduleObject](x: Self) {
    
    inline def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
    
    inline def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
    
    inline def setDayOfWeek(value: AdScheduleDayOfWeekType): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
    
    inline def setEndMinute(value: Double): Self = StObject.set(x, "endMinute", value.asInstanceOf[js.Any])
    
    inline def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
    
    inline def setStartMinute(value: Double): Self = StObject.set(x, "startMinute", value.asInstanceOf[js.Any])
  }
}
