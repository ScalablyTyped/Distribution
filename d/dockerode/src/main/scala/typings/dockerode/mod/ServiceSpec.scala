package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceSpec extends Annotations {
  
  var EndpointSpec: js.UndefOr[typings.dockerode.mod.EndpointSpec] = js.native
  
  var Mode: js.UndefOr[ServiceMode] = js.native
  
  var Networks: js.UndefOr[js.Array[NetworkAttachmentConfig]] = js.native
  
  var RollbackConfig: js.UndefOr[UpdateConfig] = js.native
  
  var TaskTemplate: js.UndefOr[TaskSpec] = js.native
  
  var UpdateConfig: js.UndefOr[typings.dockerode.mod.UpdateConfig] = js.native
}
object ServiceSpec {
  
  @scala.inline
  def apply(): ServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpec]
  }
  
  @scala.inline
  implicit class ServiceSpecMutableBuilder[Self <: ServiceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointSpec(value: EndpointSpec): Self = StObject.set(x, "EndpointSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointSpecUndefined: Self = StObject.set(x, "EndpointSpec", js.undefined)
    
    @scala.inline
    def setMode(value: ServiceMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setNetworks(value: js.Array[NetworkAttachmentConfig]): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksUndefined: Self = StObject.set(x, "Networks", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: NetworkAttachmentConfig*): Self = StObject.set(x, "Networks", js.Array(value :_*))
    
    @scala.inline
    def setRollbackConfig(value: UpdateConfig): Self = StObject.set(x, "RollbackConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackConfigUndefined: Self = StObject.set(x, "RollbackConfig", js.undefined)
    
    @scala.inline
    def setTaskTemplate(value: TaskSpec): Self = StObject.set(x, "TaskTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTemplateUndefined: Self = StObject.set(x, "TaskTemplate", js.undefined)
    
    @scala.inline
    def setUpdateConfig(value: UpdateConfig): Self = StObject.set(x, "UpdateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateConfigUndefined: Self = StObject.set(x, "UpdateConfig", js.undefined)
  }
}
