package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowViewportSizeOnResizeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var paramsType: js.Array[SetShowViewportSizeOnResizeRequest]
  
  var returnType: Unit
}
object `163` {
  
  inline def apply(paramsType: js.Array[SetShowViewportSizeOnResizeRequest], returnType: Unit): `163` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`163`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `163`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowViewportSizeOnResizeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowViewportSizeOnResizeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
