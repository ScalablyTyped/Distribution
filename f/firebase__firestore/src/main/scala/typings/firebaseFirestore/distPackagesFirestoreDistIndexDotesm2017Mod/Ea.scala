package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ea extends StObject {
  
  def createGarbageCollectionScheduler(t: Any, e: Any): Null
  
  def createIndexBackfillerScheduler(t: Any, e: Any): Null
  
  def createLocalStore(t: Any): nu
  
  def createPersistence(t: Any): Ko_
  
  def createSharedClientState(t: Any): bu
  
  var gcScheduler: Any
  
  var indexBackfillerScheduler: Any
  
  def initialize(t: Any): js.Promise[Unit]
  
  var localStore: js.UndefOr[nu] = js.undefined
  
  var persistence: js.UndefOr[Ko_] = js.undefined
  
  var serializer: js.UndefOr[Vi] = js.undefined
  
  var sharedClientState: js.UndefOr[bu] = js.undefined
  
  var synchronizeTabs: Boolean
  
  def terminate(): js.Promise[Unit]
}
object Ea {
  
  inline def apply(
    createGarbageCollectionScheduler: (Any, Any) => Null,
    createIndexBackfillerScheduler: (Any, Any) => Null,
    createLocalStore: Any => nu,
    createPersistence: Any => Ko_,
    createSharedClientState: Any => bu,
    gcScheduler: Any,
    indexBackfillerScheduler: Any,
    initialize: Any => js.Promise[Unit],
    synchronizeTabs: Boolean,
    terminate: () => js.Promise[Unit]
  ): Ea = {
    val __obj = js.Dynamic.literal(createGarbageCollectionScheduler = js.Any.fromFunction2(createGarbageCollectionScheduler), createIndexBackfillerScheduler = js.Any.fromFunction2(createIndexBackfillerScheduler), createLocalStore = js.Any.fromFunction1(createLocalStore), createPersistence = js.Any.fromFunction1(createPersistence), createSharedClientState = js.Any.fromFunction1(createSharedClientState), gcScheduler = gcScheduler.asInstanceOf[js.Any], indexBackfillerScheduler = indexBackfillerScheduler.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Ea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ea] (val x: Self) extends AnyVal {
    
    inline def setCreateGarbageCollectionScheduler(value: (Any, Any) => Null): Self = StObject.set(x, "createGarbageCollectionScheduler", js.Any.fromFunction2(value))
    
    inline def setCreateIndexBackfillerScheduler(value: (Any, Any) => Null): Self = StObject.set(x, "createIndexBackfillerScheduler", js.Any.fromFunction2(value))
    
    inline def setCreateLocalStore(value: Any => nu): Self = StObject.set(x, "createLocalStore", js.Any.fromFunction1(value))
    
    inline def setCreatePersistence(value: Any => Ko_): Self = StObject.set(x, "createPersistence", js.Any.fromFunction1(value))
    
    inline def setCreateSharedClientState(value: Any => bu): Self = StObject.set(x, "createSharedClientState", js.Any.fromFunction1(value))
    
    inline def setGcScheduler(value: Any): Self = StObject.set(x, "gcScheduler", value.asInstanceOf[js.Any])
    
    inline def setIndexBackfillerScheduler(value: Any): Self = StObject.set(x, "indexBackfillerScheduler", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: Any => js.Promise[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setLocalStore(value: nu): Self = StObject.set(x, "localStore", value.asInstanceOf[js.Any])
    
    inline def setLocalStoreUndefined: Self = StObject.set(x, "localStore", js.undefined)
    
    inline def setPersistence(value: Ko_): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
    
    inline def setSerializer(value: Vi): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    
    inline def setSharedClientState(value: bu): Self = StObject.set(x, "sharedClientState", value.asInstanceOf[js.Any])
    
    inline def setSharedClientStateUndefined: Self = StObject.set(x, "sharedClientState", js.undefined)
    
    inline def setSynchronizeTabs(value: Boolean): Self = StObject.set(x, "synchronizeTabs", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: () => js.Promise[Unit]): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
