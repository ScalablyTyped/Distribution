package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferCustomer extends js.Object {
  /** URL to the customer's AdWords page. */
  var adwordsUrl: js.UndefOr[String] = js.native
  /** Country code of the customer. */
  var countryCode: js.UndefOr[String] = js.native
  /** Time the customer was created. */
  var creationTime: js.UndefOr[String] = js.native
  /** Days the customer is still eligible. */
  var eligibilityDaysLeft: js.UndefOr[Double] = js.native
  /** External CID for the customer. */
  var externalCid: js.UndefOr[String] = js.native
  /** Formatted Get Y amount with currency code. */
  var getYAmount: js.UndefOr[String] = js.native
  /** Name of the customer. */
  var name: js.UndefOr[String] = js.native
  /** Type of the offer */
  var offerType: js.UndefOr[String] = js.native
  /** Formatted Spend X amount with currency code. */
  var spendXAmount: js.UndefOr[String] = js.native
}

object OfferCustomer {
  @scala.inline
  def apply(): OfferCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferCustomer]
  }
  @scala.inline
  implicit class OfferCustomerOps[Self <: OfferCustomer] (val x: Self) extends AnyVal {
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
    def setAdwordsUrl(value: String): Self = this.set("adwordsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdwordsUrl: Self = this.set("adwordsUrl", js.undefined)
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setEligibilityDaysLeft(value: Double): Self = this.set("eligibilityDaysLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEligibilityDaysLeft: Self = this.set("eligibilityDaysLeft", js.undefined)
    @scala.inline
    def setExternalCid(value: String): Self = this.set("externalCid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalCid: Self = this.set("externalCid", js.undefined)
    @scala.inline
    def setGetYAmount(value: String): Self = this.set("getYAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetYAmount: Self = this.set("getYAmount", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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

