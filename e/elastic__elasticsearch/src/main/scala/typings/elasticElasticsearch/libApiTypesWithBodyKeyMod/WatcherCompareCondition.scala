package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherCompareCondition extends StObject {
  
  var comparison: js.UndefOr[String] = js.undefined
  
  @JSName("ctx.payload.match")
  var ctxDotpayloadDotmatch: js.UndefOr[WatcherCompareContextPayloadCondition] = js.undefined
  
  @JSName("ctx.payload.value")
  var ctxDotpayloadDotvalue: js.UndefOr[WatcherCompareContextPayloadCondition] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object WatcherCompareCondition {
  
  inline def apply(): WatcherCompareCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherCompareCondition]
  }
  
  extension [Self <: WatcherCompareCondition](x: Self) {
    
    inline def setComparison(value: String): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    inline def setComparisonUndefined: Self = StObject.set(x, "comparison", js.undefined)
    
    inline def setCtxDotpayloadDotmatch(value: WatcherCompareContextPayloadCondition): Self = StObject.set(x, "ctx.payload.match", value.asInstanceOf[js.Any])
    
    inline def setCtxDotpayloadDotmatchUndefined: Self = StObject.set(x, "ctx.payload.match", js.undefined)
    
    inline def setCtxDotpayloadDotvalue(value: WatcherCompareContextPayloadCondition): Self = StObject.set(x, "ctx.payload.value", value.asInstanceOf[js.Any])
    
    inline def setCtxDotpayloadDotvalueUndefined: Self = StObject.set(x, "ctx.payload.value", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
