package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherCompareContextPayloadCondition extends StObject {
  
  @JSName("eq")
  var eq_FWatcherCompareContextPayloadCondition: js.UndefOr[Any] = js.undefined
  
  var gt: js.UndefOr[Any] = js.undefined
  
  var gte: js.UndefOr[Any] = js.undefined
  
  var lt: js.UndefOr[Any] = js.undefined
  
  var lte: js.UndefOr[Any] = js.undefined
}
object WatcherCompareContextPayloadCondition {
  
  inline def apply(): WatcherCompareContextPayloadCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherCompareContextPayloadCondition]
  }
  
  extension [Self <: WatcherCompareContextPayloadCondition](x: Self) {
    
    inline def setEq_(value: Any): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    inline def setGt(value: Any): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setGte(value: Any): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    inline def setLt(value: Any): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setLte(value: Any): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
  }
}
