package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subnetwork which the current user has compute.subnetworks.use permission
  * on.
  */
@js.native
trait SchemaUsableSubnetwork extends js.Object {
  /**
    * The range of internal addresses that are owned by this subnetwork.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * Network URL.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Secondary IP ranges.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaUsableSubnetworkSecondaryRange]] = js.native
  /**
    * Subnetwork URL.
    */
  var subnetwork: js.UndefOr[String] = js.native
}

object SchemaUsableSubnetwork {
  @scala.inline
  def apply(
    ipCidrRange: String = null,
    network: String = null,
    secondaryIpRanges: js.Array[SchemaUsableSubnetworkSecondaryRange] = null,
    subnetwork: String = null
  ): SchemaUsableSubnetwork = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (secondaryIpRanges != null) __obj.updateDynamic("secondaryIpRanges")(secondaryIpRanges.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUsableSubnetwork]
  }
}

