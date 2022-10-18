package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetJobsRollupJobConfiguration extends StObject {
  
  var cron: String
  
  var groups: RollupGroupings
  
  var id: Id
  
  var index_pattern: String
  
  var metrics: js.Array[RollupFieldMetric]
  
  var page_size: long
  
  var rollup_index: IndexName
  
  var timeout: Duration
}
object RollupGetJobsRollupJobConfiguration {
  
  inline def apply(
    cron: String,
    groups: RollupGroupings,
    id: Id,
    index_pattern: String,
    metrics: js.Array[RollupFieldMetric],
    page_size: long,
    rollup_index: IndexName,
    timeout: Duration
  ): RollupGetJobsRollupJobConfiguration = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index_pattern = index_pattern.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], rollup_index = rollup_index.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetJobsRollupJobConfiguration]
  }
  
  extension [Self <: RollupGetJobsRollupJobConfiguration](x: Self) {
    
    inline def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: RollupGroupings): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex_pattern(value: String): Self = StObject.set(x, "index_pattern", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: js.Array[RollupFieldMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsVarargs(value: RollupFieldMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setPage_size(value: long): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    inline def setRollup_index(value: IndexName): Self = StObject.set(x, "rollup_index", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
