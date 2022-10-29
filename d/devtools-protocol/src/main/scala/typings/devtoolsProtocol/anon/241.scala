package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.ClearCredentialsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `241` extends StObject {
  
  var paramsType: js.Array[ClearCredentialsRequest]
  
  var returnType: Unit
}
object `241` {
  
  inline def apply(paramsType: js.Array[ClearCredentialsRequest], returnType: Unit): `241` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`241`]
  }
  
  extension [Self <: `241`](x: Self) {
    
    inline def setParamsType(value: js.Array[ClearCredentialsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ClearCredentialsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
