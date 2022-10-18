package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsStatsResponse extends StObject {
  
  var stats: Any
  
  var total: Any
}
object SearchableSnapshotsStatsResponse {
  
  inline def apply(stats: Any, total: Any): SearchableSnapshotsStatsResponse = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsStatsResponse]
  }
  
  extension [Self <: SearchableSnapshotsStatsResponse](x: Self) {
    
    inline def setStats(value: Any): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Any): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
