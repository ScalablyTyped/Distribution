package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainReservedSize extends StObject {
  
  var node_id: Id
  
  var path: String
  
  var shards: js.Array[String]
  
  var total: long
}
object ClusterAllocationExplainReservedSize {
  
  inline def apply(node_id: Id, path: String, shards: js.Array[String], total: long): ClusterAllocationExplainReservedSize = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainReservedSize]
  }
  
  extension [Self <: ClusterAllocationExplainReservedSize](x: Self) {
    
    inline def setNode_id(value: Id): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setShards(value: js.Array[String]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsVarargs(value: String*): Self = StObject.set(x, "shards", js.Array(value*))
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
