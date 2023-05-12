package typings.firebaseFirestore

import typings.firebaseFirestore.anon.Applied
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcUtilTestingHooksMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/testing_hooks", "TestingHooks")
  @js.native
  /* private */ open class TestingHooks () extends StObject {
    
    /**
      * Invokes all currently-registered `onExistenceFilterMismatch` callbacks.
      * @param info Information about the existence filter mismatch.
      */
    def notifyOnExistenceFilterMismatch(info: ExistenceFilterMismatchInfo): Unit = js.native
    
    /**
      * Registers a callback to be notified when an existence filter mismatch
      * occurs in the Watch listen stream.
      *
      * The relative order in which callbacks are notified is unspecified; do not
      * rely on any particular ordering. If a given callback is registered multiple
      * times then it will be notified multiple times, once per registration.
      *
      * @param callback the callback to invoke upon existence filter mismatch.
      *
      * @return a function that, when called, unregisters the given callback; only
      * the first invocation of the returned function does anything; all subsequent
      * invocations do nothing.
      */
    def onExistenceFilterMismatch(callback: ExistenceFilterMismatchCallback): js.Function0[Unit] = js.native
    
    /* private */ val onExistenceFilterMismatchCallbacks: Any = js.native
  }
  /* static members */
  object TestingHooks {
    
    @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/testing_hooks", "TestingHooks")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the singleton instance of this class, creating it if is has never
      * been created before.
      */
    inline def getOrCreateInstance(): TestingHooks = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateInstance")().asInstanceOf[TestingHooks]
  }
  
  type ExistenceFilterMismatchCallback = js.Function1[/* info */ ExistenceFilterMismatchInfo, Unit]
  
  trait ExistenceFilterMismatchInfo extends StObject {
    
    /**
      * Information about the bloom filter provided by Watch in the ExistenceFilter
      * message's `unchangedNames` field. If this property is omitted or undefined
      * then that means that Watch did _not_ provide a bloom filter.
      */
    var bloomFilter: js.UndefOr[Applied] = js.undefined
    
    /**
      * The number of documents that matched the query on the server, as specified
      * in the ExistenceFilter message's `count` field.
      */
    var existenceFilterCount: Double
    
    /** The number of documents that matched the query in the local cache. */
    var localCacheCount: Double
  }
  object ExistenceFilterMismatchInfo {
    
    inline def apply(existenceFilterCount: Double, localCacheCount: Double): ExistenceFilterMismatchInfo = {
      val __obj = js.Dynamic.literal(existenceFilterCount = existenceFilterCount.asInstanceOf[js.Any], localCacheCount = localCacheCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExistenceFilterMismatchInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExistenceFilterMismatchInfo] (val x: Self) extends AnyVal {
      
      inline def setBloomFilter(value: Applied): Self = StObject.set(x, "bloomFilter", value.asInstanceOf[js.Any])
      
      inline def setBloomFilterUndefined: Self = StObject.set(x, "bloomFilter", js.undefined)
      
      inline def setExistenceFilterCount(value: Double): Self = StObject.set(x, "existenceFilterCount", value.asInstanceOf[js.Any])
      
      inline def setLocalCacheCount(value: Double): Self = StObject.set(x, "localCacheCount", value.asInstanceOf[js.Any])
    }
  }
}
