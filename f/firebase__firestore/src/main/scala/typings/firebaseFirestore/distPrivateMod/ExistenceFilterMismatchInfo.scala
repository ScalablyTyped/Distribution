package typings.firebaseFirestore.distPrivateMod

import typings.firebaseFirestore.anon.Applied
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an existence filter mismatch, as specified to callbacks
  * registered with `TestingUtils.onExistenceFilterMismatch()`.
  */
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
