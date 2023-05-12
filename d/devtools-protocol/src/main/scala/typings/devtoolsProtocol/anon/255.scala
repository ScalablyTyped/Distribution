package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DeviceAccess.SelectPromptRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `255` extends StObject {
  
  var paramsType: js.Array[SelectPromptRequest]
  
  var returnType: Unit
}
object `255` {
  
  inline def apply(paramsType: js.Array[SelectPromptRequest], returnType: Unit): `255` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`255`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `255`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SelectPromptRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SelectPromptRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
