package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeValueRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  var paramsType: js.Array[SetNodeValueRequest]
  
  var returnType: Unit
}
object `68` {
  
  inline def apply(paramsType: js.Array[SetNodeValueRequest], returnType: Unit): `68` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`68`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `68`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetNodeValueRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetNodeValueRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
