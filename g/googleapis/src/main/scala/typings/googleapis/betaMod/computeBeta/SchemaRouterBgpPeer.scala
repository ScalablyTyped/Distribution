package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterBgpPeer extends StObject {
  
  /**
    * User-specified flag to indicate which mode to use for advertisement.
    */
  var advertiseMode: js.UndefOr[String] = js.undefined
  
  /**
    * User-specified list of prefix groups to advertise in custom mode. This
    * field can only be populated if advertise_mode is CUSTOM and overrides the
    * list defined for the router (in Bgp message). These groups will be
    * advertised in addition to any specified prefixes. Leave this field blank
    * to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User-specified list of individual IP ranges to advertise in custom mode.
    * This field can only be populated if advertise_mode is CUSTOM and
    * overrides the list defined for the router (in Bgp message). These IP
    * ranges will be advertised in addition to any specified groups. Leave this
    * field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[SchemaRouterAdvertisedIpRange]] = js.undefined
  
  /**
    * The priority of routes advertised to this BGP peer. In the case where
    * there is more than one matching route of maximum length, the routes with
    * lowest priority value win.
    */
  var advertisedRoutePriority: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the interface the BGP peer is associated with.
    */
  var interfaceName: js.UndefOr[String] = js.undefined
  
  /**
    * IP address of the interface inside Google Cloud Platform. Only IPv4 is
    * supported.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The resource that configures and manages this BGP peer.
    * MANAGED_BY_USER is the default value and can be managed by you or other
    * users; MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed
    * by Cloud Interconnect, specifically by an InterconnectAttachment of type
    * PARTNER. Google will automatically create, update, and delete this type
    * of BGP peer when the PARTNER InterconnectAttachment is created, updated,
    * or deleted.
    */
  var managementType: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this BGP peer. The name must be 1-63 characters long and comply
    * with RFC1035.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Peer BGP Autonomous System Number (ASN). For VPN use case, this value can
    * be different for every tunnel.
    */
  var peerAsn: js.UndefOr[Double] = js.undefined
  
  /**
    * IP address of the BGP interface outside Google cloud. Only IPv4 is
    * supported.
    */
  var peerIpAddress: js.UndefOr[String] = js.undefined
}
object SchemaRouterBgpPeer {
  
  @scala.inline
  def apply(): SchemaRouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgpPeer]
  }
  
  @scala.inline
  implicit class SchemaRouterBgpPeerMutableBuilder[Self <: SchemaRouterBgpPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiseMode(value: String): Self = StObject.set(x, "advertiseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiseModeUndefined: Self = StObject.set(x, "advertiseMode", js.undefined)
    
    @scala.inline
    def setAdvertisedGroups(value: js.Array[String]): Self = StObject.set(x, "advertisedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedGroupsUndefined: Self = StObject.set(x, "advertisedGroups", js.undefined)
    
    @scala.inline
    def setAdvertisedGroupsVarargs(value: String*): Self = StObject.set(x, "advertisedGroups", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisedIpRanges(value: js.Array[SchemaRouterAdvertisedIpRange]): Self = StObject.set(x, "advertisedIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedIpRangesUndefined: Self = StObject.set(x, "advertisedIpRanges", js.undefined)
    
    @scala.inline
    def setAdvertisedIpRangesVarargs(value: SchemaRouterAdvertisedIpRange*): Self = StObject.set(x, "advertisedIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisedRoutePriority(value: Double): Self = StObject.set(x, "advertisedRoutePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedRoutePriorityUndefined: Self = StObject.set(x, "advertisedRoutePriority", js.undefined)
    
    @scala.inline
    def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceNameUndefined: Self = StObject.set(x, "interfaceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPeerAsn(value: Double): Self = StObject.set(x, "peerAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerAsnUndefined: Self = StObject.set(x, "peerAsn", js.undefined)
    
    @scala.inline
    def setPeerIpAddress(value: String): Self = StObject.set(x, "peerIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIpAddressUndefined: Self = StObject.set(x, "peerIpAddress", js.undefined)
  }
}
