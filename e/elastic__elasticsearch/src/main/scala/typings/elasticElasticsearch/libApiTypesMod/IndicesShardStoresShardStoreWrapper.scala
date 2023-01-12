package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesShardStoresShardStoreWrapper extends StObject {
  
  var stores: js.Array[IndicesShardStoresShardStore]
}
object IndicesShardStoresShardStoreWrapper {
  
  inline def apply(stores: js.Array[IndicesShardStoresShardStore]): IndicesShardStoresShardStoreWrapper = {
    val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShardStoresShardStoreWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesShardStoresShardStoreWrapper] (val x: Self) extends AnyVal {
    
    inline def setStores(value: js.Array[IndicesShardStoresShardStore]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    
    inline def setStoresVarargs(value: IndicesShardStoresShardStore*): Self = StObject.set(x, "stores", js.Array(value*))
  }
}
