package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewaysScopedList extends StObject {
  
  /**
    * [Output Only] A list of VPN gateways contained in this scope.
    */
  var vpnGateways: js.UndefOr[js.Array[SchemaVpnGateway]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of addresses when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaVpnGatewaysScopedList {
  
  inline def apply(): SchemaVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewaysScopedList]
  }
  
  extension [Self <: SchemaVpnGatewaysScopedList](x: Self) {
    
    inline def setVpnGateways(value: js.Array[SchemaVpnGateway]): Self = StObject.set(x, "vpnGateways", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewaysUndefined: Self = StObject.set(x, "vpnGateways", js.undefined)
    
    inline def setVpnGatewaysVarargs(value: SchemaVpnGateway*): Self = StObject.set(x, "vpnGateways", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
