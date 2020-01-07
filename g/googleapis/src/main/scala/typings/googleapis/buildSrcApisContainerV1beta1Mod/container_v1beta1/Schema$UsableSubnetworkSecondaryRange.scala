package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Secondary IP range of a usable subnetwork.
  */
@js.native
trait Schema$UsableSubnetworkSecondaryRange extends js.Object {
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance.
    */
  var rangeName: js.UndefOr[String] = js.native
  /**
    * This field is to determine the status of the secondary range
    * programmably.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$UsableSubnetworkSecondaryRange {
  @scala.inline
  def apply(ipCidrRange: String = null, rangeName: String = null, status: String = null): Schema$UsableSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (rangeName != null) __obj.updateDynamic("rangeName")(rangeName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UsableSubnetworkSecondaryRange]
  }
}

