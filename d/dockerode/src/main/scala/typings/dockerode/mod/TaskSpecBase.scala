package typings.dockerode.mod

import typings.dockerode.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskSpecBase extends StObject {
  
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
  implicit class TaskSpecBaseMutableBuilder[Self <: TaskSpecBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceUpdate(value: Double): Self = StObject.set(x, "ForceUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUpdateUndefined: Self = StObject.set(x, "ForceUpdate", js.undefined)
    
    @scala.inline
    def setLogDriver(value: Options): Self = StObject.set(x, "LogDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDriverUndefined: Self = StObject.set(x, "LogDriver", js.undefined)
    
    @scala.inline
    def setNetworks(value: js.Array[NetworkAttachmentConfig]): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksUndefined: Self = StObject.set(x, "Networks", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: NetworkAttachmentConfig*): Self = StObject.set(x, "Networks", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: Placement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    @scala.inline
    def setResources(value: ResourceRequirements): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setRestartPolicy(value: RestartPolicy): Self = StObject.set(x, "RestartPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartPolicyUndefined: Self = StObject.set(x, "RestartPolicy", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
  }
}
