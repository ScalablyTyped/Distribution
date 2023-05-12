package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpeningHours extends StObject {
  
  /**
    * Opening periods covering each day of the week, starting from Sunday, in
    * chronological order. Does not include days where the Place is not open.
    */
  var periods: js.Array[OpeningHoursPeriod]
  
  /**
    * An array of seven strings representing the formatted opening hours for
    * each day of the week. The Places Service will format and localize the
    * opening hours appropriately for the current language. The ordering of the
    * elements in this array depends on the language. Some languages start the
    * week on Monday, while others start on Sunday.
    */
  var weekdayDescriptions: js.Array[String]
}
object OpeningHours {
  
  inline def apply(periods: js.Array[OpeningHoursPeriod], weekdayDescriptions: js.Array[String]): OpeningHours = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any], weekdayDescriptions = weekdayDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHours]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpeningHours] (val x: Self) extends AnyVal {
    
    inline def setPeriods(value: js.Array[OpeningHoursPeriod]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsVarargs(value: OpeningHoursPeriod*): Self = StObject.set(x, "periods", js.Array(value*))
    
    inline def setWeekdayDescriptions(value: js.Array[String]): Self = StObject.set(x, "weekdayDescriptions", value.asInstanceOf[js.Any])
    
    inline def setWeekdayDescriptionsVarargs(value: String*): Self = StObject.set(x, "weekdayDescriptions", js.Array(value*))
  }
}
