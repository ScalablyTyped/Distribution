package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesContext extends StObject {
  
  var cache_evictions: js.UndefOr[long] = js.undefined
  
  var compilation_limit_triggered: js.UndefOr[long] = js.undefined
  
  var compilations: js.UndefOr[long] = js.undefined
  
  var context: js.UndefOr[String] = js.undefined
}
object NodesContext {
  
  inline def apply(): NodesContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesContext]
  }
  
  extension [Self <: NodesContext](x: Self) {
    
    inline def setCache_evictions(value: long): Self = StObject.set(x, "cache_evictions", value.asInstanceOf[js.Any])
    
    inline def setCache_evictionsUndefined: Self = StObject.set(x, "cache_evictions", js.undefined)
    
    inline def setCompilation_limit_triggered(value: long): Self = StObject.set(x, "compilation_limit_triggered", value.asInstanceOf[js.Any])
    
    inline def setCompilation_limit_triggeredUndefined: Self = StObject.set(x, "compilation_limit_triggered", js.undefined)
    
    inline def setCompilations(value: long): Self = StObject.set(x, "compilations", value.asInstanceOf[js.Any])
    
    inline def setCompilationsUndefined: Self = StObject.set(x, "compilations", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
