package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartPolicy extends StObject {
  
  var Condition: js.UndefOr[String] = js.undefined
  
  var Delay: js.UndefOr[Double] = js.undefined
  
  var MaxAttempts: js.UndefOr[Double] = js.undefined
  
  var MaximumRetryCount: js.UndefOr[Double] = js.undefined
  
  var Name: String
  
  var Window: js.UndefOr[Double] = js.undefined
}
object RestartPolicy {
  
  inline def apply(Name: String): RestartPolicy = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartPolicy]
  }
  
  extension [Self <: RestartPolicy](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "Delay", js.undefined)
    
    inline def setMaxAttempts(value: Double): Self = StObject.set(x, "MaxAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxAttemptsUndefined: Self = StObject.set(x, "MaxAttempts", js.undefined)
    
    inline def setMaximumRetryCount(value: Double): Self = StObject.set(x, "MaximumRetryCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryCountUndefined: Self = StObject.set(x, "MaximumRetryCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "Window", js.undefined)
  }
}
