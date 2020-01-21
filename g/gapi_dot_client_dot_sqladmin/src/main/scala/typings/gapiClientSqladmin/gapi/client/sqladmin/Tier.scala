package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tier extends js.Object {
  /** The maximum disk size of this tier in bytes. */
  var DiskQuota: js.UndefOr[String] = js.undefined
  /** The maximum RAM usage of this tier in bytes. */
  var RAM: js.UndefOr[String] = js.undefined
  /** This is always sql#tier. */
  var kind: js.UndefOr[String] = js.undefined
  /** The applicable regions for this tier. */
  var region: js.UndefOr[js.Array[String]] = js.undefined
  /** An identifier for the service tier, for example D1, D2 etc. For related information, see Pricing. */
  var tier: js.UndefOr[String] = js.undefined
}

object Tier {
  @scala.inline
  def apply(
    DiskQuota: String = null,
    RAM: String = null,
    kind: String = null,
    region: js.Array[String] = null,
    tier: String = null
  ): Tier = {
    val __obj = js.Dynamic.literal()
    if (DiskQuota != null) __obj.updateDynamic("DiskQuota")(DiskQuota.asInstanceOf[js.Any])
    if (RAM != null) __obj.updateDynamic("RAM")(RAM.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tier]
  }
}

