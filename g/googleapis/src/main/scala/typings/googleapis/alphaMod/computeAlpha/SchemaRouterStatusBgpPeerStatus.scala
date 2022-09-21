package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterStatusBgpPeerStatus extends StObject {
  
  /**
    * Routes that were advertised to the remote BGP peer
    */
  var advertisedRoutes: js.UndefOr[js.Array[SchemaRoute]] = js.undefined
  
  var bfdStatus: js.UndefOr[SchemaBfdStatus] = js.undefined
  
  /**
    * Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
    */
  var enableIpv6: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * IP address of the local BGP interface.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IPv6 address of the local BGP interface.
    */
  var ipv6NexthopAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the VPN tunnel that this BGP peer controls.
    */
  var linkedVpnTunnel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Informs whether MD5 authentication is enabled on this BGP peer.
    */
  var md5AuthEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Name of this BGP peer. Unique within the Routers resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of routes learned from the remote BGP Peer.
    */
  var numLearnedRoutes: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * IP address of the remote BGP interface.
    */
  var peerIpAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IPv6 address of the remote BGP interface.
    */
  var peerIpv6NexthopAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance is the peer side of the BGP session.
    */
  var routerApplianceInstance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the BGP session. For a list of possible values for this field, see BGP session states.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the BGP peer: {UP, DOWN\}
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates why particular status was returned.
    */
  var statusReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59 seconds
    */
  var uptime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time this session has been up, in seconds. Format: 145
    */
  var uptimeSeconds: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouterStatusBgpPeerStatus {
  
  inline def apply(): SchemaRouterStatusBgpPeerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusBgpPeerStatus]
  }
  
  extension [Self <: SchemaRouterStatusBgpPeerStatus](x: Self) {
    
    inline def setAdvertisedRoutes(value: js.Array[SchemaRoute]): Self = StObject.set(x, "advertisedRoutes", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedRoutesUndefined: Self = StObject.set(x, "advertisedRoutes", js.undefined)
    
    inline def setAdvertisedRoutesVarargs(value: SchemaRoute*): Self = StObject.set(x, "advertisedRoutes", js.Array(value*))
    
    inline def setBfdStatus(value: SchemaBfdStatus): Self = StObject.set(x, "bfdStatus", value.asInstanceOf[js.Any])
    
    inline def setBfdStatusUndefined: Self = StObject.set(x, "bfdStatus", js.undefined)
    
    inline def setEnableIpv6(value: Boolean): Self = StObject.set(x, "enableIpv6", value.asInstanceOf[js.Any])
    
    inline def setEnableIpv6Null: Self = StObject.set(x, "enableIpv6", null)
    
    inline def setEnableIpv6Undefined: Self = StObject.set(x, "enableIpv6", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setIpv6NexthopAddress(value: String): Self = StObject.set(x, "ipv6NexthopAddress", value.asInstanceOf[js.Any])
    
    inline def setIpv6NexthopAddressNull: Self = StObject.set(x, "ipv6NexthopAddress", null)
    
    inline def setIpv6NexthopAddressUndefined: Self = StObject.set(x, "ipv6NexthopAddress", js.undefined)
    
    inline def setLinkedVpnTunnel(value: String): Self = StObject.set(x, "linkedVpnTunnel", value.asInstanceOf[js.Any])
    
    inline def setLinkedVpnTunnelNull: Self = StObject.set(x, "linkedVpnTunnel", null)
    
    inline def setLinkedVpnTunnelUndefined: Self = StObject.set(x, "linkedVpnTunnel", js.undefined)
    
    inline def setMd5AuthEnabled(value: Boolean): Self = StObject.set(x, "md5AuthEnabled", value.asInstanceOf[js.Any])
    
    inline def setMd5AuthEnabledNull: Self = StObject.set(x, "md5AuthEnabled", null)
    
    inline def setMd5AuthEnabledUndefined: Self = StObject.set(x, "md5AuthEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumLearnedRoutes(value: Double): Self = StObject.set(x, "numLearnedRoutes", value.asInstanceOf[js.Any])
    
    inline def setNumLearnedRoutesNull: Self = StObject.set(x, "numLearnedRoutes", null)
    
    inline def setNumLearnedRoutesUndefined: Self = StObject.set(x, "numLearnedRoutes", js.undefined)
    
    inline def setPeerIpAddress(value: String): Self = StObject.set(x, "peerIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerIpAddressNull: Self = StObject.set(x, "peerIpAddress", null)
    
    inline def setPeerIpAddressUndefined: Self = StObject.set(x, "peerIpAddress", js.undefined)
    
    inline def setPeerIpv6NexthopAddress(value: String): Self = StObject.set(x, "peerIpv6NexthopAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerIpv6NexthopAddressNull: Self = StObject.set(x, "peerIpv6NexthopAddress", null)
    
    inline def setPeerIpv6NexthopAddressUndefined: Self = StObject.set(x, "peerIpv6NexthopAddress", js.undefined)
    
    inline def setRouterApplianceInstance(value: String): Self = StObject.set(x, "routerApplianceInstance", value.asInstanceOf[js.Any])
    
    inline def setRouterApplianceInstanceNull: Self = StObject.set(x, "routerApplianceInstance", null)
    
    inline def setRouterApplianceInstanceUndefined: Self = StObject.set(x, "routerApplianceInstance", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonNull: Self = StObject.set(x, "statusReason", null)
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUptime(value: String): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
    
    inline def setUptimeNull: Self = StObject.set(x, "uptime", null)
    
    inline def setUptimeSeconds(value: String): Self = StObject.set(x, "uptimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setUptimeSecondsNull: Self = StObject.set(x, "uptimeSeconds", null)
    
    inline def setUptimeSecondsUndefined: Self = StObject.set(x, "uptimeSeconds", js.undefined)
    
    inline def setUptimeUndefined: Self = StObject.set(x, "uptime", js.undefined)
  }
}
