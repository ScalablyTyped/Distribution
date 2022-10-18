package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesBreaker extends StObject {
  
  var estimated_size: js.UndefOr[String] = js.undefined
  
  var estimated_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var limit_size: js.UndefOr[String] = js.undefined
  
  var limit_size_in_bytes: js.UndefOr[long] = js.undefined
  
  var overhead: js.UndefOr[float] = js.undefined
  
  var tripped: js.UndefOr[float] = js.undefined
}
object NodesBreaker {
  
  inline def apply(): NodesBreaker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesBreaker]
  }
  
  extension [Self <: NodesBreaker](x: Self) {
    
    inline def setEstimated_size(value: String): Self = StObject.set(x, "estimated_size", value.asInstanceOf[js.Any])
    
    inline def setEstimated_sizeUndefined: Self = StObject.set(x, "estimated_size", js.undefined)
    
    inline def setEstimated_size_in_bytes(value: long): Self = StObject.set(x, "estimated_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setEstimated_size_in_bytesUndefined: Self = StObject.set(x, "estimated_size_in_bytes", js.undefined)
    
    inline def setLimit_size(value: String): Self = StObject.set(x, "limit_size", value.asInstanceOf[js.Any])
    
    inline def setLimit_sizeUndefined: Self = StObject.set(x, "limit_size", js.undefined)
    
    inline def setLimit_size_in_bytes(value: long): Self = StObject.set(x, "limit_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setLimit_size_in_bytesUndefined: Self = StObject.set(x, "limit_size_in_bytes", js.undefined)
    
    inline def setOverhead(value: float): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    inline def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
    
    inline def setTripped(value: float): Self = StObject.set(x, "tripped", value.asInstanceOf[js.Any])
    
    inline def setTrippedUndefined: Self = StObject.set(x, "tripped", js.undefined)
  }
}
