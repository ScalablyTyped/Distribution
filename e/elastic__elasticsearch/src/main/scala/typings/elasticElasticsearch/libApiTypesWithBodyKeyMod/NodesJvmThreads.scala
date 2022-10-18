package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesJvmThreads extends StObject {
  
  var count: js.UndefOr[long] = js.undefined
  
  var peak_count: js.UndefOr[long] = js.undefined
}
object NodesJvmThreads {
  
  inline def apply(): NodesJvmThreads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesJvmThreads]
  }
  
  extension [Self <: NodesJvmThreads](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setPeak_count(value: long): Self = StObject.set(x, "peak_count", value.asInstanceOf[js.Any])
    
    inline def setPeak_countUndefined: Self = StObject.set(x, "peak_count", js.undefined)
  }
}
