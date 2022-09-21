package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchStatistics extends StObject {
  
  /**
    * When index_usage_mode is UNUSED or PARTIALLY_USED, this field explains why index was not used in all or part of the search query. If index_usage_mode is FULLLY_USED, this field is not populated.
    */
  var indexUnusedReason: js.UndefOr[js.Array[SchemaIndexUnusedReason]] = js.undefined
  
  /**
    * Specifies index usage mode for the query.
    */
  var indexUsageMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchStatistics {
  
  inline def apply(): SchemaSearchStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchStatistics]
  }
  
  extension [Self <: SchemaSearchStatistics](x: Self) {
    
    inline def setIndexUnusedReason(value: js.Array[SchemaIndexUnusedReason]): Self = StObject.set(x, "indexUnusedReason", value.asInstanceOf[js.Any])
    
    inline def setIndexUnusedReasonUndefined: Self = StObject.set(x, "indexUnusedReason", js.undefined)
    
    inline def setIndexUnusedReasonVarargs(value: SchemaIndexUnusedReason*): Self = StObject.set(x, "indexUnusedReason", js.Array(value*))
    
    inline def setIndexUsageMode(value: String): Self = StObject.set(x, "indexUsageMode", value.asInstanceOf[js.Any])
    
    inline def setIndexUsageModeNull: Self = StObject.set(x, "indexUsageMode", null)
    
    inline def setIndexUsageModeUndefined: Self = StObject.set(x, "indexUsageMode", js.undefined)
  }
}
