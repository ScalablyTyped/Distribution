package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightFrameRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  var paramsType: js.Array[HighlightFrameRequest]
  
  var returnType: Unit
}
object `144` {
  
  inline def apply(paramsType: js.Array[HighlightFrameRequest], returnType: Unit): `144` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `144`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[HighlightFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: HighlightFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
