package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SetCookiesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  var paramsType: js.Array[SetCookiesRequest]
  
  var returnType: Unit
}
object `138` {
  
  inline def apply(paramsType: js.Array[SetCookiesRequest], returnType: Unit): `138` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`138`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `138`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetCookiesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetCookiesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
