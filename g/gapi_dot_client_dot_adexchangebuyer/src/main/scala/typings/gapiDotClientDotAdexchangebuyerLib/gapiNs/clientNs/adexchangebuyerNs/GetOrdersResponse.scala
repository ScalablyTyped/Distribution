package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrdersResponse extends js.Object {
  /** The list of matching proposals. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.undefined
}

object GetOrdersResponse {
  @scala.inline
  def apply(proposals: js.Array[Proposal] = null): GetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals)
    __obj.asInstanceOf[GetOrdersResponse]
  }
}

