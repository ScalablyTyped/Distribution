package typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod

import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.BloomFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecWatchFilter extends StObject {
  
  var bloomFilter: js.UndefOr[BloomFilter] = js.undefined
  
  var keys: js.Array[String]
  
  var targetIds: js.Array[TargetId]
}
object SpecWatchFilter {
  
  inline def apply(keys: js.Array[String], targetIds: js.Array[TargetId]): SpecWatchFilter = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecWatchFilter] (val x: Self) extends AnyVal {
    
    inline def setBloomFilter(value: BloomFilter): Self = StObject.set(x, "bloomFilter", value.asInstanceOf[js.Any])
    
    inline def setBloomFilterUndefined: Self = StObject.set(x, "bloomFilter", js.undefined)
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setTargetIds(value: js.Array[TargetId]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsVarargs(value: TargetId*): Self = StObject.set(x, "targetIds", js.Array(value*))
  }
}
