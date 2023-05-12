package typings.expressValidator.anon

import typings.expressValidator.expressValidatorStrings.unknown_fields
import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcBaseMod.UnknownFieldInstance
import typings.expressValidator.srcContextMod.AddErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields
  extends StObject
     with AddErrorOptions {
  
  var fields: js.Array[UnknownFieldInstance]
  
  var message: js.UndefOr[Any] = js.undefined
  
  var req: Request
  
  var `type`: unknown_fields
}
object Fields {
  
  inline def apply(fields: js.Array[UnknownFieldInstance], req: Request): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unknown_fields")
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[UnknownFieldInstance]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: UnknownFieldInstance*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setType(value: unknown_fields): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
