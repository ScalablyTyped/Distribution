package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all components needed for Firestore with IndexedDB persistence.
  */ trait va
  extends StObject
     with Ea {
  
  var Vc: Any
  
  var cacheSizeBytes: Any
  
  var forceOwnership: Any
}
object va {
  
  inline def apply(
    Vc: Any,
    cacheSizeBytes: Any,
    createGarbageCollectionScheduler: (Any, Any) => Null,
    createIndexBackfillerScheduler: (Any, Any) => Null,
    createLocalStore: Any => nu,
    createPersistence: Any => Ko_,
    createSharedClientState: Any => bu,
    forceOwnership: Any,
    gcScheduler: Any,
    indexBackfillerScheduler: Any,
    initialize: Any => js.Promise[Unit],
    synchronizeTabs: Boolean,
    terminate: () => js.Promise[Unit]
  ): va = {
    val __obj = js.Dynamic.literal(Vc = Vc.asInstanceOf[js.Any], cacheSizeBytes = cacheSizeBytes.asInstanceOf[js.Any], createGarbageCollectionScheduler = js.Any.fromFunction2(createGarbageCollectionScheduler), createIndexBackfillerScheduler = js.Any.fromFunction2(createIndexBackfillerScheduler), createLocalStore = js.Any.fromFunction1(createLocalStore), createPersistence = js.Any.fromFunction1(createPersistence), createSharedClientState = js.Any.fromFunction1(createSharedClientState), forceOwnership = forceOwnership.asInstanceOf[js.Any], gcScheduler = gcScheduler.asInstanceOf[js.Any], indexBackfillerScheduler = indexBackfillerScheduler.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[va]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: va] (val x: Self) extends AnyVal {
    
    inline def setCacheSizeBytes(value: Any): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setForceOwnership(value: Any): Self = StObject.set(x, "forceOwnership", value.asInstanceOf[js.Any])
    
    inline def setVc(value: Any): Self = StObject.set(x, "Vc", value.asInstanceOf[js.Any])
  }
}
