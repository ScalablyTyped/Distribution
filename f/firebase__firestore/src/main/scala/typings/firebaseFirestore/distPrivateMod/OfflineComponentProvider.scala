package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initializes and wires components that are needed to interface with the local
  * cache. Implementations override `initialize()` to provide all components.
  */
trait OfflineComponentProvider extends StObject {
  
  var gcScheduler: Scheduler | Null
  
  var indexBackfillerScheduler: Scheduler | Null
  
  def initialize(cfg: ComponentConfiguration): js.Promise[Unit]
  
  var localStore: LocalStore
  
  var persistence: Persistence
  
  var sharedClientState: SharedClientState
  
  var synchronizeTabs: Boolean
  
  def terminate(): js.Promise[Unit]
}
object OfflineComponentProvider {
  
  inline def apply(
    initialize: ComponentConfiguration => js.Promise[Unit],
    localStore: LocalStore,
    persistence: Persistence,
    sharedClientState: SharedClientState,
    synchronizeTabs: Boolean,
    terminate: () => js.Promise[Unit]
  ): OfflineComponentProvider = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], sharedClientState = sharedClientState.asInstanceOf[js.Any], synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate), gcScheduler = null, indexBackfillerScheduler = null)
    __obj.asInstanceOf[OfflineComponentProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfflineComponentProvider] (val x: Self) extends AnyVal {
    
    inline def setGcScheduler(value: Scheduler): Self = StObject.set(x, "gcScheduler", value.asInstanceOf[js.Any])
    
    inline def setGcSchedulerNull: Self = StObject.set(x, "gcScheduler", null)
    
    inline def setIndexBackfillerScheduler(value: Scheduler): Self = StObject.set(x, "indexBackfillerScheduler", value.asInstanceOf[js.Any])
    
    inline def setIndexBackfillerSchedulerNull: Self = StObject.set(x, "indexBackfillerScheduler", null)
    
    inline def setInitialize(value: ComponentConfiguration => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setLocalStore(value: LocalStore): Self = StObject.set(x, "localStore", value.asInstanceOf[js.Any])
    
    inline def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setSharedClientState(value: SharedClientState): Self = StObject.set(x, "sharedClientState", value.asInstanceOf[js.Any])
    
    inline def setSynchronizeTabs(value: Boolean): Self = StObject.set(x, "synchronizeTabs", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: () => js.Promise[Unit]): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
