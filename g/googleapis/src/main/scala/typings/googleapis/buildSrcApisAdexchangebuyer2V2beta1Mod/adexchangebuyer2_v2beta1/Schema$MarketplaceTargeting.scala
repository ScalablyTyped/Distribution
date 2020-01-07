package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Targeting represents different criteria that can be used by advertisers to
  * target ad inventory. For example, they can choose to target ad requests
  * only if the user is in the US. Multiple types of targeting are always
  * applied as a logical AND, unless noted otherwise.
  */
@js.native
trait Schema$MarketplaceTargeting extends js.Object {
  /**
    * Geo criteria IDs to be included/excluded.
    */
  var geoTargeting: js.UndefOr[Schema$CriteriaTargeting] = js.native
  /**
    * Inventory sizes to be included/excluded.
    */
  var inventorySizeTargeting: js.UndefOr[Schema$InventorySizeTargeting] = js.native
  /**
    * Placement targeting information, e.g., URL, mobile applications.
    */
  var placementTargeting: js.UndefOr[Schema$PlacementTargeting] = js.native
  /**
    * Technology targeting information, e.g., operating system, device
    * category.
    */
  var technologyTargeting: js.UndefOr[Schema$TechnologyTargeting] = js.native
  /**
    * Video targeting information.
    */
  var videoTargeting: js.UndefOr[Schema$VideoTargeting] = js.native
}

object Schema$MarketplaceTargeting {
  @scala.inline
  def apply(
    geoTargeting: Schema$CriteriaTargeting = null,
    inventorySizeTargeting: Schema$InventorySizeTargeting = null,
    placementTargeting: Schema$PlacementTargeting = null,
    technologyTargeting: Schema$TechnologyTargeting = null,
    videoTargeting: Schema$VideoTargeting = null
  ): Schema$MarketplaceTargeting = {
    val __obj = js.Dynamic.literal()
    if (geoTargeting != null) __obj.updateDynamic("geoTargeting")(geoTargeting.asInstanceOf[js.Any])
    if (inventorySizeTargeting != null) __obj.updateDynamic("inventorySizeTargeting")(inventorySizeTargeting.asInstanceOf[js.Any])
    if (placementTargeting != null) __obj.updateDynamic("placementTargeting")(placementTargeting.asInstanceOf[js.Any])
    if (technologyTargeting != null) __obj.updateDynamic("technologyTargeting")(technologyTargeting.asInstanceOf[js.Any])
    if (videoTargeting != null) __obj.updateDynamic("videoTargeting")(videoTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MarketplaceTargeting]
  }
}

