package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetUserVerifiedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `256` extends StObject {
  
  var paramsType: js.Array[SetUserVerifiedRequest]
  
  var returnType: Unit
}
object `256` {
  
  inline def apply(paramsType: js.Array[SetUserVerifiedRequest], returnType: Unit): `256` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`256`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `256`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetUserVerifiedRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetUserVerifiedRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
