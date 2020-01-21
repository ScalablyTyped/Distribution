package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ForwardingRule resource. A ForwardingRule resource specifies which pool
  * of target virtual machines to forward a packet to if it matches the given
  * [IPAddress, IPProtocol, ports] tuple. (== resource_for beta.forwardingRules
  * ==) (== resource_for v1.forwardingRules ==) (== resource_for
  * beta.globalForwardingRules ==) (== resource_for v1.globalForwardingRules
  * ==) (== resource_for beta.regionForwardingRules ==) (== resource_for
  * v1.regionForwardingRules ==)
  */
@js.native
trait SchemaForwardingRule extends js.Object {
  /**
    * The IP address that this forwarding rule is serving on behalf of.
    * Addresses are restricted based on the forwarding rule&#39;s load
    * balancing scheme (EXTERNAL or INTERNAL) and scope (global or regional).
    * When the load balancing scheme is EXTERNAL, for global forwarding rules,
    * the address must be a global IP, and for regional forwarding rules, the
    * address must live in the same region as the forwarding rule. If this
    * field is empty, an ephemeral IPv4 address from the same scope (global or
    * regional) will be assigned. A regional forwarding rule supports IPv4
    * only. A global forwarding rule supports either IPv4 or IPv6.  When the
    * load balancing scheme is INTERNAL_SELF_MANAGED, this must be a URL
    * reference to an existing Address resource ( internal regional static IP
    * address), with a purpose of GCE_END_POINT and address_type of INTERNAL.
    * When the load balancing scheme is INTERNAL, this can only be an RFC 1918
    * IP address belonging to the network/subnet configured for the forwarding
    * rule. By default, if this field is empty, an ephemeral internal IP
    * address will be automatically allocated from the IP range of the subnet
    * or network configured for this forwarding rule.  An address can be
    * specified either by a literal IP address or a URL reference to an
    * existing Address resource. The following examples are all valid:   -
    * 100.1.2.3  -
    * https://www.googleapis.com/compute/v1/projects/project/regions/region/addresses/address
    * - projects/project/regions/region/addresses/address  -
    * regions/region/addresses/address  - global/addresses/address  - address
    */
  var IPAddress: js.UndefOr[String] = js.native
  /**
    * The IP protocol to which this rule applies. Valid options are TCP, UDP,
    * ESP, AH, SCTP or ICMP.  When the load balancing scheme is INTERNAL, only
    * TCP and UDP are valid. When the load balancing scheme is
    * INTERNAL_SELF_MANAGED, only TCPis valid.
    */
  var IPProtocol: js.UndefOr[String] = js.native
  /**
    * This field is used along with the backend_service field for internal load
    * balancing or with the target field for internal TargetInstance. This
    * field cannot be used with port or portRange fields.  When the load
    * balancing scheme is INTERNAL and protocol is TCP/UDP, specify this field
    * to allow packets addressed to any ports will be forwarded to the backends
    * configured with this forwarding rule.
    */
  var allPorts: js.UndefOr[Boolean] = js.native
  /**
    * This field is used along with the backend_service field for internal load
    * balancing or with the target field for internal TargetInstance. If the
    * field is set to TRUE, clients can access ILB from all regions. Otherwise
    * only allows access from clients in the same region as the internal load
    * balancer.
    */
  var allowGlobalAccess: js.UndefOr[Boolean] = js.native
  /**
    * This field is only used for INTERNAL load balancing.  For internal load
    * balancing, this field identifies the BackendService resource to receive
    * the matched traffic.
    */
  var backendService: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a ForwardingRule. Include the fingerprint in patch
    * request to ensure that you do not overwrite changes that were applied
    * from another concurrent request.  To see the latest fingerprint, make a
    * get() request to retrieve a ForwardingRule.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The IP Version that will be used by this forwarding rule. Valid options
    * are IPV4 or IPV6. This can only be specified for an external global
    * forwarding rule.
    */
  var ipVersion: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#forwardingRule for
    * Forwarding Rule resources.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A fingerprint for the labels being applied to this resource, which is
    * essentially a hash of the labels set used for optimistic locking. The
    * fingerprint is initially generated by Compute Engine and changes after
    * every request to modify or update labels. You must always provide an
    * up-to-date fingerprint hash in order to update or change labels,
    * otherwise the request will fail with error 412 conditionNotMet.  To see
    * the latest fingerprint, make a get() request to retrieve a
    * ForwardingRule.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  /**
    * Labels to apply to this resource. These can be later modified by the
    * setLabels method. Each label key/value pair must comply with RFC1035.
    * Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * This signifies what the ForwardingRule will be used for and can only take
    * the following values: INTERNAL, INTERNAL_SELF_MANAGED, EXTERNAL. The
    * value of INTERNAL means that this will be used for Internal Network Load
    * Balancing (TCP, UDP). The value of INTERNAL_SELF_MANAGED means that this
    * will be used for Internal Global HTTP(S) LB. The value of EXTERNAL means
    * that this will be used for External Load Balancing (HTTP(S) LB, External
    * TCP/UDP LB, SSL Proxy)
    */
  var loadBalancingScheme: js.UndefOr[String] = js.native
  /**
    * Opaque filter criteria used by Loadbalancer to restrict routing
    * configuration to a limited set xDS compliant clients. In their xDS
    * requests to Loadbalancer, xDS clients present node metadata. If a match
    * takes place, the relevant routing configuration is made available to
    * those proxies. For each metadataFilter in this list, if its
    * filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels
    * must match the corresponding label provided in the metadata. If its
    * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels
    * must match with corresponding labels in the provided metadata.
    * metadataFilters specified here can be overridden by those specified in
    * the UrlMap that this ForwardingRule references. metadataFilters only
    * applies to Loadbalancers that have their loadBalancingScheme set to
    * INTERNAL_SELF_MANAGED.
    */
  var metadataFilters: js.UndefOr[js.Array[SchemaMetadataFilter]] = js.native
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This field is not used for external load balancing.  For INTERNAL and
    * INTERNAL_SELF_MANAGED load balancing, this field identifies the network
    * that the load balanced IP should belong to for this Forwarding Rule. If
    * this field is not specified, the default network will be used.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * This signifies the networking tier used for configuring this load
    * balancer and can only take the following values: PREMIUM , STANDARD.  For
    * regional ForwardingRule, the valid values are PREMIUM and STANDARD. For
    * GlobalForwardingRule, the valid value is PREMIUM.  If this field is not
    * specified, it is assumed to be PREMIUM. If IPAddress is specified, this
    * value must be equal to the networkTier of the Address.
    */
  var networkTier: js.UndefOr[String] = js.native
  /**
    * This field is used along with the target field for TargetHttpProxy,
    * TargetHttpsProxy, TargetSslProxy, TargetTcpProxy, TargetVpnGateway,
    * TargetPool, TargetInstance.  Applicable only when IPProtocol is TCP, UDP,
    * or SCTP, only packets addressed to ports in the specified range will be
    * forwarded to target. Forwarding rules with the same [IPAddress,
    * IPProtocol] pair must have disjoint port ranges.  Some types of
    * forwarding target have constraints on the acceptable ports:   -
    * TargetHttpProxy: 80, 8080  - TargetHttpsProxy: 443  - TargetTcpProxy: 25,
    * 43, 110, 143, 195, 443, 465, 587, 700, 993, 995, 1688, 1883, 5222  -
    * TargetSslProxy: 25, 43, 110, 143, 195, 443, 465, 587, 700, 993, 995,
    * 1688, 1883, 5222  - TargetVpnGateway: 500, 4500
    */
  var portRange: js.UndefOr[String] = js.native
  /**
    * This field is used along with the backend_service field for internal load
    * balancing.  When the load balancing scheme is INTERNAL, a list of ports
    * can be configured, for example, [&#39;80&#39;],
    * [&#39;8000&#39;,&#39;9000&#39;] etc. Only packets addressed to these
    * ports will be forwarded to the backends configured with this forwarding
    * rule.  You may specify a maximum of up to 5 ports.
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] URL of the region where the regional forwarding rule
    * resides. This field is not applicable to global forwarding rules. You
    * must specify this field as part of the HTTP request URL. It is not
    * settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * An optional prefix to the service name for this Forwarding Rule. If
    * specified, will be the first label of the fully qualified service name.
    * The label must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the label must be 1-63 characters long and match the
    * regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
    * character must be a lowercase letter, and all following characters must
    * be a dash, lowercase letter, or digit, except the last character, which
    * cannot be a dash.  This field is only used for internal load balancing.
    */
  var serviceLabel: js.UndefOr[String] = js.native
  /**
    * [Output Only] The internal fully qualified service name for this
    * Forwarding Rule.  This field is only used for internal load balancing.
    */
  var serviceName: js.UndefOr[String] = js.native
  /**
    * This field is only used for INTERNAL load balancing.  For internal load
    * balancing, this field identifies the subnetwork that the load balanced IP
    * should belong to for this Forwarding Rule.  If the network specified is
    * in auto subnet mode, this field is optional. However, if the network is
    * in custom subnet mode, a subnetwork must be specified.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * The URL of the target resource to receive the matched traffic. For
    * regional forwarding rules, this target must live in the same region as
    * the forwarding rule. For global forwarding rules, this target must be a
    * global load balancing resource. The forwarded traffic must be of a type
    * appropriate to the target object. For INTERNAL_SELF_MANAGED load
    * balancing, only HTTP and HTTPS targets are valid.
    */
  var target: js.UndefOr[String] = js.native
}

object SchemaForwardingRule {
  @scala.inline
  def apply(
    IPAddress: String = null,
    IPProtocol: String = null,
    allPorts: js.UndefOr[Boolean] = js.undefined,
    allowGlobalAccess: js.UndefOr[Boolean] = js.undefined,
    backendService: String = null,
    creationTimestamp: String = null,
    description: String = null,
    fingerprint: String = null,
    id: String = null,
    ipVersion: String = null,
    kind: String = null,
    labelFingerprint: String = null,
    labels: StringDictionary[String] = null,
    loadBalancingScheme: String = null,
    metadataFilters: js.Array[SchemaMetadataFilter] = null,
    name: String = null,
    network: String = null,
    networkTier: String = null,
    portRange: String = null,
    ports: js.Array[String] = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    serviceLabel: String = null,
    serviceName: String = null,
    subnetwork: String = null,
    target: String = null
  ): SchemaForwardingRule = {
    val __obj = js.Dynamic.literal()
    if (IPAddress != null) __obj.updateDynamic("IPAddress")(IPAddress.asInstanceOf[js.Any])
    if (IPProtocol != null) __obj.updateDynamic("IPProtocol")(IPProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(allPorts)) __obj.updateDynamic("allPorts")(allPorts.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGlobalAccess)) __obj.updateDynamic("allowGlobalAccess")(allowGlobalAccess.asInstanceOf[js.Any])
    if (backendService != null) __obj.updateDynamic("backendService")(backendService.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipVersion != null) __obj.updateDynamic("ipVersion")(ipVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (loadBalancingScheme != null) __obj.updateDynamic("loadBalancingScheme")(loadBalancingScheme.asInstanceOf[js.Any])
    if (metadataFilters != null) __obj.updateDynamic("metadataFilters")(metadataFilters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (networkTier != null) __obj.updateDynamic("networkTier")(networkTier.asInstanceOf[js.Any])
    if (portRange != null) __obj.updateDynamic("portRange")(portRange.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (serviceLabel != null) __obj.updateDynamic("serviceLabel")(serviceLabel.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaForwardingRule]
  }
}

