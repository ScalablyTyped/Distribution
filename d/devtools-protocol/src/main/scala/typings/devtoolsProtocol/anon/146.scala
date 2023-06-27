package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightQuadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  var paramsType: js.Array[HighlightQuadRequest]
  
  var returnType: Unit
}
object `146` {
  
  inline def apply(paramsType: js.Array[HighlightQuadRequest], returnType: Unit): `146` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`146`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `146`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[HighlightQuadRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: HighlightQuadRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
