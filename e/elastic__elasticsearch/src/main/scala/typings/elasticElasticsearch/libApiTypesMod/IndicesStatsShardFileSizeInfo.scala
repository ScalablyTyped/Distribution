package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardFileSizeInfo extends StObject {
  
  var average_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var count: js.UndefOr[long] = js.undefined
  
  var description: String
  
  var max_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var min_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var size_in_bytes: long
}
object IndicesStatsShardFileSizeInfo {
  
  inline def apply(description: String, size_in_bytes: long): IndicesStatsShardFileSizeInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardFileSizeInfo]
  }
  
  extension [Self <: IndicesStatsShardFileSizeInfo](x: Self) {
    
    inline def setAverage_size_in_bytes(value: long): Self = StObject.set(x, "average_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setAverage_size_in_bytesUndefined: Self = StObject.set(x, "average_size_in_bytes", js.undefined)
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMax_size_in_bytes(value: long): Self = StObject.set(x, "max_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMax_size_in_bytesUndefined: Self = StObject.set(x, "max_size_in_bytes", js.undefined)
    
    inline def setMin_size_in_bytes(value: long): Self = StObject.set(x, "min_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMin_size_in_bytesUndefined: Self = StObject.set(x, "min_size_in_bytes", js.undefined)
    
    inline def setSize_in_bytes(value: long): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
  }
}
