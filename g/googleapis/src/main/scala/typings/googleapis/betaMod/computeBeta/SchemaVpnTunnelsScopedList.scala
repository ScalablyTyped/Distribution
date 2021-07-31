package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnTunnelsScopedList extends StObject {
  
  /**
    * A list of VPN tunnels contained in this scope.
    */
  var vpnTunnels: js.UndefOr[js.Array[SchemaVpnTunnel]] = js.undefined
  
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaVpnTunnelsScopedList {
  
  @scala.inline
  def apply(): SchemaVpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnTunnelsScopedList]
  }
  
  @scala.inline
  implicit class SchemaVpnTunnelsScopedListMutableBuilder[Self <: SchemaVpnTunnelsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnTunnels(value: js.Array[SchemaVpnTunnel]): Self = StObject.set(x, "vpnTunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnTunnelsUndefined: Self = StObject.set(x, "vpnTunnels", js.undefined)
    
    @scala.inline
    def setVpnTunnelsVarargs(value: SchemaVpnTunnel*): Self = StObject.set(x, "vpnTunnels", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
