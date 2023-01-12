package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.HttpHeaders
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupFieldMetric
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGroupings
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cron extends StObject {
  
  var cron: String
  
  var groups: RollupGroupings
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var index_pattern: String
  
  var metrics: js.UndefOr[js.Array[RollupFieldMetric]] = js.undefined
  
  var page_size: integer
  
  var rollup_index: IndexName
  
  var timeout: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
}
object Cron {
  
  inline def apply(
    cron: String,
    groups: RollupGroupings,
    index_pattern: String,
    page_size: integer,
    rollup_index: IndexName
  ): Cron = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], index_pattern = index_pattern.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], rollup_index = rollup_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cron]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cron] (val x: Self) extends AnyVal {
    
    inline def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: RollupGroupings): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIndex_pattern(value: String): Self = StObject.set(x, "index_pattern", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: js.Array[RollupFieldMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: RollupFieldMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setPage_size(value: integer): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    inline def setRollup_index(value: IndexName): Self = StObject.set(x, "rollup_index", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
