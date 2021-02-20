package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resources extends StObject {
  
  var GenericResources: js.UndefOr[js.Array[GenericResource]] = js.native
  
  var MemoryBytes: js.UndefOr[Double] = js.native
  
  var NanoCPUs: js.UndefOr[Double] = js.native
}
object Resources {
  
  @scala.inline
  def apply(): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit class ResourcesMutableBuilder[Self <: Resources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenericResources(value: js.Array[GenericResource]): Self = StObject.set(x, "GenericResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericResourcesUndefined: Self = StObject.set(x, "GenericResources", js.undefined)
    
    @scala.inline
    def setGenericResourcesVarargs(value: GenericResource*): Self = StObject.set(x, "GenericResources", js.Array(value :_*))
    
    @scala.inline
    def setMemoryBytes(value: Double): Self = StObject.set(x, "MemoryBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryBytesUndefined: Self = StObject.set(x, "MemoryBytes", js.undefined)
    
    @scala.inline
    def setNanoCPUs(value: Double): Self = StObject.set(x, "NanoCPUs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoCPUsUndefined: Self = StObject.set(x, "NanoCPUs", js.undefined)
  }
}
