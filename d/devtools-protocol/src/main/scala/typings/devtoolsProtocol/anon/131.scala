package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowAdHighlightsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var paramsType: js.Array[SetShowAdHighlightsRequest]
  
  var returnType: Unit
}
object `131` {
  
  inline def apply(paramsType: js.Array[SetShowAdHighlightsRequest], returnType: Unit): `131` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`131`]
  }
  
  extension [Self <: `131`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetShowAdHighlightsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowAdHighlightsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
