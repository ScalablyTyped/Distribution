package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.SendMessageToTargetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `235` extends StObject {
  
  var paramsType: js.Array[SendMessageToTargetRequest]
  
  var returnType: Unit
}
object `235` {
  
  inline def apply(paramsType: js.Array[SendMessageToTargetRequest], returnType: Unit): `235` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`235`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `235`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SendMessageToTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SendMessageToTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
