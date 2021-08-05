package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.ContinueInterceptedRequestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var paramsType: js.Array[ContinueInterceptedRequestRequest]
  
  var returnType: Unit
}
object `111` {
  
  inline def apply(paramsType: js.Array[ContinueInterceptedRequestRequest], returnType: Unit): `111` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  
  extension [Self <: `111`](x: Self) {
    
    inline def setParamsType(value: js.Array[ContinueInterceptedRequestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ContinueInterceptedRequestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
