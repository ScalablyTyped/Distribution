package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableOffer extends js.Object {
  /** The number of codes for this offer that are available for distribution. */
  var available: js.UndefOr[Double] = js.native
  /** Offer info by country. */
  var countryOfferInfos: js.UndefOr[js.Array[CountryOfferInfo]] = js.native
  /** Description of the offer. */
  var description: js.UndefOr[String] = js.native
  /** ID of this offer. */
  var id: js.UndefOr[String] = js.native
  /** The maximum age of an account [in days] to be eligible. */
  var maxAccountAge: js.UndefOr[Double] = js.native
  /** Name of the offer. */
  var name: js.UndefOr[String] = js.native
  /** Level of this offer. */
  var offerLevel: js.UndefOr[String] = js.native
  /** Type of offer. */
  var offerType: js.UndefOr[String] = js.native
  /** Customers who qualify for this offer. */
  var qualifiedCustomer: js.UndefOr[js.Array[OfferCustomer]] = js.native
  /** Whether or not the list of qualified customers is definitely complete. */
  var qualifiedCustomersComplete: js.UndefOr[Boolean] = js.native
  /** Should special text be shown on the offers page. */
  var showSpecialOfferCopy: js.UndefOr[Boolean] = js.native
  /** Terms of the offer. */
  var terms: js.UndefOr[String] = js.native
}

object AvailableOffer {
  @scala.inline
  def apply(): AvailableOffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailableOffer]
  }
  @scala.inline
  implicit class AvailableOfferOps[Self <: AvailableOffer] (val x: Self) extends AnyVal {
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
    def setAvailable(value: Double): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailable: Self = this.set("available", js.undefined)
    @scala.inline
    def setCountryOfferInfosVarargs(value: CountryOfferInfo*): Self = this.set("countryOfferInfos", js.Array(value :_*))
    @scala.inline
    def setCountryOfferInfos(value: js.Array[CountryOfferInfo]): Self = this.set("countryOfferInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryOfferInfos: Self = this.set("countryOfferInfos", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxAccountAge(value: Double): Self = this.set("maxAccountAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAccountAge: Self = this.set("maxAccountAge", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOfferLevel(value: String): Self = this.set("offerLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferLevel: Self = this.set("offerLevel", js.undefined)
    @scala.inline
    def setOfferType(value: String): Self = this.set("offerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferType: Self = this.set("offerType", js.undefined)
    @scala.inline
    def setQualifiedCustomerVarargs(value: OfferCustomer*): Self = this.set("qualifiedCustomer", js.Array(value :_*))
    @scala.inline
    def setQualifiedCustomer(value: js.Array[OfferCustomer]): Self = this.set("qualifiedCustomer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifiedCustomer: Self = this.set("qualifiedCustomer", js.undefined)
    @scala.inline
    def setQualifiedCustomersComplete(value: Boolean): Self = this.set("qualifiedCustomersComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifiedCustomersComplete: Self = this.set("qualifiedCustomersComplete", js.undefined)
    @scala.inline
    def setShowSpecialOfferCopy(value: Boolean): Self = this.set("showSpecialOfferCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSpecialOfferCopy: Self = this.set("showSpecialOfferCopy", js.undefined)
    @scala.inline
    def setTerms(value: String): Self = this.set("terms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
  }
  
}

