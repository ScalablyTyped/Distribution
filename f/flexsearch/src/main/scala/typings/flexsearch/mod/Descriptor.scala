package typings.flexsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptor[T, Store /* <: StoreOption */] extends StObject {
  
  var field: js.Array[(IndexOptions[T, Store]) | String]
  
  var id: String | Double
}
object Descriptor {
  
  inline def apply[T, Store /* <: StoreOption */](field: js.Array[(IndexOptions[T, Store]) | String], id: String | Double): Descriptor[T, Store] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptor[T, Store]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Descriptor[?, ?], T, Store /* <: StoreOption */] (val x: Self & (Descriptor[T, Store])) extends AnyVal {
    
    inline def setField(value: js.Array[(IndexOptions[T, Store]) | String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldVarargs(value: ((IndexOptions[T, Store]) | String)*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
