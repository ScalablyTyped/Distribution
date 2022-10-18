package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAddBlockResponse extends StObject {
  
  var acknowledged: Boolean
  
  var indices: js.Array[IndicesAddBlockIndicesBlockStatus]
  
  var shards_acknowledged: Boolean
}
object IndicesAddBlockResponse {
  
  inline def apply(
    acknowledged: Boolean,
    indices: js.Array[IndicesAddBlockIndicesBlockStatus],
    shards_acknowledged: Boolean
  ): IndicesAddBlockResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], shards_acknowledged = shards_acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAddBlockResponse]
  }
  
  extension [Self <: IndicesAddBlockResponse](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[IndicesAddBlockIndicesBlockStatus]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndicesAddBlockIndicesBlockStatus*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setShards_acknowledged(value: Boolean): Self = StObject.set(x, "shards_acknowledged", value.asInstanceOf[js.Any])
  }
}
