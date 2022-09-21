package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetVpnGatewaysScopedList extends StObject {
  
  /**
    * [Output Only] A list of target VPN gateways contained in this scope.
    */
  var targetVpnGateways: js.UndefOr[js.Array[SchemaTargetVpnGateway]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of addresses when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaTargetVpnGatewaysScopedList {
  
  inline def apply(): SchemaTargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetVpnGatewaysScopedList]
  }
  
  extension [Self <: SchemaTargetVpnGatewaysScopedList](x: Self) {
    
    inline def setTargetVpnGateways(value: js.Array[SchemaTargetVpnGateway]): Self = StObject.set(x, "targetVpnGateways", value.asInstanceOf[js.Any])
    
    inline def setTargetVpnGatewaysUndefined: Self = StObject.set(x, "targetVpnGateways", js.undefined)
    
    inline def setTargetVpnGatewaysVarargs(value: SchemaTargetVpnGateway*): Self = StObject.set(x, "targetVpnGateways", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
