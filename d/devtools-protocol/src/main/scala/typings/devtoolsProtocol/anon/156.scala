package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowScrollSnapOverlaysRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `156` extends StObject {
  
  var paramsType: js.Array[SetShowScrollSnapOverlaysRequest]
  
  var returnType: Unit
}
object `156` {
  
  inline def apply(paramsType: js.Array[SetShowScrollSnapOverlaysRequest], returnType: Unit): `156` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`156`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `156`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowScrollSnapOverlaysRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowScrollSnapOverlaysRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
