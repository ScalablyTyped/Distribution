package typings.firebaseFirestore

import typings.firebaseFirestore.anon.Applied
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreTestIntegrationUtilTestingHooksUtilMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/integration/util/testing_hooks_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def captureExistenceFilterMismatches[T](callback: js.Function0[js.Promise[T]]): js.Promise[js.Tuple2[js.Array[ExistenceFilterMismatchInfo], T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureExistenceFilterMismatches")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[js.Array[ExistenceFilterMismatchInfo], T]]]
  
  trait ExistenceFilterMismatchInfo extends StObject {
    
    var bloomFilter: js.UndefOr[Applied] = js.undefined
    
    var existenceFilterCount: Double
    
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
