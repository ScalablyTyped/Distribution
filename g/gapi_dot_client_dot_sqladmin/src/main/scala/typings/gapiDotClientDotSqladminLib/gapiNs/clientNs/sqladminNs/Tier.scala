package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tier extends js.Object {
  /** The maximum disk size of this tier in bytes. */
  var DiskQuota: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum RAM usage of this tier in bytes. */
  var RAM: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#tier. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The applicable regions for this tier. */
  var region: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** An identifier for the service tier, for example D1, D2 etc. For related information, see Pricing. */
  var tier: js.UndefOr[java.lang.String] = js.undefined
}

object Tier {
  @scala.inline
  def apply(
    DiskQuota: java.lang.String = null,
    RAM: java.lang.String = null,
    kind: java.lang.String = null,
    region: js.Array[java.lang.String] = null,
    tier: java.lang.String = null
  ): Tier = {
    val __obj = js.Dynamic.literal()
    if (DiskQuota != null) __obj.updateDynamic("DiskQuota")(DiskQuota)
    if (RAM != null) __obj.updateDynamic("RAM")(RAM)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (region != null) __obj.updateDynamic("region")(region)
    if (tier != null) __obj.updateDynamic("tier")(tier)
    __obj.asInstanceOf[Tier]
  }
}

