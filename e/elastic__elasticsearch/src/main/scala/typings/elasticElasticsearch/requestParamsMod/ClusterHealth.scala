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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterHealth extends Generic {
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
  
  var level: js.UndefOr[cluster | indices | shards] = js.native
  
  var local: js.UndefOr[Boolean] = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var wait_for_active_shards: js.UndefOr[String] = js.native
  
  var wait_for_events: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.native
  
  var wait_for_no_initializing_shards: js.UndefOr[Boolean] = js.native
  
  var wait_for_no_relocating_shards: js.UndefOr[Boolean] = js.native
  
  var wait_for_nodes: js.UndefOr[String] = js.native
  
  var wait_for_status: js.UndefOr[green | yellow | red] = js.native
}
object ClusterHealth {
  
  @scala.inline
  def apply(): ClusterHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealth]
  }
  
  @scala.inline
  implicit class ClusterHealthMutableBuilder[Self <: ClusterHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: cluster | indices | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWait_for_active_shards(value: String): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
    
    @scala.inline
    def setWait_for_events(value: immediate | urgent | high | normal | low | languid): Self = StObject.set(x, "wait_for_events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_eventsUndefined: Self = StObject.set(x, "wait_for_events", js.undefined)
    
    @scala.inline
    def setWait_for_no_initializing_shards(value: Boolean): Self = StObject.set(x, "wait_for_no_initializing_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_no_initializing_shardsUndefined: Self = StObject.set(x, "wait_for_no_initializing_shards", js.undefined)
    
    @scala.inline
    def setWait_for_no_relocating_shards(value: Boolean): Self = StObject.set(x, "wait_for_no_relocating_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_no_relocating_shardsUndefined: Self = StObject.set(x, "wait_for_no_relocating_shards", js.undefined)
    
    @scala.inline
    def setWait_for_nodes(value: String): Self = StObject.set(x, "wait_for_nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_nodesUndefined: Self = StObject.set(x, "wait_for_nodes", js.undefined)
    
    @scala.inline
    def setWait_for_status(value: green | yellow | red): Self = StObject.set(x, "wait_for_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_statusUndefined: Self = StObject.set(x, "wait_for_status", js.undefined)
  }
}
