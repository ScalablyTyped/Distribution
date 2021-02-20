package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRouterStatusBgpPeerStatus extends StObject {
  
  /**
    * Routes that were advertised to the remote BGP peer
    */
  var advertisedRoutes: js.UndefOr[js.Array[SchemaRoute]] = js.native
  
  /**
    * IP address of the local BGP interface.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * URL of the VPN tunnel that this BGP peer controls.
    */
  var linkedVpnTunnel: js.UndefOr[String] = js.native
  
  /**
    * Name of this BGP peer. Unique within the Routers resource.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Number of routes learned from the remote BGP Peer.
    */
  var numLearnedRoutes: js.UndefOr[Double] = js.native
  
  /**
    * IP address of the remote BGP interface.
    */
  var peerIpAddress: js.UndefOr[String] = js.native
  
  /**
    * BGP state as specified in RFC1771.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Status of the BGP peer: {UP, DOWN}
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23
    * hours, 59 minutes, 59 seconds
    */
  var uptime: js.UndefOr[String] = js.native
  
  /**
    * Time this session has been up, in seconds. Format: 145
    */
  var uptimeSeconds: js.UndefOr[String] = js.native
}
object SchemaRouterStatusBgpPeerStatus {
  
  @scala.inline
  def apply(): SchemaRouterStatusBgpPeerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusBgpPeerStatus]
  }
  
  @scala.inline
  implicit class SchemaRouterStatusBgpPeerStatusMutableBuilder[Self <: SchemaRouterStatusBgpPeerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisedRoutes(value: js.Array[SchemaRoute]): Self = StObject.set(x, "advertisedRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedRoutesUndefined: Self = StObject.set(x, "advertisedRoutes", js.undefined)
    
    @scala.inline
    def setAdvertisedRoutesVarargs(value: SchemaRoute*): Self = StObject.set(x, "advertisedRoutes", js.Array(value :_*))
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setLinkedVpnTunnel(value: String): Self = StObject.set(x, "linkedVpnTunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedVpnTunnelUndefined: Self = StObject.set(x, "linkedVpnTunnel", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumLearnedRoutes(value: Double): Self = StObject.set(x, "numLearnedRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumLearnedRoutesUndefined: Self = StObject.set(x, "numLearnedRoutes", js.undefined)
    
    @scala.inline
    def setPeerIpAddress(value: String): Self = StObject.set(x, "peerIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIpAddressUndefined: Self = StObject.set(x, "peerIpAddress", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUptime(value: String): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptimeSeconds(value: String): Self = StObject.set(x, "uptimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptimeSecondsUndefined: Self = StObject.set(x, "uptimeSeconds", js.undefined)
    
    @scala.inline
    def setUptimeUndefined: Self = StObject.set(x, "uptime", js.undefined)
  }
}
