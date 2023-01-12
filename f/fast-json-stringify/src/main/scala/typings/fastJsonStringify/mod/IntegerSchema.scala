package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerSchema
  extends StObject
     with BaseSchema
     with Schema {
  
  var `type`: integer
}
object IntegerSchema {
  
  inline def apply(): IntegerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[IntegerSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerSchema] (val x: Self) extends AnyVal {
    
    inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
