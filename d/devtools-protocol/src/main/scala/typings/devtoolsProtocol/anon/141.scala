package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SetRequestInterceptionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  var paramsType: js.Array[SetRequestInterceptionRequest]
  
  var returnType: Unit
}
object `141` {
  
  inline def apply(paramsType: js.Array[SetRequestInterceptionRequest], returnType: Unit): `141` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`141`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `141`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetRequestInterceptionRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetRequestInterceptionRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
