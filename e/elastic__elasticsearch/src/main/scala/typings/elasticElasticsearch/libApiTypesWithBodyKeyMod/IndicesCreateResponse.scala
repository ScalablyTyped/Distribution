package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesCreateResponse extends StObject {
  
  var acknowledged: Boolean
  
  var index: IndexName
  
  var shards_acknowledged: Boolean
}
object IndicesCreateResponse {
  
  inline def apply(acknowledged: Boolean, index: IndexName, shards_acknowledged: Boolean): IndicesCreateResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], shards_acknowledged = shards_acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCreateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesCreateResponse] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setShards_acknowledged(value: Boolean): Self = StObject.set(x, "shards_acknowledged", value.asInstanceOf[js.Any])
  }
}
