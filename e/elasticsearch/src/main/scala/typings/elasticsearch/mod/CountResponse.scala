package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountResponse extends StObject {
  
  var _shards: ShardsResponse = js.native
  
  var count: Double = js.native
}
object CountResponse {
  
  @scala.inline
  def apply(_shards: ShardsResponse, count: Double): CountResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountResponse]
  }
  
  @scala.inline
  implicit class CountResponseMutableBuilder[Self <: CountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_shards(value: ShardsResponse): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
