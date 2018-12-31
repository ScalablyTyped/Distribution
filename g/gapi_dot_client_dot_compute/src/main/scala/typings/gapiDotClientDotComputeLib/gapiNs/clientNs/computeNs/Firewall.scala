package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Firewall extends js.Object {
  /** The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection. */
  var allowed: js.UndefOr[js.Array[gapiDotClientDotComputeLib.Anon_IPProtocol]] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection. */
  var denied: js.UndefOr[js.Array[gapiDotClientDotComputeLib.Anon_IPProtocol]] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If destination ranges are specified, the firewall will apply only to traffic that has destination IP address in these ranges. These ranges must be
    * expressed in CIDR format. Only IPv4 is supported.
    */
  var destinationRanges: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Direction of traffic to which this firewall applies; default is INGRESS. Note: For INGRESS traffic, it is NOT supported to specify destinationRanges;
    * For EGRESS traffic, it is NOT supported to specify sourceRanges OR sourceTags.
    */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#firewall for firewall rules. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used:
    * global/networks/default
    * If you choose to specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs:
    * - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network
    * - projects/myproject/global/networks/my-network
    * - global/networks/default
    */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Priority for this rule. This is an integer between 0 and 65535, both inclusive. When not specified, the value assumed is 1000. Relative priorities
    * determine precedence of conflicting rules. Lower value of priority implies higher precedence (eg, a rule with priority 0 has higher precedence than a
    * rule with priority 1). DENY rules take precedence over ALLOW rules having equal priority.
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If source ranges are specified, the firewall will apply only to traffic that has source IP address in these ranges. These ranges must be expressed in
    * CIDR format. One or both of sourceRanges and sourceTags may be set. If both properties are set, the firewall will apply to traffic that has source IP
    * address within sourceRanges OR the source IP that belongs to a tag listed in the sourceTags property. The connection does not need to match both
    * properties for the firewall to apply. Only IPv4 is supported.
    */
  var sourceRanges: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that
    * have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to
    * traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and
    * sourceTags may be set. If both properties are set, the firewall will apply to traffic that has source IP address within sourceRanges OR the source IP
    * that belongs to a tag listed in the sourceTags property. The connection does not need to match both properties for the firewall to apply.
    */
  var sourceTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A list of instance tags indicating sets of instances located in the network that may make network connections as specified in allowed[]. If no
    * targetTags are specified, the firewall rule applies to all instances on the specified network.
    */
  var targetTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

