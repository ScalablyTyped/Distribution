package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetResponseOverrideBitsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `238` extends StObject {
  
  var paramsType: js.Array[SetResponseOverrideBitsRequest]
  
  var returnType: Unit
}
object `238` {
  
  inline def apply(paramsType: js.Array[SetResponseOverrideBitsRequest], returnType: Unit): `238` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`238`]
  }
  
  extension [Self <: `238`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetResponseOverrideBitsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetResponseOverrideBitsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
