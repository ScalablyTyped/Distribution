package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanSchema
  extends StObject
     with BaseSchema
     with Schema {
  
  var `type`: boolean
}
object BooleanSchema {
  
  inline def apply(): BooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[BooleanSchema]
  }
  
  extension [Self <: BooleanSchema](x: Self) {
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
