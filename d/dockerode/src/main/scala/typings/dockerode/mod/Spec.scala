package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
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
  implicit class SpecMutableBuilder[Self <: Spec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAConfig(value: CAConfig): Self = StObject.set(x, "CAConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAConfigUndefined: Self = StObject.set(x, "CAConfig", js.undefined)
    
    @scala.inline
    def setDispatcher(value: DispatcherConfig): Self = StObject.set(x, "Dispatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatcherUndefined: Self = StObject.set(x, "Dispatcher", js.undefined)
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
    
    @scala.inline
    def setOrchestration(value: OrchestrationConfig): Self = StObject.set(x, "Orchestration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrchestrationUndefined: Self = StObject.set(x, "Orchestration", js.undefined)
    
    @scala.inline
    def setRaft(value: RaftConfig): Self = StObject.set(x, "Raft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefaults(value: TaskDefaults): Self = StObject.set(x, "TaskDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefaultsUndefined: Self = StObject.set(x, "TaskDefaults", js.undefined)
  }
}
