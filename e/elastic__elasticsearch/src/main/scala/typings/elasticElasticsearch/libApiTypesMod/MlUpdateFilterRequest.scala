package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateFilterRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var add_items: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var filter_id: Id
  
  var remove_items: js.UndefOr[js.Array[String]] = js.undefined
}
object MlUpdateFilterRequest {
  
  inline def apply(filter_id: Id): MlUpdateFilterRequest = {
    val __obj = js.Dynamic.literal(filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateFilterRequest]
  }
  
  extension [Self <: MlUpdateFilterRequest](x: Self) {
    
    inline def setAdd_items(value: js.Array[String]): Self = StObject.set(x, "add_items", value.asInstanceOf[js.Any])
    
    inline def setAdd_itemsUndefined: Self = StObject.set(x, "add_items", js.undefined)
    
    inline def setAdd_itemsVarargs(value: String*): Self = StObject.set(x, "add_items", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilter_id(value: Id): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
    
    inline def setRemove_items(value: js.Array[String]): Self = StObject.set(x, "remove_items", value.asInstanceOf[js.Any])
    
    inline def setRemove_itemsUndefined: Self = StObject.set(x, "remove_items", js.undefined)
    
    inline def setRemove_itemsVarargs(value: String*): Self = StObject.set(x, "remove_items", js.Array(value*))
  }
}
