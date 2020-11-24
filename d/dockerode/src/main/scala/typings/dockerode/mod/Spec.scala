package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spec extends Annotations {
  
  var CAConfig: js.UndefOr[typings.dockerode.mod.CAConfig] = js.native
  
  var Dispatcher: js.UndefOr[DispatcherConfig] = js.native
  
  var EncryptionConfig: js.UndefOr[typings.dockerode.mod.EncryptionConfig] = js.native
  
  var Orchestration: js.UndefOr[OrchestrationConfig] = js.native
  
  var Raft: RaftConfig = js.native
  
  var TaskDefaults: js.UndefOr[typings.dockerode.mod.TaskDefaults] = js.native
}
object Spec {
  
  @scala.inline
  def apply(Raft: RaftConfig): Spec = {
    val __obj = js.Dynamic.literal(Raft = Raft.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
  
  @scala.inline
  implicit class SpecOps[Self <: Spec] (val x: Self) extends AnyVal {
    
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
    def setRaft(value: RaftConfig): Self = this.set("Raft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAConfig(value: CAConfig): Self = this.set("CAConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCAConfig: Self = this.set("CAConfig", js.undefined)
    
    @scala.inline
    def setDispatcher(value: DispatcherConfig): Self = this.set("Dispatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatcher: Self = this.set("Dispatcher", js.undefined)
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = this.set("EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("EncryptionConfig", js.undefined)
    
    @scala.inline
    def setOrchestration(value: OrchestrationConfig): Self = this.set("Orchestration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrchestration: Self = this.set("Orchestration", js.undefined)
    
    @scala.inline
    def setTaskDefaults(value: TaskDefaults): Self = this.set("TaskDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskDefaults: Self = this.set("TaskDefaults", js.undefined)
  }
}
