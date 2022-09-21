package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionsPolicyStateResponse extends StObject {
  
  var states: js.Array[PermissionsPolicyFeatureState]
}
object GetPermissionsPolicyStateResponse {
  
  inline def apply(states: js.Array[PermissionsPolicyFeatureState]): GetPermissionsPolicyStateResponse = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionsPolicyStateResponse]
  }
  
  extension [Self <: GetPermissionsPolicyStateResponse](x: Self) {
    
    inline def setStates(value: js.Array[PermissionsPolicyFeatureState]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesVarargs(value: PermissionsPolicyFeatureState*): Self = StObject.set(x, "states", js.Array(value*))
  }
}
