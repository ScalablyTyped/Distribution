package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesScripting extends StObject {
  
  var cache_evictions: js.UndefOr[long] = js.undefined
  
  var compilation_limit_triggered: js.UndefOr[long] = js.undefined
  
  var compilations: js.UndefOr[long] = js.undefined
  
  var contexts: js.UndefOr[js.Array[NodesContext]] = js.undefined
}
object NodesScripting {
  
  inline def apply(): NodesScripting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesScripting]
  }
  
  extension [Self <: NodesScripting](x: Self) {
    
    inline def setCache_evictions(value: long): Self = StObject.set(x, "cache_evictions", value.asInstanceOf[js.Any])
    
    inline def setCache_evictionsUndefined: Self = StObject.set(x, "cache_evictions", js.undefined)
    
    inline def setCompilation_limit_triggered(value: long): Self = StObject.set(x, "compilation_limit_triggered", value.asInstanceOf[js.Any])
    
    inline def setCompilation_limit_triggeredUndefined: Self = StObject.set(x, "compilation_limit_triggered", js.undefined)
    
    inline def setCompilations(value: long): Self = StObject.set(x, "compilations", value.asInstanceOf[js.Any])
    
    inline def setCompilationsUndefined: Self = StObject.set(x, "compilations", js.undefined)
    
    inline def setContexts(value: js.Array[NodesContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: NodesContext*): Self = StObject.set(x, "contexts", js.Array(value*))
  }
}
