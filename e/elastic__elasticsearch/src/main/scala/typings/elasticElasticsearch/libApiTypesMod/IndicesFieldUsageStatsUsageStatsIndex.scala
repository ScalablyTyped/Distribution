package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesFieldUsageStatsUsageStatsIndex extends StObject {
  
  var shards: js.Array[IndicesFieldUsageStatsUsageStatsShards]
}
object IndicesFieldUsageStatsUsageStatsIndex {
  
  inline def apply(shards: js.Array[IndicesFieldUsageStatsUsageStatsShards]): IndicesFieldUsageStatsUsageStatsIndex = {
    val __obj = js.Dynamic.literal(shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFieldUsageStatsUsageStatsIndex]
  }
  
  extension [Self <: IndicesFieldUsageStatsUsageStatsIndex](x: Self) {
    
    inline def setShards(value: js.Array[IndicesFieldUsageStatsUsageStatsShards]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsVarargs(value: IndicesFieldUsageStatsUsageStatsShards*): Self = StObject.set(x, "shards", js.Array(value*))
  }
}
