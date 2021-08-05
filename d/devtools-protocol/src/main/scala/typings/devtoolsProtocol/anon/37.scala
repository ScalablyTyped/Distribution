package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.SetWindowBoundsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var paramsType: js.Array[SetWindowBoundsRequest]
  
  var returnType: Unit
}
object `37` {
  
  inline def apply(paramsType: js.Array[SetWindowBoundsRequest], returnType: Unit): `37` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetWindowBoundsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetWindowBoundsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
