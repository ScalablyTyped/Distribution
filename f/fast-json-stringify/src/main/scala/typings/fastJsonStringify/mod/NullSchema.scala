package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.`null`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullSchema
  extends StObject
     with BaseSchema
     with Schema {
  
  var `type`: `null`
}
object NullSchema {
  
  inline def apply(): NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[NullSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullSchema] (val x: Self) extends AnyVal {
    
    inline def setType(value: `null`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
