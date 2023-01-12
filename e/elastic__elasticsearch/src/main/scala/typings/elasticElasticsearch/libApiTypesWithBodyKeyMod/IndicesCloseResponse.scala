package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesCloseResponse extends StObject {
  
  var acknowledged: Boolean
  
  var indices: Record[IndexName, IndicesCloseCloseIndexResult]
  
  var shards_acknowledged: Boolean
}
object IndicesCloseResponse {
  
  inline def apply(
    acknowledged: Boolean,
    indices: Record[IndexName, IndicesCloseCloseIndexResult],
    shards_acknowledged: Boolean
  ): IndicesCloseResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], shards_acknowledged = shards_acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCloseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesCloseResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: Record[IndexName, IndicesCloseCloseIndexResult]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setShards_acknowledged(value: Boolean): Self = StObject.set(x, "shards_acknowledged", value.asInstanceOf[js.Any])
  }
}
