package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  var GenericResources: js.UndefOr[js.Array[GenericResource]] = js.undefined
  
  var MemoryBytes: js.UndefOr[Double] = js.undefined
  
  var NanoCPUs: js.UndefOr[Double] = js.undefined
}
object Resources {
  
  inline def apply(): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resources]
  }
  
  extension [Self <: Resources](x: Self) {
    
    inline def setGenericResources(value: js.Array[GenericResource]): Self = StObject.set(x, "GenericResources", value.asInstanceOf[js.Any])
    
    inline def setGenericResourcesUndefined: Self = StObject.set(x, "GenericResources", js.undefined)
    
    inline def setGenericResourcesVarargs(value: GenericResource*): Self = StObject.set(x, "GenericResources", js.Array(value*))
    
    inline def setMemoryBytes(value: Double): Self = StObject.set(x, "MemoryBytes", value.asInstanceOf[js.Any])
    
    inline def setMemoryBytesUndefined: Self = StObject.set(x, "MemoryBytes", js.undefined)
    
    inline def setNanoCPUs(value: Double): Self = StObject.set(x, "NanoCPUs", value.asInstanceOf[js.Any])
    
    inline def setNanoCPUsUndefined: Self = StObject.set(x, "NanoCPUs", js.undefined)
  }
}
