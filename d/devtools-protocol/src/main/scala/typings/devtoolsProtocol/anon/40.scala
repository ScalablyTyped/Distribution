package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.TrackComputedStyleUpdatesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var paramsType: js.Array[TrackComputedStyleUpdatesRequest]
  
  var returnType: Unit
}
object `40` {
  
  inline def apply(paramsType: js.Array[TrackComputedStyleUpdatesRequest], returnType: Unit): `40` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  extension [Self <: `40`](x: Self) {
    
    inline def setParamsType(value: js.Array[TrackComputedStyleUpdatesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TrackComputedStyleUpdatesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
