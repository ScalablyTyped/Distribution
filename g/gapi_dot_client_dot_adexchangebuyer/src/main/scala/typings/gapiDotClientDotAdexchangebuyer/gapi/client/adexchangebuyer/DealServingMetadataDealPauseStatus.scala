package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealServingMetadataDealPauseStatus extends js.Object {
  var buyerPauseReason: js.UndefOr[String] = js.undefined
  /** If the deal is paused, records which party paused the deal first. */
  var firstPausedBy: js.UndefOr[String] = js.undefined
  var hasBuyerPaused: js.UndefOr[Boolean] = js.undefined
  var hasSellerPaused: js.UndefOr[Boolean] = js.undefined
  var sellerPauseReason: js.UndefOr[String] = js.undefined
}

object DealServingMetadataDealPauseStatus {
  @scala.inline
  def apply(
    buyerPauseReason: String = null,
    firstPausedBy: String = null,
    hasBuyerPaused: js.UndefOr[Boolean] = js.undefined,
    hasSellerPaused: js.UndefOr[Boolean] = js.undefined,
    sellerPauseReason: String = null
  ): DealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    if (buyerPauseReason != null) __obj.updateDynamic("buyerPauseReason")(buyerPauseReason.asInstanceOf[js.Any])
    if (firstPausedBy != null) __obj.updateDynamic("firstPausedBy")(firstPausedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBuyerPaused)) __obj.updateDynamic("hasBuyerPaused")(hasBuyerPaused.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSellerPaused)) __obj.updateDynamic("hasSellerPaused")(hasSellerPaused.asInstanceOf[js.Any])
    if (sellerPauseReason != null) __obj.updateDynamic("sellerPauseReason")(sellerPauseReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DealServingMetadataDealPauseStatus]
  }
}

