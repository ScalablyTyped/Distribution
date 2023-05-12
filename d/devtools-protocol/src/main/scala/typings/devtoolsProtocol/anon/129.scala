package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.DeleteCookiesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var paramsType: js.Array[DeleteCookiesRequest]
  
  var returnType: Unit
}
object `129` {
  
  inline def apply(paramsType: js.Array[DeleteCookiesRequest], returnType: Unit): `129` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `129`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DeleteCookiesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteCookiesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
