package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlFilter extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var filter_id: Id
  
  var items: js.Array[String]
}
object MlFilter {
  
  inline def apply(filter_id: Id, items: js.Array[String]): MlFilter = {
    val __obj = js.Dynamic.literal(filter_id = filter_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlFilter] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilter_id(value: Id): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
