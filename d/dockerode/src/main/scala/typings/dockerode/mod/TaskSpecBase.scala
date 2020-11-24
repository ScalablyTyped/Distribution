package typings.dockerode.mod

import typings.dockerode.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskSpecBase extends js.Object {
  
  var ForceUpdate: js.UndefOr[Double] = js.native
  
  var LogDriver: js.UndefOr[Options] = js.native
  
  var Networks: js.UndefOr[js.Array[NetworkAttachmentConfig]] = js.native
  
  var Placement: js.UndefOr[typings.dockerode.mod.Placement] = js.native
  
  var Resources: js.UndefOr[ResourceRequirements] = js.native
  
  var RestartPolicy: js.UndefOr[typings.dockerode.mod.RestartPolicy] = js.native
  
  var Runtime: js.UndefOr[String] = js.native
}
object TaskSpecBase {
  
  @scala.inline
  def apply(): TaskSpecBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskSpecBase]
  }
  
  @scala.inline
  implicit class TaskSpecBaseOps[Self <: TaskSpecBase] (val x: Self) extends AnyVal {
    
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
    def setForceUpdate(value: Double): Self = this.set("ForceUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceUpdate: Self = this.set("ForceUpdate", js.undefined)
    
    @scala.inline
    def setLogDriver(value: Options): Self = this.set("LogDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogDriver: Self = this.set("LogDriver", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: NetworkAttachmentConfig*): Self = this.set("Networks", js.Array(value :_*))
    
    @scala.inline
    def setNetworks(value: js.Array[NetworkAttachmentConfig]): Self = this.set("Networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworks: Self = this.set("Networks", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    
    @scala.inline
    def setResources(value: ResourceRequirements): Self = this.set("Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    
    @scala.inline
    def setRestartPolicy(value: RestartPolicy): Self = this.set("RestartPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartPolicy: Self = this.set("RestartPolicy", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = this.set("Runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntime: Self = this.set("Runtime", js.undefined)
  }
}
