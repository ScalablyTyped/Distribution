package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexRoutingAllocationInclude extends StObject {
  
  var _id: js.UndefOr[Id] = js.undefined
  
  var _tier_preference: js.UndefOr[String] = js.undefined
}
object IndicesIndexRoutingAllocationInclude {
  
  inline def apply(): IndicesIndexRoutingAllocationInclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexRoutingAllocationInclude]
  }
  
  extension [Self <: IndicesIndexRoutingAllocationInclude](x: Self) {
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    inline def set_tier_preference(value: String): Self = StObject.set(x, "_tier_preference", value.asInstanceOf[js.Any])
    
    inline def set_tier_preferenceUndefined: Self = StObject.set(x, "_tier_preference", js.undefined)
  }
}
