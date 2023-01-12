package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfig extends StObject {
  
  var Delay: js.UndefOr[Double] = js.undefined
  
  var FailureAction: js.UndefOr[String] = js.undefined
  
  var MaxFailureRatio: js.UndefOr[Double] = js.undefined
  
  var Monitor: js.UndefOr[Double] = js.undefined
  
  var Order: String
  
  var Parallelism: Double
}
object UpdateConfig {
  
  inline def apply(Order: String, Parallelism: Double): UpdateConfig = {
    val __obj = js.Dynamic.literal(Order = Order.asInstanceOf[js.Any], Parallelism = Parallelism.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConfig] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "Delay", js.undefined)
    
    inline def setFailureAction(value: String): Self = StObject.set(x, "FailureAction", value.asInstanceOf[js.Any])
    
    inline def setFailureActionUndefined: Self = StObject.set(x, "FailureAction", js.undefined)
    
    inline def setMaxFailureRatio(value: Double): Self = StObject.set(x, "MaxFailureRatio", value.asInstanceOf[js.Any])
    
    inline def setMaxFailureRatioUndefined: Self = StObject.set(x, "MaxFailureRatio", js.undefined)
    
    inline def setMonitor(value: Double): Self = StObject.set(x, "Monitor", value.asInstanceOf[js.Any])
    
    inline def setMonitorUndefined: Self = StObject.set(x, "Monitor", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setParallelism(value: Double): Self = StObject.set(x, "Parallelism", value.asInstanceOf[js.Any])
  }
}
