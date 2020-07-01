package typings.googleapis.betaMod.computeBeta

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
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a Subnetwork. An up-to-date fingerprint must be
    * provided in order to update the Subnetwork, otherwise the request will
    * fail with error 412 conditionNotMet.  To see the latest fingerprint, make
    * a get() request to retrieve a Subnetwork.
    */
  var fingerprint: js.UndefOr[String] = js.native
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
    * URL of the region where the Subnetwork resides. This field can be set
    * only at resource creation time.
    */
  var region: js.UndefOr[String] = js.native
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
}

object SchemaSubnetwork {
  @scala.inline
  def apply(
    allowSubnetCidrRoutesOverlap: js.UndefOr[Boolean] = js.undefined,
    creationTimestamp: String = null,
    description: String = null,
    enableFlowLogs: js.UndefOr[Boolean] = js.undefined,
    fingerprint: String = null,
    gatewayAddress: String = null,
    id: String = null,
    ipCidrRange: String = null,
    kind: String = null,
    logConfig: SchemaSubnetworkLogConfig = null,
    name: String = null,
    network: String = null,
    privateIpGoogleAccess: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    secondaryIpRanges: js.Array[SchemaSubnetworkSecondaryRange] = null,
    selfLink: String = null
  ): SchemaSubnetwork = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSubnetCidrRoutesOverlap)) __obj.updateDynamic("allowSubnetCidrRoutesOverlap")(allowSubnetCidrRoutesOverlap.get.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFlowLogs)) __obj.updateDynamic("enableFlowLogs")(enableFlowLogs.get.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (gatewayAddress != null) __obj.updateDynamic("gatewayAddress")(gatewayAddress.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (!js.isUndefined(privateIpGoogleAccess)) __obj.updateDynamic("privateIpGoogleAccess")(privateIpGoogleAccess.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (secondaryIpRanges != null) __obj.updateDynamic("secondaryIpRanges")(secondaryIpRanges.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubnetwork]
  }
}

