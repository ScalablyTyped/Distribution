package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Additems extends StObject {
  
  var add_items: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var remove_items: js.UndefOr[js.Array[String]] = js.undefined
}
object Additems {
  
  inline def apply(): Additems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Additems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Additems] (val x: Self) extends AnyVal {
    
    inline def setAdd_items(value: js.Array[String]): Self = StObject.set(x, "add_items", value.asInstanceOf[js.Any])
    
    inline def setAdd_itemsUndefined: Self = StObject.set(x, "add_items", js.undefined)
    
    inline def setAdd_itemsVarargs(value: String*): Self = StObject.set(x, "add_items", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRemove_items(value: js.Array[String]): Self = StObject.set(x, "remove_items", value.asInstanceOf[js.Any])
    
    inline def setRemove_itemsUndefined: Self = StObject.set(x, "remove_items", js.undefined)
    
    inline def setRemove_itemsVarargs(value: String*): Self = StObject.set(x, "remove_items", js.Array(value*))
  }
}
