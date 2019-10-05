package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrderDealsResponse extends js.Object {
  /** List of deals for the proposal */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
}

object GetOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[MarketplaceDeal] = null): GetOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals)
    __obj.asInstanceOf[GetOrderDealsResponse]
  }
}

