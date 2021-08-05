package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.SynthesizeTapGestureRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  var paramsType: js.Array[SynthesizeTapGestureRequest]
  
  var returnType: Unit
}
object `105` {
  
  inline def apply(paramsType: js.Array[SynthesizeTapGestureRequest], returnType: Unit): `105` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`105`]
  }
  
  extension [Self <: `105`](x: Self) {
    
    inline def setParamsType(value: js.Array[SynthesizeTapGestureRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SynthesizeTapGestureRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
