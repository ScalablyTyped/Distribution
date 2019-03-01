package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealServingMetadataDealPauseStatus extends js.Object {
  var buyerPauseReason: js.UndefOr[java.lang.String] = js.undefined
  /** If the deal is paused, records which party paused the deal first. */
  var firstPausedBy: js.UndefOr[java.lang.String] = js.undefined
  var hasBuyerPaused: js.UndefOr[scala.Boolean] = js.undefined
  var hasSellerPaused: js.UndefOr[scala.Boolean] = js.undefined
  var sellerPauseReason: js.UndefOr[java.lang.String] = js.undefined
}

object DealServingMetadataDealPauseStatus {
  @scala.inline
  def apply(
    buyerPauseReason: java.lang.String = null,
    firstPausedBy: java.lang.String = null,
    hasBuyerPaused: js.UndefOr[scala.Boolean] = js.undefined,
    hasSellerPaused: js.UndefOr[scala.Boolean] = js.undefined,
    sellerPauseReason: java.lang.String = null
  ): DealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    if (buyerPauseReason != null) __obj.updateDynamic("buyerPauseReason")(buyerPauseReason)
    if (firstPausedBy != null) __obj.updateDynamic("firstPausedBy")(firstPausedBy)
    if (!js.isUndefined(hasBuyerPaused)) __obj.updateDynamic("hasBuyerPaused")(hasBuyerPaused)
    if (!js.isUndefined(hasSellerPaused)) __obj.updateDynamic("hasSellerPaused")(hasSellerPaused)
    if (sellerPauseReason != null) __obj.updateDynamic("sellerPauseReason")(sellerPauseReason)
    __obj.asInstanceOf[DealServingMetadataDealPauseStatus]
  }
}

