package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

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
    if (proposals != null) __obj.updateDynamic("proposals")(proposals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrdersResponse]
  }
}

