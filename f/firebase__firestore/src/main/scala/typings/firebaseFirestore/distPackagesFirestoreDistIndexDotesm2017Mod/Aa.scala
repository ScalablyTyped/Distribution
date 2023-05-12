package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aa
  extends StObject
     with Ea {
  
  var cacheSizeBytes: Any
}
object Aa {
  
  inline def apply(
    cacheSizeBytes: Any,
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
  ): Aa = {
    val __obj = js.Dynamic.literal(cacheSizeBytes = cacheSizeBytes.asInstanceOf[js.Any], createGarbageCollectionScheduler = js.Any.fromFunction2(createGarbageCollectionScheduler), createIndexBackfillerScheduler = js.Any.fromFunction2(createIndexBackfillerScheduler), createLocalStore = js.Any.fromFunction1(createLocalStore), createPersistence = js.Any.fromFunction1(createPersistence), createSharedClientState = js.Any.fromFunction1(createSharedClientState), gcScheduler = gcScheduler.asInstanceOf[js.Any], indexBackfillerScheduler = indexBackfillerScheduler.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[Aa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aa] (val x: Self) extends AnyVal {
    
    inline def setCacheSizeBytes(value: Any): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
  }
}
