package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPUUsage extends StObject {
  
  var percpu_usage: js.Array[Double]
  
  var total_usage: Double
  
  var usage_in_kernelmode: Double
  
  var usage_in_usermode: Double
}
object CPUUsage {
  
  inline def apply(
    percpu_usage: js.Array[Double],
    total_usage: Double,
    usage_in_kernelmode: Double,
    usage_in_usermode: Double
  ): CPUUsage = {
    val __obj = js.Dynamic.literal(percpu_usage = percpu_usage.asInstanceOf[js.Any], total_usage = total_usage.asInstanceOf[js.Any], usage_in_kernelmode = usage_in_kernelmode.asInstanceOf[js.Any], usage_in_usermode = usage_in_usermode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUUsage]
  }
  
  extension [Self <: CPUUsage](x: Self) {
    
    inline def setPercpu_usage(value: js.Array[Double]): Self = StObject.set(x, "percpu_usage", value.asInstanceOf[js.Any])
    
    inline def setPercpu_usageVarargs(value: Double*): Self = StObject.set(x, "percpu_usage", js.Array(value*))
    
    inline def setTotal_usage(value: Double): Self = StObject.set(x, "total_usage", value.asInstanceOf[js.Any])
    
    inline def setUsage_in_kernelmode(value: Double): Self = StObject.set(x, "usage_in_kernelmode", value.asInstanceOf[js.Any])
    
    inline def setUsage_in_usermode(value: Double): Self = StObject.set(x, "usage_in_usermode", value.asInstanceOf[js.Any])
  }
}
