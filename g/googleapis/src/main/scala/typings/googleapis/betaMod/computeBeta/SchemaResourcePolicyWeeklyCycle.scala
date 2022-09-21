package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyWeeklyCycle extends StObject {
  
  /**
    * Up to 7 intervals/windows, one for each day of the week.
    */
  var dayOfWeeks: js.UndefOr[js.Array[SchemaResourcePolicyWeeklyCycleDayOfWeek]] = js.undefined
}
object SchemaResourcePolicyWeeklyCycle {
  
  inline def apply(): SchemaResourcePolicyWeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyWeeklyCycle]
  }
  
  extension [Self <: SchemaResourcePolicyWeeklyCycle](x: Self) {
    
    inline def setDayOfWeeks(value: js.Array[SchemaResourcePolicyWeeklyCycleDayOfWeek]): Self = StObject.set(x, "dayOfWeeks", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeeksUndefined: Self = StObject.set(x, "dayOfWeeks", js.undefined)
    
    inline def setDayOfWeeksVarargs(value: SchemaResourcePolicyWeeklyCycleDayOfWeek*): Self = StObject.set(x, "dayOfWeeks", js.Array(value*))
  }
}
