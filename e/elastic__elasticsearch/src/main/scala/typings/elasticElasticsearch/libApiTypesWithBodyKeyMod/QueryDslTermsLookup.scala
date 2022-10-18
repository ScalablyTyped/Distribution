package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslTermsLookup extends StObject {
  
  var id: Id
  
  var index: IndexName
  
  var path: Field
  
  var routing: js.UndefOr[Routing] = js.undefined
}
object QueryDslTermsLookup {
  
  inline def apply(id: Id, index: IndexName, path: Field): QueryDslTermsLookup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslTermsLookup]
  }
  
  extension [Self <: QueryDslTermsLookup](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Field): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
  }
}
