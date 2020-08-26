package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreferredDeal extends js.Object {
  /** The name of the advertiser this deal is for. */
  var advertiserName: js.UndefOr[String] = js.native
  /** The name of the buyer network this deal is for. */
  var buyerNetworkName: js.UndefOr[String] = js.native
  /** The currency code that applies to the fixed_cpm value. If not set then assumed to be USD. */
  var currencyCode: js.UndefOr[String] = js.native
  /** Time when this deal stops being active in seconds since the epoch (GMT). If not set then this deal is valid until manually disabled by the publisher. */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The fixed price for this preferred deal. In cpm micros of currency according to currencyCode. If set, then this preferred deal is eligible for the
    * fixed price tier of buying (highest priority, pay exactly the configured fixed price).
    */
  var fixedCpm: js.UndefOr[String] = js.native
  /** Unique identifier of this preferred deal. */
  var id: js.UndefOr[String] = js.native
  /** Kind of resource this is, in this case adexchangeseller#preferredDeal. */
  var kind: js.UndefOr[String] = js.native
  /** Time when this deal becomes active in seconds since the epoch (GMT). If not set then this deal is active immediately upon creation. */
  var startTime: js.UndefOr[String] = js.native
}

object PreferredDeal {
  @scala.inline
  def apply(): PreferredDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreferredDeal]
  }
  @scala.inline
  implicit class PreferredDealOps[Self <: PreferredDeal] (val x: Self) extends AnyVal {
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
    def setAdvertiserName(value: String): Self = this.set("advertiserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserName: Self = this.set("advertiserName", js.undefined)
    @scala.inline
    def setBuyerNetworkName(value: String): Self = this.set("buyerNetworkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerNetworkName: Self = this.set("buyerNetworkName", js.undefined)
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setFixedCpm(value: String): Self = this.set("fixedCpm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedCpm: Self = this.set("fixedCpm", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

