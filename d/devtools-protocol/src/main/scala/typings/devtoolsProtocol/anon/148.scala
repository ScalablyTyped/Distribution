package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameAckRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  var paramsType: js.Array[ScreencastFrameAckRequest]
  
  var returnType: Unit
}
object `148` {
  
  inline def apply(paramsType: js.Array[ScreencastFrameAckRequest], returnType: Unit): `148` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`148`]
  }
  
  extension [Self <: `148`](x: Self) {
    
    inline def setParamsType(value: js.Array[ScreencastFrameAckRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ScreencastFrameAckRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
