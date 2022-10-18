package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesShardStoresIndicesShardStores extends StObject {
  
  var shards: Record[String, IndicesShardStoresShardStoreWrapper]
}
object IndicesShardStoresIndicesShardStores {
  
  inline def apply(shards: Record[String, IndicesShardStoresShardStoreWrapper]): IndicesShardStoresIndicesShardStores = {
    val __obj = js.Dynamic.literal(shards = shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShardStoresIndicesShardStores]
  }
  
  extension [Self <: IndicesShardStoresIndicesShardStores](x: Self) {
    
    inline def setShards(value: Record[String, IndicesShardStoresShardStoreWrapper]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
  }
}
