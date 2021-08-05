package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Cast.SetSinkToUseRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  var paramsType: js.Array[SetSinkToUseRequest]
  
  var returnType: Unit
}
object `46` {
  
  inline def apply(paramsType: js.Array[SetSinkToUseRequest], returnType: Unit): `46` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`46`]
  }
  
  extension [Self <: `46`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetSinkToUseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetSinkToUseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
