package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOrdersRequest extends js.Object {
  /** The list of proposals to create. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.undefined
  /** Web property id of the seller creating these orders */
  var webPropertyCode: js.UndefOr[java.lang.String] = js.undefined
}

object CreateOrdersRequest {
  @scala.inline
  def apply(proposals: js.Array[Proposal] = null, webPropertyCode: java.lang.String = null): CreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    if (proposals != null) __obj.updateDynamic("proposals")(proposals)
    if (webPropertyCode != null) __obj.updateDynamic("webPropertyCode")(webPropertyCode)
    __obj.asInstanceOf[CreateOrdersRequest]
  }
}

