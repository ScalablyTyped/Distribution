package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.SetIgnoreInputEventsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `102` extends StObject {
  
  var paramsType: js.Array[SetIgnoreInputEventsRequest]
  
  var returnType: Unit
}
object `102` {
  
  inline def apply(paramsType: js.Array[SetIgnoreInputEventsRequest], returnType: Unit): `102` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`102`]
  }
  
  extension [Self <: `102`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetIgnoreInputEventsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetIgnoreInputEventsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
