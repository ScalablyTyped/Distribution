package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowPaintRectsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `158` extends StObject {
  
  var paramsType: js.Array[SetShowPaintRectsRequest]
  
  var returnType: Unit
}
object `158` {
  
  inline def apply(paramsType: js.Array[SetShowPaintRectsRequest], returnType: Unit): `158` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`158`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `158`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowPaintRectsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowPaintRectsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
