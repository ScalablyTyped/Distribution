package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOrdersResponse extends js.Object {
  /** The list of proposals successfully created. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.undefined
}

object CreateOrdersResponse {
  @scala.inline
  def apply(proposals: js.Array[Proposal] = null): CreateOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals)
    __obj.asInstanceOf[CreateOrdersResponse]
  }
}

