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
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaVpnGatewaysScopedList {
  
  @scala.inline
  def apply(): SchemaVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewaysScopedList]
  }
  
  @scala.inline
  implicit class SchemaVpnGatewaysScopedListMutableBuilder[Self <: SchemaVpnGatewaysScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnGateways(value: js.Array[SchemaVpnGateway]): Self = StObject.set(x, "vpnGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewaysUndefined: Self = StObject.set(x, "vpnGateways", js.undefined)
    
    @scala.inline
    def setVpnGatewaysVarargs(value: SchemaVpnGateway*): Self = StObject.set(x, "vpnGateways", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
