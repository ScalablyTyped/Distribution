package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightSourceOrderRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  var paramsType: js.Array[HighlightSourceOrderRequest]
  
  var returnType: Unit
}
object `148` {
  
  inline def apply(paramsType: js.Array[HighlightSourceOrderRequest], returnType: Unit): `148` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`148`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `148`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[HighlightSourceOrderRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: HighlightSourceOrderRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
