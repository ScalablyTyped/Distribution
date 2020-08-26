package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditAllOrderDealsResponse extends js.Object {
  /** List of all deals in the proposal after edit. */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  /** The latest revision number after the update has been applied. */
  var orderRevisionNumber: js.UndefOr[String] = js.native
}

object EditAllOrderDealsResponse {
  @scala.inline
  def apply(): EditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAllOrderDealsResponse]
  }
  @scala.inline
  implicit class EditAllOrderDealsResponseOps[Self <: EditAllOrderDealsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDealsVarargs(value: MarketplaceDeal*): Self = this.set("deals", js.Array(value :_*))
    @scala.inline
    def setDeals(value: js.Array[MarketplaceDeal]): Self = this.set("deals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeals: Self = this.set("deals", js.undefined)
    @scala.inline
    def setOrderRevisionNumber(value: String): Self = this.set("orderRevisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderRevisionNumber: Self = this.set("orderRevisionNumber", js.undefined)
  }
  
}

