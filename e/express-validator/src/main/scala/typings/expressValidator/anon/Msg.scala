package typings.expressValidator.anon

import typings.expressValidator.baseMod.ValidationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Msg
  extends StObject
     with ValidationError {
  
  var location: typings.expressValidator.baseMod.Location
  
  var msg: Any
  
  var nestedErrors: js.UndefOr[js.Array[Any]] = js.undefined
  
  var param: String
  
  var value: Any
}
object Msg {
  
  inline def apply(location: typings.expressValidator.baseMod.Location, msg: Any, param: String, value: Any): Msg = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  
  extension [Self <: Msg](x: Self) {
    
    inline def setLocation(value: typings.expressValidator.baseMod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setNestedErrors(value: js.Array[Any]): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
    
    inline def setNestedErrorsUndefined: Self = StObject.set(x, "nestedErrors", js.undefined)
    
    inline def setNestedErrorsVarargs(value: Any*): Self = StObject.set(x, "nestedErrors", js.Array(value*))
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
