package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all components needed for Firestore with in-memory persistence.
  * Uses EagerGC garbage collection.
  */
trait MemoryOfflineComponentProvider
  extends StObject
     with OfflineComponentProvider {
  
  def createGarbageCollectionScheduler(cfg: ComponentConfiguration, localStore: LocalStore): Scheduler | Null
  
  def createIndexBackfillerScheduler(cfg: ComponentConfiguration, localStore: LocalStore): Scheduler | Null
  
  def createLocalStore(cfg: ComponentConfiguration): LocalStore
  
  def createPersistence(cfg: ComponentConfiguration): Persistence
  
  def createSharedClientState(cfg: ComponentConfiguration): SharedClientState
  
  var serializer: JsonProtoSerializer
}
object MemoryOfflineComponentProvider {
  
  inline def apply(
    createGarbageCollectionScheduler: (ComponentConfiguration, LocalStore) => Scheduler | Null,
    createIndexBackfillerScheduler: (ComponentConfiguration, LocalStore) => Scheduler | Null,
    createLocalStore: ComponentConfiguration => LocalStore,
    createPersistence: ComponentConfiguration => Persistence,
    createSharedClientState: ComponentConfiguration => SharedClientState,
    initialize: ComponentConfiguration => js.Promise[Unit],
    localStore: LocalStore,
    persistence: Persistence,
    serializer: JsonProtoSerializer,
    sharedClientState: SharedClientState,
    synchronizeTabs: Boolean,
    terminate: () => js.Promise[Unit]
  ): MemoryOfflineComponentProvider = {
    val __obj = js.Dynamic.literal(createGarbageCollectionScheduler = js.Any.fromFunction2(createGarbageCollectionScheduler), createIndexBackfillerScheduler = js.Any.fromFunction2(createIndexBackfillerScheduler), createLocalStore = js.Any.fromFunction1(createLocalStore), createPersistence = js.Any.fromFunction1(createPersistence), createSharedClientState = js.Any.fromFunction1(createSharedClientState), initialize = js.Any.fromFunction1(initialize), localStore = localStore.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], sharedClientState = sharedClientState.asInstanceOf[js.Any], synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate), gcScheduler = null, indexBackfillerScheduler = null)
    __obj.asInstanceOf[MemoryOfflineComponentProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryOfflineComponentProvider] (val x: Self) extends AnyVal {
    
    inline def setCreateGarbageCollectionScheduler(value: (ComponentConfiguration, LocalStore) => Scheduler | Null): Self = StObject.set(x, "createGarbageCollectionScheduler", js.Any.fromFunction2(value))
    
    inline def setCreateIndexBackfillerScheduler(value: (ComponentConfiguration, LocalStore) => Scheduler | Null): Self = StObject.set(x, "createIndexBackfillerScheduler", js.Any.fromFunction2(value))
    
    inline def setCreateLocalStore(value: ComponentConfiguration => LocalStore): Self = StObject.set(x, "createLocalStore", js.Any.fromFunction1(value))
    
    inline def setCreatePersistence(value: ComponentConfiguration => Persistence): Self = StObject.set(x, "createPersistence", js.Any.fromFunction1(value))
    
    inline def setCreateSharedClientState(value: ComponentConfiguration => SharedClientState): Self = StObject.set(x, "createSharedClientState", js.Any.fromFunction1(value))
    
    inline def setSerializer(value: JsonProtoSerializer): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
  }
}
