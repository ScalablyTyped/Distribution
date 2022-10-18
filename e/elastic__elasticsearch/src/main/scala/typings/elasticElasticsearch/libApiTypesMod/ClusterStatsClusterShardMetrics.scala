package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterShardMetrics extends StObject {
  
  var avg: double
  
  var max: double
  
  var min: double
}
object ClusterStatsClusterShardMetrics {
  
  inline def apply(avg: double, max: double, min: double): ClusterStatsClusterShardMetrics = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterShardMetrics]
  }
  
  extension [Self <: ClusterStatsClusterShardMetrics](x: Self) {
    
    inline def setAvg(value: double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
