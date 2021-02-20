package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLimits extends StObject {
  
  var MemoryBytes: js.UndefOr[Double] = js.native
  
  var NanoCPUs: js.UndefOr[Double] = js.native
  
  var Pids: js.UndefOr[Double] = js.native
}
object ResourceLimits {
  
  @scala.inline
  def apply(): ResourceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLimits]
  }
  
  @scala.inline
  implicit class ResourceLimitsMutableBuilder[Self <: ResourceLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemoryBytes(value: Double): Self = StObject.set(x, "MemoryBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryBytesUndefined: Self = StObject.set(x, "MemoryBytes", js.undefined)
    
    @scala.inline
    def setNanoCPUs(value: Double): Self = StObject.set(x, "NanoCPUs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoCPUsUndefined: Self = StObject.set(x, "NanoCPUs", js.undefined)
    
    @scala.inline
    def setPids(value: Double): Self = StObject.set(x, "Pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidsUndefined: Self = StObject.set(x, "Pids", js.undefined)
  }
}
