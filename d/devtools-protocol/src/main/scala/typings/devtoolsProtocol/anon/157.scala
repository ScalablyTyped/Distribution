package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowScrollBottleneckRectsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  var paramsType: js.Array[SetShowScrollBottleneckRectsRequest]
  
  var returnType: Unit
}
object `157` {
  
  inline def apply(paramsType: js.Array[SetShowScrollBottleneckRectsRequest], returnType: Unit): `157` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`157`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `157`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowScrollBottleneckRectsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowScrollBottleneckRectsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
