package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesShrinkResponse extends StObject {
  
  var acknowledged: Boolean
  
  var index: IndexName
  
  var shards_acknowledged: Boolean
}
object IndicesShrinkResponse {
  
  inline def apply(acknowledged: Boolean, index: IndexName, shards_acknowledged: Boolean): IndicesShrinkResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], shards_acknowledged = shards_acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShrinkResponse]
  }
  
  extension [Self <: IndicesShrinkResponse](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setShards_acknowledged(value: Boolean): Self = StObject.set(x, "shards_acknowledged", value.asInstanceOf[js.Any])
  }
}
