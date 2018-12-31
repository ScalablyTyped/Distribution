package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subnetwork extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output Only] The gateway address for default routes to reach destination addresses outside this subnetwork. This field can be set only at resource
    * creation time.
    */
  var gatewayAddress: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or
    * 192.168.0.0/16. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field can be set only at resource creation
    * time.
    */
  var ipCidrRange: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. Only networks that are in the
    * distributed mode can have subnetworks. This field can be set only at resource creation time.
    */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time
    * and updated using setPrivateIpGoogleAccess.
    */
  var privateIpGoogleAccess: js.UndefOr[scala.Boolean] = js.undefined
  /** URL of the region where the Subnetwork resides. This field can be set only at resource creation time. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary
    * ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SubnetworkSecondaryRange]] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

