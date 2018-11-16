package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditAllOrderDealsResponse extends js.Object {
  /** List of all deals in the proposal after edit. */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  /** The latest revision number after the update has been applied. */
  var orderRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
}

