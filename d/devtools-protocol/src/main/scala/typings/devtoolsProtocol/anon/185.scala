package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetWebLifecycleStateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `185` extends StObject {
  
  var paramsType: js.Array[SetWebLifecycleStateRequest]
  
  var returnType: Unit
}
object `185` {
  
  inline def apply(paramsType: js.Array[SetWebLifecycleStateRequest], returnType: Unit): `185` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`185`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `185`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetWebLifecycleStateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetWebLifecycleStateRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
