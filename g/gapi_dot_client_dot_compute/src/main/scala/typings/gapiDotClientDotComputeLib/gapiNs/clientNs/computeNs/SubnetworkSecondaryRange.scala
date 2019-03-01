package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworkSecondaryRange extends js.Object {
  /**
    * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and
    * non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported.
    */
  var ipCidrRange: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long,
    * and comply with RFC1035. The name must be unique within the subnetwork.
    */
  var rangeName: js.UndefOr[java.lang.String] = js.undefined
}

object SubnetworkSecondaryRange {
  @scala.inline
  def apply(ipCidrRange: java.lang.String = null, rangeName: java.lang.String = null): SubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange)
    if (rangeName != null) __obj.updateDynamic("rangeName")(rangeName)
    __obj.asInstanceOf[SubnetworkSecondaryRange]
  }
}

