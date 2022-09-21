package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var days: Double
  
  var milliseconds: Double
  
  var months: Double
  
  var specifiedWeeks: js.UndefOr[Boolean] = js.undefined
  
  var years: Double
}
object Duration {
  
  inline def apply(days: Double, milliseconds: Double, months: Double, years: Double): Duration = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setSpecifiedWeeks(value: Boolean): Self = StObject.set(x, "specifiedWeeks", value.asInstanceOf[js.Any])
    
    inline def setSpecifiedWeeksUndefined: Self = StObject.set(x, "specifiedWeeks", js.undefined)
    
    inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
  }
}
