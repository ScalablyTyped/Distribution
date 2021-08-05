package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterizedMessageObject extends StObject {
  
  var message: String
  
  var params: js.Array[js.Any]
}
object ParameterizedMessageObject {
  
  inline def apply(message: String, params: js.Array[js.Any]): ParameterizedMessageObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterizedMessageObject]
  }
  
  extension [Self <: ParameterizedMessageObject](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
  }
}
