package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Subnetwork resource. (== resource_for beta.subnetworks ==) (==
  * resource_for v1.subnetworks ==)
  */
@js.native
trait SchemaSubnetwork extends js.Object {
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * Toggles the aggregation interval for collecting flow logs. Increasing the
    * interval time will reduce the amount of generated flow logs for long
    * lasting connections. Default is an interval of 5 seconds per connection.
    */
  var aggregationInterval: js.UndefOr[String] = js.native
  /**
    * Whether this subnetwork can conflict with static routes. Setting this to
    * true allows this subnetwork&#39;s primary and secondary ranges to
    * conflict with routes that have already been configured on the
    * corresponding network. Static routes will take precedence over the
    * subnetwork route if the route prefix length is at least as large as the
    * subnetwork prefix length.  Also, packets destined to IPs within
    * subnetwork may contain private/sensitive data and are prevented from
    * leaving the virtual network. Setting this field to true will disable this
    * feature.  The default value is false and applies to all existing
    * subnetworks and automatically created subnetworks.  This field cannot be
    * set to true at resource creation time.
    */
  var allowSubnetCidrRoutesOverlap: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource. This field can be set only at resource creation
    * time.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether to enable flow logging for this subnetwork. If this field is not
    * explicitly set, it will not appear in get listings. If not set the
    * default behavior is to disable flow logging.
    */
  var enableFlowLogs: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated in favor of enable in PrivateIpv6GoogleAccess. Whether the VMs
    * in this subnet can directly access Google services via internal IPv6
    * addresses. This field can be both set at resource creation time and
    * updated using patch.
    */
  var enablePrivateV6Access: js.UndefOr[Boolean] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a Subnetwork. An up-to-date fingerprint must be
    * provided in order to update the Subnetwork, otherwise the request will
    * fail with error 412 conditionNotMet.  To see the latest fingerprint, make
    * a get() request to retrieve a Subnetwork.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * The value of the field must be in [0, 1]. Set the sampling rate of VPC
    * flow logs within the subnetwork where 1.0 means all collected logs are
    * reported and 0.0 means no logs are reported. Default is 0.5 which means
    * half of all collected logs are reported.
    */
  var flowSampling: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The gateway address for default routes to reach destination
    * addresses outside this subnetwork.
    */
  var gatewayAddress: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The range of internal addresses that are owned by this subnetwork.
    * Provide this property when you create the subnetwork. For
    * example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
    * non-overlapping within a network. Only IPv4 is supported. This field can
    * be set only at resource creation time.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * [Output Only] The range of internal IPv6 addresses that are owned by this
    * subnetwork.
    */
  var ipv6CidrRange: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#subnetwork for
    * Subnetwork resources.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This field denotes the logging options for the load balancer traffic
    * served by this backend service. If logging is enabled, logs will be
    * exported to Stackdriver.
    */
  var logConfig: js.UndefOr[SchemaSubnetworkLogConfig] = js.native
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * Configures whether metadata fields should be added to the reported VPC
    * flow logs. Default is INCLUDE_ALL_METADATA.
    */
  var metadata: js.UndefOr[String] = js.native
  /**
    * The name of the resource, provided by the client when initially creating
    * the resource. The name must be 1-63 characters long, and comply with
    * RFC1035. Specifically, the name must be 1-63 characters long and match
    * the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
    * character must be a lowercase letter, and all following characters must
    * be a dash, lowercase letter, or digit, except the last character, which
    * cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the network to which this subnetwork belongs, provided by the
    * client when initially creating the subnetwork. Only networks that are in
    * the distributed mode can have subnetworks. This field can be set only at
    * resource creation time.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Whether the VMs in this subnet can access Google services without
    * assigned external IP addresses. This field can be both set at resource
    * creation time and updated using setPrivateIpGoogleAccess.
    */
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
  /**
    * The private IPv6 google access type for the VMs in this subnet. This is
    * an expanded field of enablePrivateV6Access. If both fields are set,
    * privateIpv6GoogleAccess will take priority.  This field can be both set
    * at resource creation time and updated using patch.
    */
  var privateIpv6GoogleAccess: js.UndefOr[String] = js.native
  /**
    * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or
    * INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to
    * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
    * reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose
    * defaults to PRIVATE_RFC_1918.
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * The type of IP CIDR range to associate with this subnetwork. The default
    * is RFC_1918. When creating a subnetwork in non-RFC 1918 range, this field
    * must be set to NON_RFC_1918.
    */
  var rangeType: js.UndefOr[String] = js.native
  /**
    * URL of the region where the Subnetwork resides. This field can be set
    * only at resource creation time.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The role of subnetwork. Currenly, this field is only used when purpose =
    * INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP.
    * An ACTIVE subnetwork is one that is currently being used for Internal
    * HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be
    * promoted to ACTIVE or is currently draining. This field can be updated
    * with a patch request.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * An array of configurations for secondary IP ranges for VM instances
    * contained in this subnetwork. The primary IP of such VM must belong to
    * the primary ipCidrRange of the subnetwork. The alias IPs may belong to
    * either primary or secondary ranges. This field can be updated with a
    * patch request.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaSubnetworkSecondaryRange]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The state of the subnetwork, which can be one of READY or
    * DRAINING. A subnetwork that is READY is ready to be used. The state of
    * DRAINING is only applicable to subnetworks that have the purpose set to
    * INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load
    * balancer are being drained. A subnetwork that is draining cannot be used
    * or modified until it reaches a status of READY.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaSubnetwork {
  @scala.inline
  def apply(
    aggregationInterval: String = null,
    allowSubnetCidrRoutesOverlap: js.UndefOr[Boolean] = js.undefined,
    creationTimestamp: String = null,
    description: String = null,
    enableFlowLogs: js.UndefOr[Boolean] = js.undefined,
    enablePrivateV6Access: js.UndefOr[Boolean] = js.undefined,
    fingerprint: String = null,
    flowSampling: js.UndefOr[Double] = js.undefined,
    gatewayAddress: String = null,
    id: String = null,
    ipCidrRange: String = null,
    ipv6CidrRange: String = null,
    kind: String = null,
    logConfig: SchemaSubnetworkLogConfig = null,
    metadata: String = null,
    name: String = null,
    network: String = null,
    privateIpGoogleAccess: js.UndefOr[Boolean] = js.undefined,
    privateIpv6GoogleAccess: String = null,
    purpose: String = null,
    rangeType: String = null,
    region: String = null,
    role: String = null,
    secondaryIpRanges: js.Array[SchemaSubnetworkSecondaryRange] = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    state: String = null
  ): SchemaSubnetwork = {
    val __obj = js.Dynamic.literal()
    if (aggregationInterval != null) __obj.updateDynamic("aggregationInterval")(aggregationInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSubnetCidrRoutesOverlap)) __obj.updateDynamic("allowSubnetCidrRoutesOverlap")(allowSubnetCidrRoutesOverlap.get.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFlowLogs)) __obj.updateDynamic("enableFlowLogs")(enableFlowLogs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePrivateV6Access)) __obj.updateDynamic("enablePrivateV6Access")(enablePrivateV6Access.get.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (!js.isUndefined(flowSampling)) __obj.updateDynamic("flowSampling")(flowSampling.get.asInstanceOf[js.Any])
    if (gatewayAddress != null) __obj.updateDynamic("gatewayAddress")(gatewayAddress.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (ipv6CidrRange != null) __obj.updateDynamic("ipv6CidrRange")(ipv6CidrRange.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (!js.isUndefined(privateIpGoogleAccess)) __obj.updateDynamic("privateIpGoogleAccess")(privateIpGoogleAccess.get.asInstanceOf[js.Any])
    if (privateIpv6GoogleAccess != null) __obj.updateDynamic("privateIpv6GoogleAccess")(privateIpv6GoogleAccess.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (rangeType != null) __obj.updateDynamic("rangeType")(rangeType.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (secondaryIpRanges != null) __obj.updateDynamic("secondaryIpRanges")(secondaryIpRanges.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubnetwork]
  }
}

