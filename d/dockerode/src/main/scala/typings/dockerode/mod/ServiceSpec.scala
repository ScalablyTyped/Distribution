package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSpec
  extends StObject
     with Annotations {
  
  var EndpointSpec: js.UndefOr[typings.dockerode.mod.EndpointSpec] = js.undefined
  
  var Mode: js.UndefOr[ServiceMode] = js.undefined
  
  var Networks: js.UndefOr[js.Array[NetworkAttachmentConfig]] = js.undefined
  
  var RollbackConfig: js.UndefOr[UpdateConfig] = js.undefined
  
  var TaskTemplate: js.UndefOr[TaskSpec] = js.undefined
  
  var UpdateConfig: js.UndefOr[typings.dockerode.mod.UpdateConfig] = js.undefined
}
object ServiceSpec {
  
  inline def apply(): ServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpec]
  }
  
  extension [Self <: ServiceSpec](x: Self) {
    
    inline def setEndpointSpec(value: EndpointSpec): Self = StObject.set(x, "EndpointSpec", value.asInstanceOf[js.Any])
    
    inline def setEndpointSpecUndefined: Self = StObject.set(x, "EndpointSpec", js.undefined)
    
    inline def setMode(value: ServiceMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setNetworks(value: js.Array[NetworkAttachmentConfig]): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "Networks", js.undefined)
    
    inline def setNetworksVarargs(value: NetworkAttachmentConfig*): Self = StObject.set(x, "Networks", js.Array(value :_*))
    
    inline def setRollbackConfig(value: UpdateConfig): Self = StObject.set(x, "RollbackConfig", value.asInstanceOf[js.Any])
    
    inline def setRollbackConfigUndefined: Self = StObject.set(x, "RollbackConfig", js.undefined)
    
    inline def setTaskTemplate(value: TaskSpec): Self = StObject.set(x, "TaskTemplate", value.asInstanceOf[js.Any])
    
    inline def setTaskTemplateUndefined: Self = StObject.set(x, "TaskTemplate", js.undefined)
    
    inline def setUpdateConfig(value: UpdateConfig): Self = StObject.set(x, "UpdateConfig", value.asInstanceOf[js.Any])
    
    inline def setUpdateConfigUndefined: Self = StObject.set(x, "UpdateConfig", js.undefined)
  }
}
