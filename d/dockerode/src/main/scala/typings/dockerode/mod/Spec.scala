package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spec
  extends StObject
     with Annotations {
  
  var CAConfig: js.UndefOr[typings.dockerode.mod.CAConfig] = js.undefined
  
  var Dispatcher: js.UndefOr[DispatcherConfig] = js.undefined
  
  var EncryptionConfig: js.UndefOr[typings.dockerode.mod.EncryptionConfig] = js.undefined
  
  var Orchestration: js.UndefOr[OrchestrationConfig] = js.undefined
  
  var Raft: RaftConfig
  
  var TaskDefaults: js.UndefOr[typings.dockerode.mod.TaskDefaults] = js.undefined
}
object Spec {
  
  inline def apply(Raft: RaftConfig): Spec = {
    val __obj = js.Dynamic.literal(Raft = Raft.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
  
  extension [Self <: Spec](x: Self) {
    
    inline def setCAConfig(value: CAConfig): Self = StObject.set(x, "CAConfig", value.asInstanceOf[js.Any])
    
    inline def setCAConfigUndefined: Self = StObject.set(x, "CAConfig", js.undefined)
    
    inline def setDispatcher(value: DispatcherConfig): Self = StObject.set(x, "Dispatcher", value.asInstanceOf[js.Any])
    
    inline def setDispatcherUndefined: Self = StObject.set(x, "Dispatcher", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
    
    inline def setOrchestration(value: OrchestrationConfig): Self = StObject.set(x, "Orchestration", value.asInstanceOf[js.Any])
    
    inline def setOrchestrationUndefined: Self = StObject.set(x, "Orchestration", js.undefined)
    
    inline def setRaft(value: RaftConfig): Self = StObject.set(x, "Raft", value.asInstanceOf[js.Any])
    
    inline def setTaskDefaults(value: TaskDefaults): Self = StObject.set(x, "TaskDefaults", value.asInstanceOf[js.Any])
    
    inline def setTaskDefaultsUndefined: Self = StObject.set(x, "TaskDefaults", js.undefined)
  }
}
