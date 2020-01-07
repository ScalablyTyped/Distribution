package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Cloud SQL service tier resource.
  */
@js.native
trait Schema$Tier extends js.Object {
  /**
    * The maximum disk size of this tier in bytes.
    */
  var DiskQuota: js.UndefOr[String] = js.native
  /**
    * The maximum RAM usage of this tier in bytes.
    */
  var RAM: js.UndefOr[String] = js.native
  /**
    * This is always sql#tier.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The applicable regions for this tier.
    */
  var region: js.UndefOr[js.Array[String]] = js.native
  /**
    * An identifier for the machine type, for example, db-n1-standard-1. For
    * related information, see Pricing.
    */
  var tier: js.UndefOr[String] = js.native
}

object Schema$Tier {
  @scala.inline
  def apply(
    DiskQuota: String = null,
    RAM: String = null,
    kind: String = null,
    region: js.Array[String] = null,
    tier: String = null
  ): Schema$Tier = {
    val __obj = js.Dynamic.literal()
    if (DiskQuota != null) __obj.updateDynamic("DiskQuota")(DiskQuota.asInstanceOf[js.Any])
    if (RAM != null) __obj.updateDynamic("RAM")(RAM.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Tier]
  }
}

