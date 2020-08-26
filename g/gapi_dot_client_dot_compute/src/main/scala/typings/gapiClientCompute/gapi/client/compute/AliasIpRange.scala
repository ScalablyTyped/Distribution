package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasIpRange extends js.Object {
  /**
    * The IP CIDR range represented by this alias IP range. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses
    * reserved by system or used by other network interfaces. This range may be a single IP address (e.g. 10.2.3.4), a netmask (e.g. /24) or a CIDR format
    * string (e.g. 10.1.2.0/24).
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * Optional subnetwork secondary range name specifying the secondary range from which to allocate the IP CIDR range for this alias IP range. If left
    * unspecified, the primary range of the subnetwork will be used.
    */
  var subnetworkRangeName: js.UndefOr[String] = js.native
}

object AliasIpRange {
  @scala.inline
  def apply(): AliasIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasIpRange]
  }
  @scala.inline
  implicit class AliasIpRangeOps[Self <: AliasIpRange] (val x: Self) extends AnyVal {
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
    def setIpCidrRange(value: String): Self = this.set("ipCidrRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpCidrRange: Self = this.set("ipCidrRange", js.undefined)
    @scala.inline
    def setSubnetworkRangeName(value: String): Self = this.set("subnetworkRangeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetworkRangeName: Self = this.set("subnetworkRangeName", js.undefined)
  }
  
}

