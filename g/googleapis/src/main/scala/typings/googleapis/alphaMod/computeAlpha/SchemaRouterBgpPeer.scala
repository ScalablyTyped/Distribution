package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    advertiseMode: String = null,
    advertisedGroups: js.Array[String] = null,
    advertisedIpRanges: js.Array[SchemaRouterAdvertisedIpRange] = null,
    advertisedRoutePriority: js.UndefOr[Double] = js.undefined,
    bfd: SchemaRouterBgpPeerBfd = null,
    enable: String = null,
    interfaceName: String = null,
    ipAddress: String = null,
    managementType: String = null,
    name: String = null,
    peerAsn: js.UndefOr[Double] = js.undefined,
    peerIpAddress: String = null
  ): SchemaRouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    if (advertiseMode != null) __obj.updateDynamic("advertiseMode")(advertiseMode.asInstanceOf[js.Any])
    if (advertisedGroups != null) __obj.updateDynamic("advertisedGroups")(advertisedGroups.asInstanceOf[js.Any])
    if (advertisedIpRanges != null) __obj.updateDynamic("advertisedIpRanges")(advertisedIpRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(advertisedRoutePriority)) __obj.updateDynamic("advertisedRoutePriority")(advertisedRoutePriority.get.asInstanceOf[js.Any])
    if (bfd != null) __obj.updateDynamic("bfd")(bfd.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (interfaceName != null) __obj.updateDynamic("interfaceName")(interfaceName.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (managementType != null) __obj.updateDynamic("managementType")(managementType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(peerAsn)) __obj.updateDynamic("peerAsn")(peerAsn.get.asInstanceOf[js.Any])
    if (peerIpAddress != null) __obj.updateDynamic("peerIpAddress")(peerIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRouterBgpPeer]
  }
}

