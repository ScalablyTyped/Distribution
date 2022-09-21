package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetAutomaticPresenceSimulationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242` extends StObject {
  
  var paramsType: js.Array[SetAutomaticPresenceSimulationRequest]
  
  var returnType: Unit
}
object `242` {
  
  inline def apply(paramsType: js.Array[SetAutomaticPresenceSimulationRequest], returnType: Unit): `242` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`242`]
  }
  
  extension [Self <: `242`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetAutomaticPresenceSimulationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetAutomaticPresenceSimulationRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
