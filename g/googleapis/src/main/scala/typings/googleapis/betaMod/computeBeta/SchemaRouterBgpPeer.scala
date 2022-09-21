package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterBgpPeer extends StObject {
  
  /**
    * User-specified flag to indicate which mode to use for advertisement.
    */
  var advertiseMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-specified list of prefix groups to advertise in custom mode, which can take one of the following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets. - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[SchemaRouterAdvertisedIpRange]] = js.undefined
  
  /**
    * The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win.
    */
  var advertisedRoutePriority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * BFD configuration for the BGP peering.
    */
  var bfd: js.UndefOr[SchemaRouterBgpPeerBfd] = js.undefined
  
  /**
    * The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
    */
  var enable: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
    */
  var enableIpv6: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Name of the interface the BGP peer is associated with.
    */
  var interfaceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IPv6 address of the interface inside Google Cloud Platform.
    */
  var ipv6NexthopAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
    */
  var managementType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Present if MD5 authentication is enabled for the peering. Must be the name of one of the entries in the Router.md5_authentication_keys. The field must comply with RFC1035.
    */
  var md5AuthenticationKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
    */
  var peerAsn: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
    */
  var peerIpAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IPv6 address of the BGP interface outside Google Cloud Platform.
    */
  var peerIpv6NexthopAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
    */
  var routerApplianceInstance: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouterBgpPeer {
  
  inline def apply(): SchemaRouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgpPeer]
  }
  
  extension [Self <: SchemaRouterBgpPeer](x: Self) {
    
    inline def setAdvertiseMode(value: String): Self = StObject.set(x, "advertiseMode", value.asInstanceOf[js.Any])
    
    inline def setAdvertiseModeNull: Self = StObject.set(x, "advertiseMode", null)
    
    inline def setAdvertiseModeUndefined: Self = StObject.set(x, "advertiseMode", js.undefined)
    
    inline def setAdvertisedGroups(value: js.Array[String]): Self = StObject.set(x, "advertisedGroups", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedGroupsNull: Self = StObject.set(x, "advertisedGroups", null)
    
    inline def setAdvertisedGroupsUndefined: Self = StObject.set(x, "advertisedGroups", js.undefined)
    
    inline def setAdvertisedGroupsVarargs(value: String*): Self = StObject.set(x, "advertisedGroups", js.Array(value*))
    
    inline def setAdvertisedIpRanges(value: js.Array[SchemaRouterAdvertisedIpRange]): Self = StObject.set(x, "advertisedIpRanges", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedIpRangesUndefined: Self = StObject.set(x, "advertisedIpRanges", js.undefined)
    
    inline def setAdvertisedIpRangesVarargs(value: SchemaRouterAdvertisedIpRange*): Self = StObject.set(x, "advertisedIpRanges", js.Array(value*))
    
    inline def setAdvertisedRoutePriority(value: Double): Self = StObject.set(x, "advertisedRoutePriority", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedRoutePriorityNull: Self = StObject.set(x, "advertisedRoutePriority", null)
    
    inline def setAdvertisedRoutePriorityUndefined: Self = StObject.set(x, "advertisedRoutePriority", js.undefined)
    
    inline def setBfd(value: SchemaRouterBgpPeerBfd): Self = StObject.set(x, "bfd", value.asInstanceOf[js.Any])
    
    inline def setBfdUndefined: Self = StObject.set(x, "bfd", js.undefined)
    
    inline def setEnable(value: String): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableIpv6(value: Boolean): Self = StObject.set(x, "enableIpv6", value.asInstanceOf[js.Any])
    
    inline def setEnableIpv6Null: Self = StObject.set(x, "enableIpv6", null)
    
    inline def setEnableIpv6Undefined: Self = StObject.set(x, "enableIpv6", js.undefined)
    
    inline def setEnableNull: Self = StObject.set(x, "enable", null)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNameNull: Self = StObject.set(x, "interfaceName", null)
    
    inline def setInterfaceNameUndefined: Self = StObject.set(x, "interfaceName", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setIpv6NexthopAddress(value: String): Self = StObject.set(x, "ipv6NexthopAddress", value.asInstanceOf[js.Any])
    
    inline def setIpv6NexthopAddressNull: Self = StObject.set(x, "ipv6NexthopAddress", null)
    
    inline def setIpv6NexthopAddressUndefined: Self = StObject.set(x, "ipv6NexthopAddress", js.undefined)
    
    inline def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    inline def setManagementTypeNull: Self = StObject.set(x, "managementType", null)
    
    inline def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    inline def setMd5AuthenticationKeyName(value: String): Self = StObject.set(x, "md5AuthenticationKeyName", value.asInstanceOf[js.Any])
    
    inline def setMd5AuthenticationKeyNameNull: Self = StObject.set(x, "md5AuthenticationKeyName", null)
    
    inline def setMd5AuthenticationKeyNameUndefined: Self = StObject.set(x, "md5AuthenticationKeyName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeerAsn(value: Double): Self = StObject.set(x, "peerAsn", value.asInstanceOf[js.Any])
    
    inline def setPeerAsnNull: Self = StObject.set(x, "peerAsn", null)
    
    inline def setPeerAsnUndefined: Self = StObject.set(x, "peerAsn", js.undefined)
    
    inline def setPeerIpAddress(value: String): Self = StObject.set(x, "peerIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerIpAddressNull: Self = StObject.set(x, "peerIpAddress", null)
    
    inline def setPeerIpAddressUndefined: Self = StObject.set(x, "peerIpAddress", js.undefined)
    
    inline def setPeerIpv6NexthopAddress(value: String): Self = StObject.set(x, "peerIpv6NexthopAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerIpv6NexthopAddressNull: Self = StObject.set(x, "peerIpv6NexthopAddress", null)
    
    inline def setPeerIpv6NexthopAddressUndefined: Self = StObject.set(x, "peerIpv6NexthopAddress", js.undefined)
    
    inline def setRouterApplianceInstance(value: String): Self = StObject.set(x, "routerApplianceInstance", value.asInstanceOf[js.Any])
    
    inline def setRouterApplianceInstanceNull: Self = StObject.set(x, "routerApplianceInstance", null)
    
    inline def setRouterApplianceInstanceUndefined: Self = StObject.set(x, "routerApplianceInstance", js.undefined)
  }
}
