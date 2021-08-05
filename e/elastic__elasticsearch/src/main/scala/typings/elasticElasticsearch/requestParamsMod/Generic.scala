package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Generic extends StObject {
  
  var error_trace: js.UndefOr[Boolean] = js.undefined
  
  var filter_path: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var human: js.UndefOr[Boolean] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var pretty: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object Generic {
  
  inline def apply(): Generic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generic]
  }
  
  extension [Self <: Generic](x: Self) {
    
    inline def setError_trace(value: Boolean): Self = StObject.set(x, "error_trace", value.asInstanceOf[js.Any])
    
    inline def setError_traceUndefined: Self = StObject.set(x, "error_trace", js.undefined)
    
    inline def setFilter_path(value: String | js.Array[String]): Self = StObject.set(x, "filter_path", value.asInstanceOf[js.Any])
    
    inline def setFilter_pathUndefined: Self = StObject.set(x, "filter_path", js.undefined)
    
    inline def setFilter_pathVarargs(value: String*): Self = StObject.set(x, "filter_path", js.Array(value :_*))
    
    inline def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
