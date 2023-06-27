package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.SynthesizePinchGestureRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  var paramsType: js.Array[SynthesizePinchGestureRequest]
  
  var returnType: Unit
}
object `121` {
  
  inline def apply(paramsType: js.Array[SynthesizePinchGestureRequest], returnType: Unit): `121` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `121`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SynthesizePinchGestureRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SynthesizePinchGestureRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
