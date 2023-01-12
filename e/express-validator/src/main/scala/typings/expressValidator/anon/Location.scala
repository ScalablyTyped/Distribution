package typings.expressValidator.anon

import typings.expressValidator.expressValidatorStrings._error
import typings.expressValidator.srcBaseMod.ValidationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location
  extends StObject
     with ValidationError {
  
  var location: Unit
  
  var msg: Any
  
  var nestedErrors: js.Array[ValidationError]
  
  var param: _error
  
  var value: Unit
}
object Location {
  
  inline def apply(location: Unit, msg: Any, nestedErrors: js.Array[ValidationError], value: Unit): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = "_error", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Unit): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setNestedErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
    
    inline def setNestedErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "nestedErrors", js.Array(value*))
    
    inline def setParam(value: _error): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
