package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterIngest extends StObject {
  
  var number_of_pipelines: integer
  
  var processor_stats: Record[String, ClusterStatsClusterProcessor]
}
object ClusterStatsClusterIngest {
  
  inline def apply(number_of_pipelines: integer, processor_stats: Record[String, ClusterStatsClusterProcessor]): ClusterStatsClusterIngest = {
    val __obj = js.Dynamic.literal(number_of_pipelines = number_of_pipelines.asInstanceOf[js.Any], processor_stats = processor_stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterIngest]
  }
  
  extension [Self <: ClusterStatsClusterIngest](x: Self) {
    
    inline def setNumber_of_pipelines(value: integer): Self = StObject.set(x, "number_of_pipelines", value.asInstanceOf[js.Any])
    
    inline def setProcessor_stats(value: Record[String, ClusterStatsClusterProcessor]): Self = StObject.set(x, "processor_stats", value.asInstanceOf[js.Any])
  }
}
