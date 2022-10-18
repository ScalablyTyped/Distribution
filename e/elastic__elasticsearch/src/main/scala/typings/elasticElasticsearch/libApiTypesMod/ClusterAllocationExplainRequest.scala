package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var current_node: js.UndefOr[String] = js.undefined
  
  var include_disk_info: js.UndefOr[Boolean] = js.undefined
  
  var include_yes_decisions: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
  
  var shard: js.UndefOr[integer] = js.undefined
}
object ClusterAllocationExplainRequest {
  
  inline def apply(): ClusterAllocationExplainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAllocationExplainRequest]
  }
  
  extension [Self <: ClusterAllocationExplainRequest](x: Self) {
    
    inline def setCurrent_node(value: String): Self = StObject.set(x, "current_node", value.asInstanceOf[js.Any])
    
    inline def setCurrent_nodeUndefined: Self = StObject.set(x, "current_node", js.undefined)
    
    inline def setInclude_disk_info(value: Boolean): Self = StObject.set(x, "include_disk_info", value.asInstanceOf[js.Any])
    
    inline def setInclude_disk_infoUndefined: Self = StObject.set(x, "include_disk_info", js.undefined)
    
    inline def setInclude_yes_decisions(value: Boolean): Self = StObject.set(x, "include_yes_decisions", value.asInstanceOf[js.Any])
    
    inline def setInclude_yes_decisionsUndefined: Self = StObject.set(x, "include_yes_decisions", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setShard(value: integer): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
  }
}
