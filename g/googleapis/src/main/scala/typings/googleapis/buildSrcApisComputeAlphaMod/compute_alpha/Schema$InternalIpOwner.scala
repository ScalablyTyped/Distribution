package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InternalIpOwner extends js.Object {
  /**
    * IP CIDR range being owned.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * URLs of the IP owners of the IP CIDR range.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether this IP CIDR range is reserved for system use.
    */
  var systemOwned: js.UndefOr[Boolean] = js.native
}

object Schema$InternalIpOwner {
  @scala.inline
  def apply(
    ipCidrRange: String = null,
    owners: js.Array[String] = null,
    systemOwned: js.UndefOr[Boolean] = js.undefined
  ): Schema$InternalIpOwner = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (!js.isUndefined(systemOwned)) __obj.updateDynamic("systemOwned")(systemOwned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InternalIpOwner]
  }
}

