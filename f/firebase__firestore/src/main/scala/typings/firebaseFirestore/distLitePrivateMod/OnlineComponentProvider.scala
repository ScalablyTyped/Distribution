package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initializes and wires the components that are needed to interface with the
  * network.
  */
trait OnlineComponentProvider extends StObject {
  
  def createDatastore(cfg: ComponentConfiguration): Datastore
  
  def createEventManager(cfg: ComponentConfiguration): EventManager
  
  def createRemoteStore(cfg: ComponentConfiguration): RemoteStore
  
  def createSyncEngine(cfg: ComponentConfiguration, startAsPrimary: Boolean): SyncEngine
  
  var datastore: Datastore
  
  var eventManager: EventManager
  
  def initialize(offlineComponentProvider: OfflineComponentProvider, cfg: ComponentConfiguration): js.Promise[Unit]
  
  /* protected */ var localStore: LocalStore
  
  var remoteStore: RemoteStore
  
  /* protected */ var sharedClientState: SharedClientState
  
  var syncEngine: SyncEngine
  
  def terminate(): js.Promise[Unit]
}
object OnlineComponentProvider {
  
  inline def apply(
    createDatastore: ComponentConfiguration => Datastore,
    createEventManager: ComponentConfiguration => EventManager,
    createRemoteStore: ComponentConfiguration => RemoteStore,
    createSyncEngine: (ComponentConfiguration, Boolean) => SyncEngine,
    datastore: Datastore,
    eventManager: EventManager,
    initialize: (OfflineComponentProvider, ComponentConfiguration) => js.Promise[Unit],
    localStore: LocalStore,
    remoteStore: RemoteStore,
    sharedClientState: SharedClientState,
    syncEngine: SyncEngine,
    terminate: () => js.Promise[Unit]
  ): OnlineComponentProvider = {
    val __obj = js.Dynamic.literal(createDatastore = js.Any.fromFunction1(createDatastore), createEventManager = js.Any.fromFunction1(createEventManager), createRemoteStore = js.Any.fromFunction1(createRemoteStore), createSyncEngine = js.Any.fromFunction2(createSyncEngine), datastore = datastore.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], initialize = js.Any.fromFunction2(initialize), localStore = localStore.asInstanceOf[js.Any], remoteStore = remoteStore.asInstanceOf[js.Any], sharedClientState = sharedClientState.asInstanceOf[js.Any], syncEngine = syncEngine.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[OnlineComponentProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineComponentProvider] (val x: Self) extends AnyVal {
    
    inline def setCreateDatastore(value: ComponentConfiguration => Datastore): Self = StObject.set(x, "createDatastore", js.Any.fromFunction1(value))
    
    inline def setCreateEventManager(value: ComponentConfiguration => EventManager): Self = StObject.set(x, "createEventManager", js.Any.fromFunction1(value))
    
    inline def setCreateRemoteStore(value: ComponentConfiguration => RemoteStore): Self = StObject.set(x, "createRemoteStore", js.Any.fromFunction1(value))
    
    inline def setCreateSyncEngine(value: (ComponentConfiguration, Boolean) => SyncEngine): Self = StObject.set(x, "createSyncEngine", js.Any.fromFunction2(value))
    
    inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: (OfflineComponentProvider, ComponentConfiguration) => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setLocalStore(value: LocalStore): Self = StObject.set(x, "localStore", value.asInstanceOf[js.Any])
    
    inline def setRemoteStore(value: RemoteStore): Self = StObject.set(x, "remoteStore", value.asInstanceOf[js.Any])
    
    inline def setSharedClientState(value: SharedClientState): Self = StObject.set(x, "sharedClientState", value.asInstanceOf[js.Any])
    
    inline def setSyncEngine(value: SyncEngine): Self = StObject.set(x, "syncEngine", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: () => js.Promise[Unit]): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
