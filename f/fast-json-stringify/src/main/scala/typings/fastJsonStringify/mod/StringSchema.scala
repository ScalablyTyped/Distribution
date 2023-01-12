package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringSchema
  extends StObject
     with BaseSchema
     with Schema {
  
  var format: js.UndefOr[String] = js.undefined
  
  var `type`: string
}
object StringSchema {
  
  inline def apply(): StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringSchema] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
