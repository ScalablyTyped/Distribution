package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.cluster
import typings.elasticsearch.elasticsearchStrings.green
import typings.elasticsearch.elasticsearchStrings.high
import typings.elasticsearch.elasticsearchStrings.immediate
import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.languid
import typings.elasticsearch.elasticsearchStrings.low
import typings.elasticsearch.elasticsearchStrings.normal
import typings.elasticsearch.elasticsearchStrings.red
import typings.elasticsearch.elasticsearchStrings.shards
import typings.elasticsearch.elasticsearchStrings.urgent
import typings.elasticsearch.elasticsearchStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterHealthParams
  extends StObject
     with GenericParams {
  
  var index: js.UndefOr[NameList] = js.undefined
  
  var level: js.UndefOr[cluster | indices | shards] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var waitForActiveShards: js.UndefOr[String] = js.undefined
  
  var waitForEvents: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.undefined
  
  var waitForNodes: js.UndefOr[String] = js.undefined
  
  var waitForRelocatingShards: js.UndefOr[Boolean] = js.undefined
  
  var waitForStatus: js.UndefOr[green | yellow | red] = js.undefined
}
object ClusterHealthParams {
  
  @scala.inline
  def apply(): ClusterHealthParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealthParams]
  }
  
  @scala.inline
  implicit class ClusterHealthParamsMutableBuilder[Self <: ClusterHealthParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
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
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
    
    @scala.inline
    def setWaitForEvents(value: immediate | urgent | high | normal | low | languid): Self = StObject.set(x, "waitForEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForEventsUndefined: Self = StObject.set(x, "waitForEvents", js.undefined)
    
    @scala.inline
    def setWaitForNodes(value: String): Self = StObject.set(x, "waitForNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForNodesUndefined: Self = StObject.set(x, "waitForNodes", js.undefined)
    
    @scala.inline
    def setWaitForRelocatingShards(value: Boolean): Self = StObject.set(x, "waitForRelocatingShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForRelocatingShardsUndefined: Self = StObject.set(x, "waitForRelocatingShards", js.undefined)
    
    @scala.inline
    def setWaitForStatus(value: green | yellow | red): Self = StObject.set(x, "waitForStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForStatusUndefined: Self = StObject.set(x, "waitForStatus", js.undefined)
  }
}
