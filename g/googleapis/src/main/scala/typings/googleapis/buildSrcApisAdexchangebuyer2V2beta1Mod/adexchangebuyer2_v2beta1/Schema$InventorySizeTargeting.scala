package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the size of an ad unit that can be targeted on an ad request. It
  * only applies to Private Auction, AdX Preferred Deals and Auction Packages.
  * This targeting does not apply to Programmatic Guaranteed and Preferred
  * Deals in Ad Manager.
  */
@js.native
trait Schema$InventorySizeTargeting extends js.Object {
  /**
    * A list of inventory sizes to be excluded.
    */
  var excludedInventorySizes: js.UndefOr[js.Array[Schema$AdSize]] = js.native
  /**
    * A list of inventory sizes to be included.
    */
  var targetedInventorySizes: js.UndefOr[js.Array[Schema$AdSize]] = js.native
}

object Schema$InventorySizeTargeting {
  @scala.inline
  def apply(
    excludedInventorySizes: js.Array[Schema$AdSize] = null,
    targetedInventorySizes: js.Array[Schema$AdSize] = null
  ): Schema$InventorySizeTargeting = {
    val __obj = js.Dynamic.literal()
    if (excludedInventorySizes != null) __obj.updateDynamic("excludedInventorySizes")(excludedInventorySizes.asInstanceOf[js.Any])
    if (targetedInventorySizes != null) __obj.updateDynamic("targetedInventorySizes")(targetedInventorySizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InventorySizeTargeting]
  }
}

