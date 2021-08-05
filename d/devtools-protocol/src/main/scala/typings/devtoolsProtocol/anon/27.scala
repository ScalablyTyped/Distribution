package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.SetPlaybackRateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var paramsType: js.Array[SetPlaybackRateRequest]
  
  var returnType: Unit
}
object `27` {
  
  inline def apply(paramsType: js.Array[SetPlaybackRateRequest], returnType: Unit): `27` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetPlaybackRateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetPlaybackRateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
