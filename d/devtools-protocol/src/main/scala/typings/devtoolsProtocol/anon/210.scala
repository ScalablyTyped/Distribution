package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.ClearCredentialsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `210` extends StObject {
  
  var paramsType: js.Array[ClearCredentialsRequest]
  
  var returnType: Unit
}
object `210` {
  
  inline def apply(paramsType: js.Array[ClearCredentialsRequest], returnType: Unit): `210` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`210`]
  }
  
  extension [Self <: `210`](x: Self) {
    
    inline def setParamsType(value: js.Array[ClearCredentialsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ClearCredentialsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
