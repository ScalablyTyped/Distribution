package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AliasIpRange extends js.Object {
  /**
               * The IP CIDR range represented by this alias IP range. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses
               * reserved by system or used by other network interfaces. This range may be a single IP address (e.g. 10.2.3.4), a netmask (e.g. /24) or a CIDR format
               * string (e.g. 10.1.2.0/24).
               */
  var ipCidrRange: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional subnetwork secondary range name specifying the secondary range from which to allocate the IP CIDR range for this alias IP range. If left
               * unspecified, the primary range of the subnetwork will be used.
               */
  var subnetworkRangeName: js.UndefOr[java.lang.String] = js.undefined
}

