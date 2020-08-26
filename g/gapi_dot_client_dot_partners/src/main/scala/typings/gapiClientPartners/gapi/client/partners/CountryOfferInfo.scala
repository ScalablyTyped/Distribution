package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryOfferInfo extends js.Object {
  /** (localized) Get Y amount for that country's offer. */
  var getYAmount: js.UndefOr[String] = js.native
  /** Country code for which offer codes may be requested. */
  var offerCountryCode: js.UndefOr[String] = js.native
  /** Type of offer country is eligible for. */
  var offerType: js.UndefOr[String] = js.native
  /** (localized) Spend X amount for that country's offer. */
  var spendXAmount: js.UndefOr[String] = js.native
}

object CountryOfferInfo {
  @scala.inline
  def apply(): CountryOfferInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryOfferInfo]
  }
  @scala.inline
  implicit class CountryOfferInfoOps[Self <: CountryOfferInfo] (val x: Self) extends AnyVal {
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
    def setGetYAmount(value: String): Self = this.set("getYAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetYAmount: Self = this.set("getYAmount", js.undefined)
    @scala.inline
    def setOfferCountryCode(value: String): Self = this.set("offerCountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferCountryCode: Self = this.set("offerCountryCode", js.undefined)
    @scala.inline
    def setOfferType(value: String): Self = this.set("offerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferType: Self = this.set("offerType", js.undefined)
    @scala.inline
    def setSpendXAmount(value: String): Self = this.set("spendXAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpendXAmount: Self = this.set("spendXAmount", js.undefined)
  }
  
}

