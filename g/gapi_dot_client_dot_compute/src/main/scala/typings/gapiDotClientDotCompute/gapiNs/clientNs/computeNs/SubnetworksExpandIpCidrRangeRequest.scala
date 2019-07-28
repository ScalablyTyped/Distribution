package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksExpandIpCidrRangeRequest extends js.Object {
  /**
    * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork. This range should be disjoint from other subnetworks within
    * this network. This range can only be larger than (i.e. a superset of) the range previously defined before the update.
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
}

object SubnetworksExpandIpCidrRangeRequest {
  @scala.inline
  def apply(ipCidrRange: String = null): SubnetworksExpandIpCidrRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange)
    __obj.asInstanceOf[SubnetworksExpandIpCidrRangeRequest]
  }
}

