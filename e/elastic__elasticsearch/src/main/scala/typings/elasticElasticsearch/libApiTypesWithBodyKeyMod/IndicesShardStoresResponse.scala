package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesShardStoresResponse extends StObject {
  
  var indices: Record[IndexName, IndicesShardStoresIndicesShardStores]
}
object IndicesShardStoresResponse {
  
  inline def apply(indices: Record[IndexName, IndicesShardStoresIndicesShardStores]): IndicesShardStoresResponse = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShardStoresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesShardStoresResponse] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: Record[IndexName, IndicesShardStoresIndicesShardStores]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
  }
}
