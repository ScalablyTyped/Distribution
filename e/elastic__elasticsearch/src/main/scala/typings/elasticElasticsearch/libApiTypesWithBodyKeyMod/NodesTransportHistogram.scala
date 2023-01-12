package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesTransportHistogram extends StObject {
  
  var count: js.UndefOr[long] = js.undefined
  
  var ge_millis: js.UndefOr[long] = js.undefined
  
  var lt_millis: js.UndefOr[long] = js.undefined
}
object NodesTransportHistogram {
  
  inline def apply(): NodesTransportHistogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesTransportHistogram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesTransportHistogram] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setGe_millis(value: long): Self = StObject.set(x, "ge_millis", value.asInstanceOf[js.Any])
    
    inline def setGe_millisUndefined: Self = StObject.set(x, "ge_millis", js.undefined)
    
    inline def setLt_millis(value: long): Self = StObject.set(x, "lt_millis", value.asInstanceOf[js.Any])
    
    inline def setLt_millisUndefined: Self = StObject.set(x, "lt_millis", js.undefined)
  }
}
