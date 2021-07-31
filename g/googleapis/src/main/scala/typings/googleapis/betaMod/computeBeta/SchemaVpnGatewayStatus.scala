package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewayStatus extends StObject {
  
  /**
    * List of VPN connection for this VpnGateway.
    */
  var vpnConnections: js.UndefOr[js.Array[SchemaVpnGatewayStatusVpnConnection]] = js.undefined
}
object SchemaVpnGatewayStatus {
  
  @scala.inline
  def apply(): SchemaVpnGatewayStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatus]
  }
  
  @scala.inline
  implicit class SchemaVpnGatewayStatusMutableBuilder[Self <: SchemaVpnGatewayStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnConnections(value: js.Array[SchemaVpnGatewayStatusVpnConnection]): Self = StObject.set(x, "vpnConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConnectionsUndefined: Self = StObject.set(x, "vpnConnections", js.undefined)
    
    @scala.inline
    def setVpnConnectionsVarargs(value: SchemaVpnGatewayStatusVpnConnection*): Self = StObject.set(x, "vpnConnections", js.Array(value :_*))
  }
}
