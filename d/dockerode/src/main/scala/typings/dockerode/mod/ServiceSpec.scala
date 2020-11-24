package typings.dockerode.mod

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
  implicit class ServiceSpecOps[Self <: ServiceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointSpec(value: EndpointSpec): Self = this.set("EndpointSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointSpec: Self = this.set("EndpointSpec", js.undefined)
    
    @scala.inline
    def setMode(value: ServiceMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: NetworkAttachmentConfig*): Self = this.set("Networks", js.Array(value :_*))
    
    @scala.inline
    def setNetworks(value: js.Array[NetworkAttachmentConfig]): Self = this.set("Networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworks: Self = this.set("Networks", js.undefined)
    
    @scala.inline
    def setRollbackConfig(value: UpdateConfig): Self = this.set("RollbackConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackConfig: Self = this.set("RollbackConfig", js.undefined)
    
    @scala.inline
    def setTaskTemplate(value: TaskSpec): Self = this.set("TaskTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskTemplate: Self = this.set("TaskTemplate", js.undefined)
    
    @scala.inline
    def setUpdateConfig(value: UpdateConfig): Self = this.set("UpdateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateConfig: Self = this.set("UpdateConfig", js.undefined)
  }
}
