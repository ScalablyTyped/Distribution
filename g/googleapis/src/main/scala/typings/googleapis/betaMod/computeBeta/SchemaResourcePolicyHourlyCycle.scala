package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicyHourlyCycle extends StObject {
  
  /**
    * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
    */
  var hoursInCycle: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourcePolicyHourlyCycle {
  
  inline def apply(): SchemaResourcePolicyHourlyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyHourlyCycle]
  }
  
  extension [Self <: SchemaResourcePolicyHourlyCycle](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setHoursInCycle(value: Double): Self = StObject.set(x, "hoursInCycle", value.asInstanceOf[js.Any])
    
    inline def setHoursInCycleNull: Self = StObject.set(x, "hoursInCycle", null)
    
    inline def setHoursInCycleUndefined: Self = StObject.set(x, "hoursInCycle", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
