package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInternalIpOwner extends js.Object {
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

object SchemaInternalIpOwner {
  @scala.inline
  def apply(
    ipCidrRange: String = null,
    owners: js.Array[String] = null,
    systemOwned: js.UndefOr[Boolean] = js.undefined
  ): SchemaInternalIpOwner = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (!js.isUndefined(systemOwned)) __obj.updateDynamic("systemOwned")(systemOwned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInternalIpOwner]
  }
}

