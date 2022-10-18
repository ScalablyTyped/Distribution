package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardsTotalStats extends StObject {
  
  var total_count: long
}
object IndicesStatsShardsTotalStats {
  
  inline def apply(total_count: long): IndicesStatsShardsTotalStats = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardsTotalStats]
  }
  
  extension [Self <: IndicesStatsShardsTotalStats](x: Self) {
    
    inline def setTotal_count(value: long): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
