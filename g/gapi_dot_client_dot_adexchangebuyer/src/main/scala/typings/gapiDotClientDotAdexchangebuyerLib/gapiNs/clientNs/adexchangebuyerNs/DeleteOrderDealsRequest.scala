package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeleteOrderDealsRequest extends js.Object {
  /** List of deals to delete for a given proposal */
  var dealIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The last known proposal revision number. */
  var proposalRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[java.lang.String] = js.undefined
}

