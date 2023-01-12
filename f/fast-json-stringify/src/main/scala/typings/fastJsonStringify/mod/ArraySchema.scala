package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySchema
  extends StObject
     with BaseSchema
     with Schema {
  
  /**
    * The schema for the items in the array
    */
  var items: Schema | js.Object
  
  var `type`: array
}
object ArraySchema {
  
  inline def apply(items: Schema | js.Object): ArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ArraySchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArraySchema] (val x: Self) extends AnyVal {
    
    inline def setItems(value: Schema | js.Object): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
