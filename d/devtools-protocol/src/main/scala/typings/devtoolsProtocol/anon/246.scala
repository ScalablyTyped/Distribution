package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetUserVerifiedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `246` extends StObject {
  
  var paramsType: js.Array[SetUserVerifiedRequest]
  
  var returnType: Unit
}
object `246` {
  
  inline def apply(paramsType: js.Array[SetUserVerifiedRequest], returnType: Unit): `246` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`246`]
  }
  
  extension [Self <: `246`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetUserVerifiedRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetUserVerifiedRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
