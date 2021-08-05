package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountResponse extends StObject {
  
  var _shards: ShardsResponse
  
  var count: Double
}
object CountResponse {
  
  inline def apply(_shards: ShardsResponse, count: Double): CountResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountResponse]
  }
  
  extension [Self <: CountResponse](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardsResponse): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
