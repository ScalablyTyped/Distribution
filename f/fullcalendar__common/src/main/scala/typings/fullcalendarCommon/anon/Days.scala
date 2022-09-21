package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Days extends StObject {
  
  var days: Double
  
  var milliseconds: Double
  
  var months: Double
  
  var years: Double
}
object Days {
  
  inline def apply(days: Double, milliseconds: Double, months: Double, years: Double): Days = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Days]
  }
  
  extension [Self <: Days](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
  }
}
