package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DeviceAccess.CancelPromptRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `259` extends StObject {
  
  var paramsType: js.Array[CancelPromptRequest]
  
  var returnType: Unit
}
object `259` {
  
  inline def apply(paramsType: js.Array[CancelPromptRequest], returnType: Unit): `259` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`259`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `259`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[CancelPromptRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CancelPromptRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
