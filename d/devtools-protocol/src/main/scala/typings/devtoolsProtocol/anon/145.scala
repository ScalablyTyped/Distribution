package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightNodeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `145` extends StObject {
  
  var paramsType: js.Array[HighlightNodeRequest]
  
  var returnType: Unit
}
object `145` {
  
  inline def apply(paramsType: js.Array[HighlightNodeRequest], returnType: Unit): `145` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`145`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `145`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[HighlightNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: HighlightNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
