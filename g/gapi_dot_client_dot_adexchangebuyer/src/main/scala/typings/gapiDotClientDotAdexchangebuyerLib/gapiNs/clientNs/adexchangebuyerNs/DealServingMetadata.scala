package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DealServingMetadata extends js.Object {
  /**
               * True if alcohol ads are allowed for this deal (read-only). This field is only populated when querying for finalized orders using the method
               * GetFinalizedOrderDeals
               */
  var alcoholAdsAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /** Tracks which parties (if any) have paused a deal. (readonly, except via PauseResumeOrderDeals action) */
  var dealPauseStatus: js.UndefOr[DealServingMetadataDealPauseStatus] = js.undefined
}

