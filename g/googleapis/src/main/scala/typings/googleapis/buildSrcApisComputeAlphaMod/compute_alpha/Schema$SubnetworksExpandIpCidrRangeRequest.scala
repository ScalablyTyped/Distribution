package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SubnetworksExpandIpCidrRangeRequest extends js.Object {
  /**
    * The IP (in CIDR format or netmask) of internal addresses that are legal
    * on this Subnetwork. This range should be disjoint from other subnetworks
    * within this network. This range can only be larger than (i.e. a superset
    * of) the range previously defined before the update.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * The type of IP CIDR range to associate with this subnetwork. The default
    * is RFC_1918. When expanding to a non-RFC 1918 range, this field must be
    * be set to NON_RFC_1918.
    */
  var rangeType: js.UndefOr[String] = js.native
}

object Schema$SubnetworksExpandIpCidrRangeRequest {
  @scala.inline
  def apply(ipCidrRange: String = null, rangeType: String = null): Schema$SubnetworksExpandIpCidrRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (rangeType != null) __obj.updateDynamic("rangeType")(rangeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubnetworksExpandIpCidrRangeRequest]
  }
}

