package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents one period of a Google Ads ad extension schedule. For instance, if an ad extension were set up to only show on ads on weekdays
  * from 09:00 to 18:00, it would have five ExtensionSchedules: one for Monday 09:00 - 18:00, one for Tuesday 09:00 - 18:00, and so on.
  *
  *      var monday = {
  *        dayOfWeek: "MONDAY",
  *        startHour: 9,
  *        startMinute: 0,
  *        endHour: 18,
  *        endMinute: 0
  *      };
  *      var tuesday = {
  *        dayOfWeek: "TUESDAY",
  *        startHour: 9,
  *        startMinute: 0,
  *        endHour: 18,
  *        endMinute: 0
  *      };
  *
  *      sitelink.setSchedules([monday, tuesday]);
  */
trait ExtensionScheduleLiteral extends StObject {
  
  var dayOfWeek: ExtensionScheduleDayOfWeekType
  
  var endHour: Double
  
  var endMinute: Double
  
  var startHour: Double
  
  var startMinute: Double
}
object ExtensionScheduleLiteral {
  
  inline def apply(
    dayOfWeek: ExtensionScheduleDayOfWeekType,
    endHour: Double,
    endMinute: Double,
    startHour: Double,
    startMinute: Double
  ): ExtensionScheduleLiteral = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], endHour = endHour.asInstanceOf[js.Any], endMinute = endMinute.asInstanceOf[js.Any], startHour = startHour.asInstanceOf[js.Any], startMinute = startMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionScheduleLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionScheduleLiteral] (val x: Self) extends AnyVal {
    
    inline def setDayOfWeek(value: ExtensionScheduleDayOfWeekType): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
    
    inline def setEndMinute(value: Double): Self = StObject.set(x, "endMinute", value.asInstanceOf[js.Any])
    
    inline def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
    
    inline def setStartMinute(value: Double): Self = StObject.set(x, "startMinute", value.asInstanceOf[js.Any])
  }
}
