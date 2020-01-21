package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Secondary IP range of a usable subnetwork.
  */
@js.native
trait SchemaUsableSubnetworkSecondaryRange extends js.Object {
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance. The name must be 1-63
    * characters long, and comply with RFC1035. The name must be unique within
    * the subnetwork.
    */
  var rangeName: js.UndefOr[String] = js.native
}

object SchemaUsableSubnetworkSecondaryRange {
  @scala.inline
  def apply(ipCidrRange: String = null, rangeName: String = null): SchemaUsableSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (rangeName != null) __obj.updateDynamic("rangeName")(rangeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUsableSubnetworkSecondaryRange]
  }
}

