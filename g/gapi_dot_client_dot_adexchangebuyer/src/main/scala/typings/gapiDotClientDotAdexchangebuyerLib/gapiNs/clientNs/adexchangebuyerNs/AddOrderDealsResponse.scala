package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AddOrderDealsResponse extends js.Object {
  /** List of deals added (in the same proposal as passed in the request) */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  /** The updated revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
}

