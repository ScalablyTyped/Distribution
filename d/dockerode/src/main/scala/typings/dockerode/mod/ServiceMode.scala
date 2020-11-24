package typings.dockerode.mod

import typings.dockerode.anon.MaxConcurrent
import typings.dockerode.anon.Replicas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceMode extends js.Object {
  
  var Global: js.UndefOr[js.Object] = js.native
  
  var GlobalJob: js.UndefOr[js.Object] = js.native
  
  var Replicated: js.UndefOr[Replicas] = js.native
  
  var ReplicatedJob: js.UndefOr[MaxConcurrent] = js.native
}
object ServiceMode {
  
  @scala.inline
  def apply(): ServiceMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceMode]
  }
  
  @scala.inline
  implicit class ServiceModeOps[Self <: ServiceMode] (val x: Self) extends AnyVal {
    
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
    def setGlobal(value: js.Object): Self = this.set("Global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("Global", js.undefined)
    
    @scala.inline
    def setGlobalJob(value: js.Object): Self = this.set("GlobalJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalJob: Self = this.set("GlobalJob", js.undefined)
    
    @scala.inline
    def setReplicated(value: Replicas): Self = this.set("Replicated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicated: Self = this.set("Replicated", js.undefined)
    
    @scala.inline
    def setReplicatedJob(value: MaxConcurrent): Self = this.set("ReplicatedJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicatedJob: Self = this.set("ReplicatedJob", js.undefined)
  }
}
