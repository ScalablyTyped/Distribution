package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealServingMetadata extends js.Object {
  /**
    * True if alcohol ads are allowed for this deal (read-only). This field is only populated when querying for finalized orders using the method
    * GetFinalizedOrderDeals
    */
  var alcoholAdsAllowed: js.UndefOr[Boolean] = js.undefined
  /** Tracks which parties (if any) have paused a deal. (readonly, except via PauseResumeOrderDeals action) */
  var dealPauseStatus: js.UndefOr[DealServingMetadataDealPauseStatus] = js.undefined
}

object DealServingMetadata {
  @scala.inline
  def apply(
    alcoholAdsAllowed: js.UndefOr[Boolean] = js.undefined,
    dealPauseStatus: DealServingMetadataDealPauseStatus = null
  ): DealServingMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alcoholAdsAllowed)) __obj.updateDynamic("alcoholAdsAllowed")(alcoholAdsAllowed.asInstanceOf[js.Any])
    if (dealPauseStatus != null) __obj.updateDynamic("dealPauseStatus")(dealPauseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DealServingMetadata]
  }
}

