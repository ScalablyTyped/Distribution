package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOffersResponse extends js.Object {
  /** Available Offers to be distributed. */
  var availableOffers: js.UndefOr[js.Array[AvailableOffer]] = js.native
  /** Reason why no Offers are available. */
  var noOfferReason: js.UndefOr[String] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
}

object ListOffersResponse {
  @scala.inline
  def apply(): ListOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOffersResponse]
  }
  @scala.inline
  implicit class ListOffersResponseOps[Self <: ListOffersResponse] (val x: Self) extends AnyVal {
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
    def setAvailableOffersVarargs(value: AvailableOffer*): Self = this.set("availableOffers", js.Array(value :_*))
    @scala.inline
    def setAvailableOffers(value: js.Array[AvailableOffer]): Self = this.set("availableOffers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableOffers: Self = this.set("availableOffers", js.undefined)
    @scala.inline
    def setNoOfferReason(value: String): Self = this.set("noOfferReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoOfferReason: Self = this.set("noOfferReason", js.undefined)
    @scala.inline
    def setResponseMetadata(value: ResponseMetadata): Self = this.set("responseMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMetadata: Self = this.set("responseMetadata", js.undefined)
  }
  
}

