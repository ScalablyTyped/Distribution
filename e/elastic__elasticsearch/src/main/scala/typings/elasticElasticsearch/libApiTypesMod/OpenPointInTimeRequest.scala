package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenPointInTimeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: Indices
  
  var keep_alive: Duration
}
object OpenPointInTimeRequest {
  
  inline def apply(index: Indices, keep_alive: Duration): OpenPointInTimeRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], keep_alive = keep_alive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenPointInTimeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenPointInTimeRequest] (val x: Self) extends AnyVal {
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setKeep_alive(value: Duration): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
  }
}
