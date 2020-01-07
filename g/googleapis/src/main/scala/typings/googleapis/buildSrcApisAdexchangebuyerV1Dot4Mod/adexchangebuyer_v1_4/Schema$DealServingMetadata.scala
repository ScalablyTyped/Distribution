package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DealServingMetadata extends js.Object {
  /**
    * True if alcohol ads are allowed for this deal (read-only). This field is
    * only populated when querying for finalized orders using the method
    * GetFinalizedOrderDeals
    */
  var alcoholAdsAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Tracks which parties (if any) have paused a deal. (readonly, except via
    * PauseResumeOrderDeals action)
    */
  var dealPauseStatus: js.UndefOr[Schema$DealServingMetadataDealPauseStatus] = js.native
}

object Schema$DealServingMetadata {
  @scala.inline
  def apply(
    alcoholAdsAllowed: js.UndefOr[Boolean] = js.undefined,
    dealPauseStatus: Schema$DealServingMetadataDealPauseStatus = null
  ): Schema$DealServingMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alcoholAdsAllowed)) __obj.updateDynamic("alcoholAdsAllowed")(alcoholAdsAllowed.asInstanceOf[js.Any])
    if (dealPauseStatus != null) __obj.updateDynamic("dealPauseStatus")(dealPauseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DealServingMetadata]
  }
}

