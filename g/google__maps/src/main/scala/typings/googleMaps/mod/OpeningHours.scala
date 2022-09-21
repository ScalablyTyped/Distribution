package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpeningHours extends StObject {
  
  /** is a boolean value indicating if the place is open at the current time. */
  var open_now: Boolean
  
  /** is an array of opening periods covering seven days, starting from Sunday, in chronological order. */
  var periods: js.Array[OpeningPeriod]
  
  /**
    * is an array of seven strings representing the formatted opening hours for each day of the week.
    * If a `language` parameter was specified in the Place Details request, the Places Service will format
    * and localize the opening hours appropriately for that language. The ordering of the elements in this array
    * depends on the `language` parameter. Some languages start the week on Monday while others start on Sunday.
    */
  var weekday_text: js.Array[String]
}
object OpeningHours {
  
  inline def apply(open_now: Boolean, periods: js.Array[OpeningPeriod], weekday_text: js.Array[String]): OpeningHours = {
    val __obj = js.Dynamic.literal(open_now = open_now.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], weekday_text = weekday_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHours]
  }
  
  extension [Self <: OpeningHours](x: Self) {
    
    inline def setOpen_now(value: Boolean): Self = StObject.set(x, "open_now", value.asInstanceOf[js.Any])
    
    inline def setPeriods(value: js.Array[OpeningPeriod]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsVarargs(value: OpeningPeriod*): Self = StObject.set(x, "periods", js.Array(value*))
    
    inline def setWeekday_text(value: js.Array[String]): Self = StObject.set(x, "weekday_text", value.asInstanceOf[js.Any])
    
    inline def setWeekday_textVarargs(value: String*): Self = StObject.set(x, "weekday_text", js.Array(value*))
  }
}
