package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdatePrivateAuctionProposalRequest extends js.Object {
  /** The externalDealId of the deal to be updated. */
  var externalDealId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional note to be added. */
  var note: js.UndefOr[MarketplaceNote] = js.undefined
  /** The current revision number of the proposal to be updated. */
  var proposalRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The proposed action on the private auction proposal. */
  var updateAction: js.UndefOr[java.lang.String] = js.undefined
}

