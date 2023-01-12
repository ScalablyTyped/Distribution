package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleSchema
  extends StObject
     with BaseSchema
     with Schema {
  
  /**
    * The schemas for the items in the tuple
    */
  var items: js.Array[Schema]
  
  var `type`: array
}
object TupleSchema {
  
  inline def apply(items: js.Array[Schema]): TupleSchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[TupleSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TupleSchema] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Schema]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Schema*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
