package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCompletionContext extends StObject {
  
  var boost: js.UndefOr[double] = js.undefined
  
  var context: SearchContext
  
  var neighbours: js.UndefOr[js.Array[GeoHashPrecision]] = js.undefined
  
  var precision: js.UndefOr[GeoHashPrecision] = js.undefined
  
  var prefix: js.UndefOr[Boolean] = js.undefined
}
object SearchCompletionContext {
  
  inline def apply(context: SearchContext): SearchCompletionContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCompletionContext]
  }
  
  extension [Self <: SearchCompletionContext](x: Self) {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setContext(value: SearchContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextVarargs(value: double*): Self = StObject.set(x, "context", js.Array(value*))
    
    inline def setNeighbours(value: js.Array[GeoHashPrecision]): Self = StObject.set(x, "neighbours", value.asInstanceOf[js.Any])
    
    inline def setNeighboursUndefined: Self = StObject.set(x, "neighbours", js.undefined)
    
    inline def setNeighboursVarargs(value: GeoHashPrecision*): Self = StObject.set(x, "neighbours", js.Array(value*))
    
    inline def setPrecision(value: GeoHashPrecision): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
