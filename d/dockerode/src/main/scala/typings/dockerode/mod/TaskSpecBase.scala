package typings.dockerode.mod

import typings.dockerode.anon.NameOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskSpecBase extends StObject {
  
  var ForceUpdate: js.UndefOr[Double] = js.undefined
  
  var LogDriver: js.UndefOr[NameOptions] = js.undefined
  
  var Networks: js.UndefOr[js.Array[NetworkAttachmentConfig]] = js.undefined
  
  var Placement: js.UndefOr[typings.dockerode.mod.Placement] = js.undefined
  
  var Resources: js.UndefOr[ResourceRequirements] = js.undefined
  
  var RestartPolicy: js.UndefOr[typings.dockerode.mod.RestartPolicy] = js.undefined
  
  var Runtime: js.UndefOr[String] = js.undefined
}
object TaskSpecBase {
  
  inline def apply(): TaskSpecBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskSpecBase]
  }
  
  extension [Self <: TaskSpecBase](x: Self) {
    
    inline def setForceUpdate(value: Double): Self = StObject.set(x, "ForceUpdate", value.asInstanceOf[js.Any])
    
    inline def setForceUpdateUndefined: Self = StObject.set(x, "ForceUpdate", js.undefined)
    
    inline def setLogDriver(value: NameOptions): Self = StObject.set(x, "LogDriver", value.asInstanceOf[js.Any])
    
    inline def setLogDriverUndefined: Self = StObject.set(x, "LogDriver", js.undefined)
    
    inline def setNetworks(value: js.Array[NetworkAttachmentConfig]): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "Networks", js.undefined)
    
    inline def setNetworksVarargs(value: NetworkAttachmentConfig*): Self = StObject.set(x, "Networks", js.Array(value*))
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setResources(value: ResourceRequirements): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setRestartPolicy(value: RestartPolicy): Self = StObject.set(x, "RestartPolicy", value.asInstanceOf[js.Any])
    
    inline def setRestartPolicyUndefined: Self = StObject.set(x, "RestartPolicy", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
  }
}
