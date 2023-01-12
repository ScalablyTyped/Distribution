package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesShardStoresShardStoreException extends StObject {
  
  var reason: String
  
  var `type`: String
}
object IndicesShardStoresShardStoreException {
  
  inline def apply(reason: String, `type`: String): IndicesShardStoresShardStoreException = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShardStoresShardStoreException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesShardStoresShardStoreException] (val x: Self) extends AnyVal {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
