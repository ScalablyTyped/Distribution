package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightRectRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  var paramsType: js.Array[HighlightRectRequest]
  
  var returnType: Unit
}
object `147` {
  
  inline def apply(paramsType: js.Array[HighlightRectRequest], returnType: Unit): `147` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`147`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `147`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[HighlightRectRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: HighlightRectRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
