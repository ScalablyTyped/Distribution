package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterHealthRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var index: js.UndefOr[Indices] = js.undefined
  
  var level: js.UndefOr[Level] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_active_shards: js.UndefOr[WaitForActiveShards] = js.undefined
  
  var wait_for_events: js.UndefOr[WaitForEvents] = js.undefined
  
  var wait_for_no_initializing_shards: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_no_relocating_shards: js.UndefOr[Boolean] = js.undefined
  
  var wait_for_nodes: js.UndefOr[String | integer] = js.undefined
  
  var wait_for_status: js.UndefOr[HealthStatus] = js.undefined
}
object ClusterHealthRequest {
  
  inline def apply(): ClusterHealthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealthRequest]
  }
  
  extension [Self <: ClusterHealthRequest](x: Self) {
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_active_shards(value: WaitForActiveShards): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
    
    inline def setWait_for_events(value: WaitForEvents): Self = StObject.set(x, "wait_for_events", value.asInstanceOf[js.Any])
    
    inline def setWait_for_eventsUndefined: Self = StObject.set(x, "wait_for_events", js.undefined)
    
    inline def setWait_for_no_initializing_shards(value: Boolean): Self = StObject.set(x, "wait_for_no_initializing_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_no_initializing_shardsUndefined: Self = StObject.set(x, "wait_for_no_initializing_shards", js.undefined)
    
    inline def setWait_for_no_relocating_shards(value: Boolean): Self = StObject.set(x, "wait_for_no_relocating_shards", value.asInstanceOf[js.Any])
    
    inline def setWait_for_no_relocating_shardsUndefined: Self = StObject.set(x, "wait_for_no_relocating_shards", js.undefined)
    
    inline def setWait_for_nodes(value: String | integer): Self = StObject.set(x, "wait_for_nodes", value.asInstanceOf[js.Any])
    
    inline def setWait_for_nodesUndefined: Self = StObject.set(x, "wait_for_nodes", js.undefined)
    
    inline def setWait_for_status(value: HealthStatus): Self = StObject.set(x, "wait_for_status", value.asInstanceOf[js.Any])
    
    inline def setWait_for_statusUndefined: Self = StObject.set(x, "wait_for_status", js.undefined)
  }
}
