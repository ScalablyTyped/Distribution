package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initializes and wires the components that are needed to interface with the
  * network.
  */ trait Pa extends StObject {
  
  def createDatastore(t: Any): Ku
  
  def createEventManager(t: Any): bc
  
  def createRemoteStore(t: Any): ju
  
  def createSyncEngine(t: Any, e: Any): Kc
  
  var datastore: js.UndefOr[Ku] = js.undefined
  
  var eventManager: js.UndefOr[bc] = js.undefined
  
  def initialize(t: Any, e: Any): js.Promise[Unit]
  
  var localStore: Any
  
  var remoteStore: js.UndefOr[ju] = js.undefined
  
  var sharedClientState: Any
  
  var syncEngine: js.UndefOr[Kc] = js.undefined
  
  def terminate(): js.Promise[Unit]
}
object Pa {
  
  inline def apply(
    createDatastore: Any => Ku,
    createEventManager: Any => bc,
    createRemoteStore: Any => ju,
    createSyncEngine: (Any, Any) => Kc,
    initialize: (Any, Any) => js.Promise[Unit],
    localStore: Any,
    sharedClientState: Any,
    terminate: () => js.Promise[Unit]
  ): Pa = {
    val __obj = js.Dynamic.literal(createDatastore = js.Any.fromFunction1(createDatastore), createEventManager = js.Any.fromFunction1(createEventManager), createRemoteStore = js.Any.fromFunction1(createRemoteStore), createSyncEngine = js.Any.fromFunction2(createSyncEngine), initialize = js.Any.fromFunction2(initialize), localStore = localStore.asInstanceOf[js.Any], sharedClientState = sharedClientState.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Pa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pa] (val x: Self) extends AnyVal {
    
    inline def setCreateDatastore(value: Any => Ku): Self = StObject.set(x, "createDatastore", js.Any.fromFunction1(value))
    
    inline def setCreateEventManager(value: Any => bc): Self = StObject.set(x, "createEventManager", js.Any.fromFunction1(value))
    
    inline def setCreateRemoteStore(value: Any => ju): Self = StObject.set(x, "createRemoteStore", js.Any.fromFunction1(value))
    
    inline def setCreateSyncEngine(value: (Any, Any) => Kc): Self = StObject.set(x, "createSyncEngine", js.Any.fromFunction2(value))
    
    inline def setDatastore(value: Ku): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setDatastoreUndefined: Self = StObject.set(x, "datastore", js.undefined)
    
    inline def setEventManager(value: bc): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    inline def setEventManagerUndefined: Self = StObject.set(x, "eventManager", js.undefined)
    
    inline def setInitialize(value: (Any, Any) => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setLocalStore(value: Any): Self = StObject.set(x, "localStore", value.asInstanceOf[js.Any])
    
    inline def setRemoteStore(value: ju): Self = StObject.set(x, "remoteStore", value.asInstanceOf[js.Any])
    
    inline def setRemoteStoreUndefined: Self = StObject.set(x, "remoteStore", js.undefined)
    
    inline def setSharedClientState(value: Any): Self = StObject.set(x, "sharedClientState", value.asInstanceOf[js.Any])
    
    inline def setSyncEngine(value: Kc): Self = StObject.set(x, "syncEngine", value.asInstanceOf[js.Any])
    
    inline def setSyncEngineUndefined: Self = StObject.set(x, "syncEngine", js.undefined)
    
    inline def setTerminate(value: () => js.Promise[Unit]): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
