package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRouterBgpPeer extends js.Object {
  
  /**
    * User-specified flag to indicate which mode to use for advertisement.
    */
  var advertiseMode: js.UndefOr[String] = js.native
  
  /**
    * User-specified list of prefix groups to advertise in custom mode. This
    * field can only be populated if advertise_mode is CUSTOM and overrides the
    * list defined for the router (in Bgp message). These groups will be
    * advertised in addition to any specified prefixes. Leave this field blank
    * to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User-specified list of individual IP ranges to advertise in custom mode.
    * This field can only be populated if advertise_mode is CUSTOM and
    * overrides the list defined for the router (in Bgp message). These IP
    * ranges will be advertised in addition to any specified groups. Leave this
    * field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[SchemaRouterAdvertisedIpRange]] = js.native
  
  /**
    * The priority of routes advertised to this BGP peer. In the case where
    * there is more than one matching route of maximum length, the routes with
    * lowest priority value win.
    */
  var advertisedRoutePriority: js.UndefOr[Double] = js.native
  
  /**
    * BFD configuration for the BGP peering.
    */
  var bfd: js.UndefOr[SchemaRouterBgpPeerBfd] = js.native
  
  /**
    * The status of the BGP peer connection. If set to FALSE, any active
    * session with the peer is terminated and all associated routing
    * information is removed. If set to TRUE, the peer connection can be
    * established with routing information. The default is TRUE.
    */
  var enable: js.UndefOr[String] = js.native
  
  /**
    * Name of the interface the BGP peer is associated with.
    */
  var interfaceName: js.UndefOr[String] = js.native
  
  /**
    * IP address of the interface inside Google Cloud Platform. Only IPv4 is
    * supported.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The resource that configures and manages this BGP peer.
    * MANAGED_BY_USER is the default value and can be managed by you or other
    * users; MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed
    * by Cloud Interconnect, specifically by an InterconnectAttachment of type
    * PARTNER. Google will automatically create, update, and delete this type
    * of BGP peer when the PARTNER InterconnectAttachment is created, updated,
    * or deleted.
    */
  var managementType: js.UndefOr[String] = js.native
  
  /**
    * Name of this BGP peer. The name must be 1-63 characters long and comply
    * with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Peer BGP Autonomous System Number (ASN). For VPN use case, this value can
    * be different for every tunnel.
    */
  var peerAsn: js.UndefOr[Double] = js.native
  
  /**
    * IP address of the BGP interface outside Google cloud. Only IPv4 is
    * supported.
    */
  var peerIpAddress: js.UndefOr[String] = js.native
}
object SchemaRouterBgpPeer {
  
  @scala.inline
  def apply(): SchemaRouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgpPeer]
  }
  
  @scala.inline
  implicit class SchemaRouterBgpPeerOps[Self <: SchemaRouterBgpPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdvertiseMode(value: String): Self = this.set("advertiseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiseMode: Self = this.set("advertiseMode", js.undefined)
    
    @scala.inline
    def setAdvertisedGroupsVarargs(value: String*): Self = this.set("advertisedGroups", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisedGroups(value: js.Array[String]): Self = this.set("advertisedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisedGroups: Self = this.set("advertisedGroups", js.undefined)
    
    @scala.inline
    def setAdvertisedIpRangesVarargs(value: SchemaRouterAdvertisedIpRange*): Self = this.set("advertisedIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisedIpRanges(value: js.Array[SchemaRouterAdvertisedIpRange]): Self = this.set("advertisedIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisedIpRanges: Self = this.set("advertisedIpRanges", js.undefined)
    
    @scala.inline
    def setAdvertisedRoutePriority(value: Double): Self = this.set("advertisedRoutePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisedRoutePriority: Self = this.set("advertisedRoutePriority", js.undefined)
    
    @scala.inline
    def setBfd(value: SchemaRouterBgpPeerBfd): Self = this.set("bfd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBfd: Self = this.set("bfd", js.undefined)
    
    @scala.inline
    def setEnable(value: String): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setInterfaceName(value: String): Self = this.set("interfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceName: Self = this.set("interfaceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setManagementType(value: String): Self = this.set("managementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementType: Self = this.set("managementType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPeerAsn(value: Double): Self = this.set("peerAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerAsn: Self = this.set("peerAsn", js.undefined)
    
    @scala.inline
    def setPeerIpAddress(value: String): Self = this.set("peerIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerIpAddress: Self = this.set("peerIpAddress", js.undefined)
  }
}
