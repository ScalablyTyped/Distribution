package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslFieldLookup extends StObject {
  
  var id: Id
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var path: js.UndefOr[Field] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
}
object QueryDslFieldLookup {
  
  inline def apply(id: Id): QueryDslFieldLookup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslFieldLookup]
  }
  
  extension [Self <: QueryDslFieldLookup](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPath(value: Field): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
  }
}
