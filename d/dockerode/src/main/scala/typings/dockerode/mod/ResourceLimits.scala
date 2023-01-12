package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceLimits extends StObject {
  
  var MemoryBytes: js.UndefOr[Double] = js.undefined
  
  var NanoCPUs: js.UndefOr[Double] = js.undefined
  
  var Pids: js.UndefOr[Double] = js.undefined
}
object ResourceLimits {
  
  inline def apply(): ResourceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceLimits] (val x: Self) extends AnyVal {
    
    inline def setMemoryBytes(value: Double): Self = StObject.set(x, "MemoryBytes", value.asInstanceOf[js.Any])
    
    inline def setMemoryBytesUndefined: Self = StObject.set(x, "MemoryBytes", js.undefined)
    
    inline def setNanoCPUs(value: Double): Self = StObject.set(x, "NanoCPUs", value.asInstanceOf[js.Any])
    
    inline def setNanoCPUsUndefined: Self = StObject.set(x, "NanoCPUs", js.undefined)
    
    inline def setPids(value: Double): Self = StObject.set(x, "Pids", value.asInstanceOf[js.Any])
    
    inline def setPidsUndefined: Self = StObject.set(x, "Pids", js.undefined)
  }
}
