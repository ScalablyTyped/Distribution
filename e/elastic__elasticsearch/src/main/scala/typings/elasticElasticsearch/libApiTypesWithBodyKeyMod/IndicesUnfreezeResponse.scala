package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUnfreezeResponse extends StObject {
  
  var acknowledged: Boolean
  
  var shards_acknowledged: Boolean
}
object IndicesUnfreezeResponse {
  
  inline def apply(acknowledged: Boolean, shards_acknowledged: Boolean): IndicesUnfreezeResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], shards_acknowledged = shards_acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUnfreezeResponse]
  }
  
  extension [Self <: IndicesUnfreezeResponse](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setShards_acknowledged(value: Boolean): Self = StObject.set(x, "shards_acknowledged", value.asInstanceOf[js.Any])
  }
}
