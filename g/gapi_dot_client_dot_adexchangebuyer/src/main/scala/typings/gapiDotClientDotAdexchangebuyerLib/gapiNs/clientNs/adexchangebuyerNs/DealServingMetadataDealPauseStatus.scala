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

