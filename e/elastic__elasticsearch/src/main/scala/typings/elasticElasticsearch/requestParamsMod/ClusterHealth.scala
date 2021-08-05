package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.cluster
import typings.elasticElasticsearch.elasticElasticsearchStrings.green
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.high
import typings.elasticElasticsearch.elasticElasticsearchStrings.immediate
import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.languid
import typings.elasticElasticsearch.elasticElasticsearchStrings.low
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.normal
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.red
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import typings.elasticElasticsearch.elasticElasticsearchStrings.urgent
import typings.elasticElasticsearch.elasticElasticsearchStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterHealth
  extends StObject
     with Generic {
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var level: js.UndefOr[cluster | indices | shards] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
  
  var wait_for_events: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.undefined
  
  var wait_for_no_initializing_shards: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_no_relocating_shards: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_nodes: js.UndefOr[String] = js.undefined
  
  var wait_for_status: js.UndefOr[green | yellow | red] = js.undefined
}
object ClusterHealth {
  
  inline def apply(): ClusterHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealth]
  }
  
  extension [Self <: ClusterHealth](x: Self) {
    
    inline def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    inline def setLevel(value: cluster | indices | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_active_shards(value: String): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
    
    inline def setWait_for_events(value: immediate | urgent | high | normal | low | languid): Self = StObject.set(x, "wait_for_events", value.asInstanceOf[js.Any])
    
    inline def setWait_for_eventsUndefined: Self = StObject.set(x, "wait_for_events", js.undefined)
    
    inline def setWait_for_no_initializing_shards(value: Boolean): Self = StObject.set(x, "wait_for_no_initializing_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_no_initializing_shardsUndefined: Self = StObject.set(x, "wait_for_no_initializing_shards", js.undefined)
    
    inline def setWait_for_no_relocating_shards(value: Boolean): Self = StObject.set(x, "wait_for_no_relocating_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_no_relocating_shardsUndefined: Self = StObject.set(x, "wait_for_no_relocating_shards", js.undefined)
    
    inline def setWait_for_nodes(value: String): Self = StObject.set(x, "wait_for_nodes", value.asInstanceOf[js.Any])
    
    inline def setWait_for_nodesUndefined: Self = StObject.set(x, "wait_for_nodes", js.undefined)
    
    inline def setWait_for_status(value: green | yellow | red): Self = StObject.set(x, "wait_for_status", value.asInstanceOf[js.Any])
    
    inline def setWait_for_statusUndefined: Self = StObject.set(x, "wait_for_status", js.undefined)
  }
}
