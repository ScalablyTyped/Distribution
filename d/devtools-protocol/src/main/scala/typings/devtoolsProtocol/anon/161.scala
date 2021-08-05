package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetWebLifecycleStateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  var paramsType: js.Array[SetWebLifecycleStateRequest]
  
  var returnType: Unit
}
object `161` {
  
  inline def apply(paramsType: js.Array[SetWebLifecycleStateRequest], returnType: Unit): `161` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`161`]
  }
  
  extension [Self <: `161`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetWebLifecycleStateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetWebLifecycleStateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
